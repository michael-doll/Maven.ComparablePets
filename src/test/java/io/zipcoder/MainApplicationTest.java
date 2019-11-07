package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    @Test
public void TestComparable(){

        Pets pet = new Pets("Bilbo","Dog");
        Pets pet2 = new Pets("Frodo","Cat");
        Pets pet3 = new Pets("Pasta", "Turtle");
        Pets pet4 = new Pets("Bilbo", "Cat");
        ArrayList<Pets> pets = new ArrayList();
        pets.add(pet);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);

        MainApplication.sortNameThenType(pets);
        StringBuilder petsTestOutput = new StringBuilder();

        for(int i = 0; i < pets.size(); i++){
            petsTestOutput.append(pets.get(i)).append(" ");
        }
        String expected = "Bilbo Cat Bilbo Dog Frodo Cat Pasta Turtle ";
        String actual = petsTestOutput.toString();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestComparator(){

        Pets pet = new Pets("Bilbo","Dog");
        Pets pet2 = new Pets("Frodo","Cat");
        Pets pet3 = new Pets("Pasta", "Turtle");
        Pets pet4 = new Pets("Bilbo", "Cat");
        ArrayList<Pets> pets = new ArrayList();
        pets.add(pet);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);

        Collections.sort(pets);
        StringBuilder petsTestOutput = new StringBuilder();

        for(int i = 0; i < pets.size(); i++){
            petsTestOutput.append(pets.get(i)).append(" ");
        }
        String expected = "Bilbo Cat Bilbo Dog Frodo Cat Pasta Turtle ";
        String actual = petsTestOutput.toString();
        Assert.assertEquals(expected,actual);

    }

}
