package com.yogesh.staticExample;

public class Main {
    public static void main(String[] args) {
        // same folders need not import things
        Human yogesh = new Human(21,"yogesh" , 9000 , true);
        Human singla = new Human(20 , "singla" , 5000 , false);

        System.out.println(Human.population);
        System.out.println(singla.population);
        // this shows 2 instances of Human class has been declared every time it is created
        // access via reference is also OK but use class name itself

        fun(); // this is allowed
        // greeting(); not allowed we need a instance of the same
        Main obj = new Main();
        obj.greeting(); // this is allowed but not really used

    }

    void greeting (){
        System.out.println("Hello name is yogesh");
    }

    static void fun (){
        System.out.println("fun var");
    }
}

// static variables are used to declare variables which are independent of Class instance
// example for Human class
// population is such parameter
// static variable is one which is independent of class initiation , it can be accessed even before a class instance is created
// it is a class variable not the instance variable (even reference is not required)


// Talking about psvm in main class

// why main class is static
// this means we can use Main class without creating instance of that class
// main is first executed
// inside static we cannot use anything which is not static
// but we can use static things inside non static functions (quite logical)
// without main class wont run