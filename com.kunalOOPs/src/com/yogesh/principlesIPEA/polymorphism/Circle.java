package com.yogesh.principlesIPEA.polymorphism;

import java.awt.*;

public class Circle extends Shapes {
    // this will run when instance of circle is created
    // hence this is overriding the parent method
    @Override //  this is annotation to check if function is over-riding or not
        void area() {
        System.out.println("Area is pie*r*r");
    }
}
