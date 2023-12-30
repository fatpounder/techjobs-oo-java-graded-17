package org.launchcode.techjobs.oo;


import java.util.Objects;

//Needs to be abstract class so that no JobField objects are made
//Contains what the other 4 objects classes (emp, core, loc, pos) have in common (declared fields, constructors, getters, setters, methods)
public abstract class JobField {

    //Declare each of the common fields
    private int id;
    private static int nextId = 1;
    private String value;
//
//    //Code the constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

//    //Add in the custom methods
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

//    //Use Generate to create the appropriate getters and setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //Remove the common code from the 4 classes that is in JobField

}
