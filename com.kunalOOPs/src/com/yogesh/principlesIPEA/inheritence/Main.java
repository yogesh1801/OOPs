package com.yogesh.principlesIPEA.inheritence;

import com.yogesh.principlesIPEA.inheritence.BoXweight;
import com.yogesh.principlesIPEA.inheritence.Box;

public class Main {

    public static void main(String[] args) {
        // inheritance from parent using extends keyword

        Box box = new Box();
        System.out.println(box.length);
        BoXweight box3 = new BoXweight();
        System.out.println(box3.length);
        System.out.println(box3.weight);
        BoXweight box4 = new BoXweight(72,75,76,91);
        System.out.println(box4.length);

        // inheritance works only from top to bottom , parent cannot access child

        // something interesting
        Box box0  = new BoXweight(72,25,25,25);
        // System.out.println(box0.weight); , cannot access weight though it is intialized
        // here Box is the super class


    }


}

// Types of inheritance
// 1) single inheritance : - one class extends other class
// 2) multilevel inheritance : - one class inherits another class
// 3) Multiple inheritance : one class inherits multiple classes (not available in java)
// 4) we use interfaces instead



// polymorphism

