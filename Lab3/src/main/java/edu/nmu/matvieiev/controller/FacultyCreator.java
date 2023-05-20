package edu.nmu.matvieiev.controller;

import edu.nmu.matvieiev.model.Faculty;
public class FacultyCreator {
    public static Faculty createFaculty(String name) {
        return new Faculty(name);
    }
}
