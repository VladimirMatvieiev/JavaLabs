package edu.nmu.matvieiev.controller;

import edu.nmu.matvieiev.model.University;

public class UniversityCreator {
    public static University createUniversity(String name) {
        return new University(name);
    }
}
