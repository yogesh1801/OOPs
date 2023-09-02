package com.yogesh.introduction;

public class Main {
    public static void main(String[]  args){
        // classes are named group of properties and functions
        // classes start with capital letter

        // create a class
        Student[] students = new Student[5];
        // array of student class
        Student yogesh;
        // A declaration of student class called yogesh of value null

        // creating the object
        // new dynamically allocates memory and returns a reference to it
        // and this reference is stored by yogesh
        // dynamically allocated means memory is given during runtime only
        yogesh = new Student(13 , "yogesh" , 99.9f); // initiating the yogesh object
        // we cannot access or manipulate address in java

        System.out.println(yogesh); // gives some values (later)
        System.out.println(yogesh.marks); //  by default 0.0
        // non primitives are initiated with null value

//        yogesh.rno = 10;
//        yogesh.name = "yogesh";
//        yogesh.marks = 90;

        // given values to the instance of student object called yogesh
        System.out.println(yogesh.name);
        yogesh.greeting();

        // in new Student() it is a constructor
        // since adding values by dot is very cumbersome we can use constructor

    }
}

// should be outside the Main class
class Student {
    int rno;
    String name;
    float marks = 90F; //default values

    void greeting () {
        System.out.println("hello my name is " + this.name);
    }

    // making a constructor
    // this is used to referring to the object instance itself
    // use this carefully it is quite logical in itself
    // we can also call constructor from constructor
    Student(int rno , String name , float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

// classes are basically templates which can be used
// object is an instance of a class
// human is class , me is an instance of that class
// my instance can take different values
// state , identity and behaviour of objects
// the . operator used to access the objects
// the new keyword
// primitive datatype are stored in stack memory
// java is pass by value language only
// but in case of objects var holds reference to the object and hence value of reference is what is passes
// hence we see object value changes if we change in other one
// wrapper class (later)
// final keyword doesn't let you changes the values


