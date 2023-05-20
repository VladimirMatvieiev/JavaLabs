package edu.nmu.matvieiev.model;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}