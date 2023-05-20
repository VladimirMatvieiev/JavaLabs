package edu.nmu.matvieiev.controller;

import edu.nmu.matvieiev.model.Department;
public class DepartmentCreator {
    public static Department createDepartment(String name) {
        return new Department(name);
    }
}
