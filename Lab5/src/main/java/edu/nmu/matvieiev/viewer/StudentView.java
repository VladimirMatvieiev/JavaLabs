package edu.nmu.matvieiev.viewer;

import edu.nmu.matvieiev.model.Student;
import java.util.List;
public class StudentView {
    public static void view(Student student) {
        System.out.printf("ID: %d%n Student`s name: %s %s %s%n Gradebook: %d%n Birthday: " + student.getBirthday() + "\n\n",
                student.getId(),
                student.getSurname(),
                student.getName(),
                student.getPatronymic(),
                student.getGradebookNum()
        );
    }
    public static void view(List<Student> students) {
        students.stream().forEach(student -> view(student));
    }
}
