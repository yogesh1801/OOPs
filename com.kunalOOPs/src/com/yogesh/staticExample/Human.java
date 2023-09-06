package com.yogesh.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    // population is here common to all instances of Human class
    // hence population is static variables
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

        // population is a static variable to class hence this keyword in not being used
        // it is like a parameter to complete class
    }


}
