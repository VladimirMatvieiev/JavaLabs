package edu.nmu.matvieiev.controller;

import edu.nmu.matvieiev.model.Group;
public class GroupCreator {
    public static Group createGroup(String name) {
        return new Group(name);
    }
}
