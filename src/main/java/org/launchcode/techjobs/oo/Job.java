package org.launchcode.techjobs.oo;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;




    public Job() {
        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    //Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



    //TODO: write a custom toString method for part 5 that passes the 3 tests in JobTest and TestTaskFive
    //This displays the data for a particular Job object
    //use System.lineSeparator() to declare a new line
    //Like in my previous assignment, if empty print the blank statement, else print the stuff with formatting
    //ID goes in, check for name, emp, loc, pos, core
    //Note: isEmpty checks for ""
    @Override
    public String toString() {

        if (this.name == null || this.name.isEmpty()) {
            this.name = "Data not available";
        }
        if (employer.getValue() == null || employer.getValue().isEmpty()) {
            employer.setValue("Data not available");
        }
        if (location.getValue() == null || location.getValue().isEmpty()) {
            location.setValue("Data not available");
        }
        if (positionType.getValue() == null || positionType.getValue().isEmpty()) {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() == null || coreCompetency.getValue().isEmpty()) {
            coreCompetency.setValue("Data not available");
        }
        return "\nID: " + id + lineSeparator() + "Name: " + name + lineSeparator() +
                "Employer: " + employer + lineSeparator() + "Location: " + location + lineSeparator() +
                "Position Type: " + positionType + lineSeparator() + "Core Competency: " + coreCompetency + lineSeparator();
    }



    //Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }


}
