package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;



public class Main {
    public static void main(String[] args) {
        List<String> hobbyAddresses = new ArrayList<String>();
        List<String> employeeSkills = new ArrayList<String>();
        List<String> lastJob = new ArrayList<String>();
        lastJob.add("Baker");
        lastJob.add("Programmer");
        lastJob.add("Doctor");
        lastJob.add("Teacher");
        employeeSkills.add("Public speaking");
        employeeSkills.add("Working in teams");
        employeeSkills.add("Working under pressure");
        employeeSkills.add("Learns fast");
        hobbyAddresses.add("Paris");
        hobbyAddresses.add("Rome");
        hobbyAddresses.add("Tokyo");
        hobbyAddresses.add("Berlin");
        TreeSet<Person> set = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.age != p2.age) {
                    return p1.age - p2.age;
                }
                if (!p1.name.equals(p2.name)) {
                    return p1.name.compareTo(p2.name);
                }
                if (!p1.hobby.name.equals(p2.hobby.name)) {
                    return p1.hobby.name.compareTo(p2.hobby.name);
                }
                if (p1.hobby.frequency != p2.hobby.frequency) {
                    return p1.hobby.frequency - p2.hobby.frequency;
                }
                return p1.address.compareTo(p2.address);
            }
        });
        set.add(new Employee("Alin Alecu", 23, new Hobby("Photography", 3, hobbyAddresses), "Paris",
                "C++", 3000, "Programmer"));
        set.add(new Employee("Alex Hatache", 34, new Hobby("Fishing", 9, hobbyAddresses), "Tokyo",
                "Java", 5600, "Backend Developer"));
        set.add(new Employee("Marius Ion", 18, new Hobby("Video Games", 6, hobbyAddresses), "Paris",
                "C#", 8900, "Game Developer"));
        set.add(new Student("Leo Popescu", 18, new Hobby("Karate", 3, hobbyAddresses), "Rome",
                "Ion Creanga", 9.0, "IV"));
        set.add(new Student("Sanda Marculescu", 16, new Hobby("Polo", 9, hobbyAddresses), "Berlin",
                "Gheorghe Lazar", 9.5, "III"));
        set.add(new Student("Vladimir Cosmin", 17, new Hobby("Hunting", 1, hobbyAddresses), "Paris",
                "Sincai", 8.75, "IV"));
        set.add(new Unemployed("Ion Boromir", 25, new Hobby("Singing", 5, hobbyAddresses), "Berlin",
                "Cashier"));
        set.add(new Unemployed("Mihai Andrei", 45, new Hobby("Video Games", 7, hobbyAddresses), "Berlin",
                "Professor"));
        set.add(new Unemployed("Maria Dragomir", 31, new Hobby("Cooking", 5, hobbyAddresses), "Berlin",
                "Nurse"));

        System.out.println(set);
    }
}