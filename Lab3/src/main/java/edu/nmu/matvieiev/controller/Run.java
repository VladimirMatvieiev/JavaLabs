package edu.nmu.matvieiev.controller;

import edu.nmu.matvieiev.model.*;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
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
    }
}
