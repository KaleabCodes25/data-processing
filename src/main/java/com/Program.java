package com;

import com.pluralsight.loops.Person;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Person> people = new ArrayList<>();
        Person firstP = new Person("James", "Anderson",28);
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

        System.out.print("Enter a name to search(first or last): ");
        String name = scanner.nextLine().trim();

        List<Person> nameMatch = new ArrayList<>();

        for (Person person : people) {
            if(name.equalsIgnoreCase(person.getFirstName()) || name.equalsIgnoreCase(person.getLastName())){
                nameMatch.add(person);
            }
        }
        for (Person match : nameMatch) {
            System.out.println(match);
        }

        double totalAge = 0;
        double averageAge;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        averageAge =totalAge/people.size();
        System.out.println(averageAge);

        Person oldest = people.get(0);
        int oldAge;
        for (Person person : people) {
            if(oldest.getAge() < person.getAge()){
                oldest = person;
            }
        }
        oldAge = oldest.getAge();
        System.out.println(oldAge);

        Person youngest = people.get(0);
        int youngAge ;
        for (Person person : people) {
            if(youngest.getAge()> person.getAge()){
                youngest = person;
            }
        }
        youngAge = youngest.getAge();
        System.out.println(youngAge);












    }
}
