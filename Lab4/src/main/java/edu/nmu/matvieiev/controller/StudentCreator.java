package edu.nmu.matvieiev.controller;

import edu.nmu.matvieiev.model.*;
public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String middleName, Sex sex) {
        Human head = new Human(firstName, lastName, middleName, sex);
        return new Student(firstName, lastName, middleName, sex);
    }
}
