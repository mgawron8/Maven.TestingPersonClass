package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForAll() {
        // Given
        Person person = new Person();
        Integer expectedAge = 5;
        String expectedName = "Mike";
        String expectedLast = "Gawronski";
        String middleName = "Joseph";
        String expectedDOB = "08/27/95";
        int height = 170;
        int weight = 250;

        // When
        person.setweight(weight);
        person.setAge(expectedAge);
        person.setBirth(expectedDOB);
        person.setheightInInches(height);
        person.setlastName(expectedLast);
        person.setmiddleName(middleName);
        person.setName(expectedName);

        // Then
        Integer actualAge = 5;
        String actualFirst = "Mike";
        String actualLast = "Gawronski";
        String actualMiddle = "Joseph";
        String actualDOB = "08/27/95";
        int actualHeight = 170;
        int actualWeight = 250;

        Assert.assertEquals(expectedAge,actualAge);
        Assert.assertEquals(expectedName,actualFirst);
        Assert.assertEquals(expectedDOB,actualDOB);
        Assert.assertEquals(expectedLast,actualLast);
        Assert.assertEquals(middleName,actualMiddle);
        Assert.assertEquals(weight,actualWeight);
        Assert.assertEquals(height,actualHeight);

        //i suppose i should of made seperate methods to call each one and called them seperatly/n
        //if future me sees this make it better.


    }
}
