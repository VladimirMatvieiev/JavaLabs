package edu.nmu.matvieiev.controller;

import edu.nmu.matvieiev.model.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class StudentController {
    public static List<Student> findStudentsInDb(String fromDate, String toDate) throws SQLException {
        List<Student> students = new ArrayList<>();

        PreparedStatement statement = DBManage.getDbConnection()
                .prepareStatement("SELECT * FROM \"student\" WHERE birthday BETWEEN to_date(?, 'dd.MM.yyyy') and to_date(?, 'dd.MM.yyyy');");

        statement.setString(1, fromDate);
        statement.setString(2, toDate);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            students.add(new Student(resultSet.getInt("id"),resultSet.getString("surname"), resultSet.getString("name"), resultSet.getString("patronymic"), resultSet.getDate("recordBookId"), resultSet.getInt("birthday"))
            );
        }

        resultSet.close();
        statement.close();

        return students;
    }
}
