package com.yogesh.principlesIPEA.inheritence;

public class Box {
    double length;
    double height;
    double w;

    Box(){
        // we can use super here also but from where is it inheriting?
        // it is inheriting the object class (all objects are derived from here itself)

        this.height = -1;
        this.length = -1;
        this.w = -1;
    }
    // this is the default constructor

    Box(double side){
        this.length = side;
        this.w = side;
        this.height = side;
    }

    Box (double l , double h , double w){
        this.length = l;
        this.w = w;
        this.height = h;
    }

    Box (Box old){
        this.height = old.height;

    }
}
