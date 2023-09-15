package com.yogesh.principlesIPEA.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();

        Triangle triangle = new Triangle();
        Shapes square = new Square();
        shape.area();
        circle.area();
        square.area(); // why is it calling shapes instead of its own area thing
        triangle.area();
    }
}

// Definition of area is same in all 4
// types of polymorphism
/*
 * 1) Compile time polymorphism / static polymorphism (Which is achieved by method overloading)
 * method overloading (same name but type , argument , return , ordering(of type) can be different example - multiple constructors
 * automatic casting (how casting works in java)
 *
 * 2) Runtime / Dynamic polymorphism (achieved by method overriding)
 * when child class and parent class have same method (same name) but different body
 *
 * why shapes Square is able to access area() of Square one?
 * reference type methods are taken but. shapes circle gives that which methods will it be able to take (all in the shapes)
 * but new Circle () , defines which one will it be able to access.=,because of overriding
 * How java determines this? - by dynamic method dispatch.
 * this is resolved in the runtime
 *
 * Late binding and early binding
 *
 * // final keyword can prevent inheritance and polymorphism.
 *
 * can we override static method?
 *
 * Encapsulation - Wrapping up the implementation of the data number and methods in the class
 * it hides it from the outside world.
 *
 * Abstraction - hiding unnecessary things and showing only relevant things
 * example ArrayList we really don't care what happens under the hood
 * Hence we call them as Abstract class also*
 * Both of them is much more of design terms.
 *
 */
