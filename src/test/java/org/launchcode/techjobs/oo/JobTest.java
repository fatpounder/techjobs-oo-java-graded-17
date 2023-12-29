package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Assert;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {

    //Define a test called testSettingJobId and annotate with @test
    //Use assertNotEquals to verify that the IDs of the two Job objects are distinct, using the empty constructor
    //Need to use .getId() to compare IDs
    @Test //1Part4
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    //Define a test called testJobConstructorSetsAllFields
    //Each Job object should contain six fields and data types
    //Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field
    //test should have 5 assert statements of each type
    //use instanceof in assertTrue to check Class
    //do not need to do ID(doing 5, not 6 for each assert), it is tested above
    @Test //2Part4
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    //Generate two Job objects that have identical field values EXCEPT for id
    //Use assertFalse to test that equals returns false
    @Test //3Part4
    public void testJobsForEquality() {
    Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(job4.equals(job5));
    }

    //TODO: When passed a Job object, it should return a string that contains a blank line before and after the job information
    //use assertEquals to verify that these characters are correct
    //will need to use lineSeparator()
    //use index 0 and the length -1 for last index
    @Test //4Part5
    public void testToStringStartsAndEndsWithNewLine() {
    Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String startsWith = String.valueOf(job6.toString().charAt(0));
    String endsWith = String.valueOf(job6.toString().charAt(job6.toString().length()-1));
    assertEquals(startsWith, lineSeparator());
    assertEquals(endsWith, lineSeparator());
    }

    //TODO: The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line
    @Test //5Part5
    public void testToStringContainsCorrectLabelsAndData() {
    Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String testString = System.lineSeparator() + "ID: " + job7.getId() + System.lineSeparator() + "Name: " + "Product tester" + System.lineSeparator() +
            "Employer: " + "ACME" + System.lineSeparator() + "Location: " + "Desert" + System.lineSeparator() +
            "Position Type: " + "Quality control" + System.lineSeparator() + "Core Competency: " + "Persistence" + System.lineSeparator();

    assertEquals(testString, job7.toString());
    }

    //TODO: If a field is empty, the method should add, “Data not available” after the label
    //Testing each field being empty
    @Test //6Part5
    public void testToStringHandlesEmptyField() {
    Job job8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    String emptyFieldMessage = "Data not available";
    assertTrue(job8.toString().contains(emptyFieldMessage));
    }

}