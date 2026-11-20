package com;

import com.pluralsight.loops.Person;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person firstP = new Person("James", "Anderson",280);
        people.add(firstP);
        Person secondp = new Person("Sophia","Martinez",34);
        people.add(secondp);
        Person thirdP = new Person("Michael","Johnson", 45);
        people.add(thirdP);
        Person fourthP = new Person("Olivia","Thompson", 22);
        people.add(fourthP);
        Person fifthP = new Person("Daniel","Williams", 31);
        people.add(fifthP);
        Person sixthP = new Person("Emma", "Davis", 27);
        people.add(sixthP);
        Person seventhP = new Person("Christopher", "Brown",39);
        people.add(seventhP);
        Person eightP = new Person("Isabella","Garcia", 19);
        people.add(eightP);
        Person nineP = new Person("Matthew","Wilson", 52);
        people.add(nineP);
        Person tenthP = new Person("Ava","Robinson",25);
        people.add(tenthP);




    }
}
