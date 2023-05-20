package edu.nmu.matvieiev;

import edu.nmu.matvieiev.controller.JsonManage;
import edu.nmu.matvieiev.model.University;
import edu.nmu.matvieiev.model.*;
import edu.nmu.matvieiev.controller.*;
import org.junit.Assert;

public class Test {

    public void testUniversityEquality() {
        University oldUniversity = createTypicalUniversity();
        String filePath = "university.json";

        JsonManage.toJson(oldUniversity, filePath);

        University newUniversity = JsonManage.fromJson(filePath);

        Assert.assertEquals(oldUniversity, newUniversity);
    }

    private University createTypicalUniversity() {
        University university = UniversityCreator.createUniversity("Національний технічний університет Дніпровська політехніка");

        Faculty faculty = FacultyCreator.createFaculty("Факультет інформаційних технологій");
        university.setFaculty(faculty);

        Department department = DepartmentCreator.createDepartment("Кафедра програмного забезпечення комп'ютерних систем");
        faculty.setDepartment(department);

        Group group = GroupCreator.createGroup("Група 121-20-1");
        department.setGroup(group);

        Student student = StudentCreator.createStudent("Матвєєв", "Володимир", "Євгенович", Sex.MALE);
        group.setStudent(student);

        System.out.println("Ви стоврили свій університет!");
        return university;
    }
}
