package com.yogesh.principlesIPEA.inheritence;

public class BoXweight extends Box {
    // we need to get l,w,h
    double weight;
    public BoXweight() {
        this.weight = -1;
    }
    // passing parent class properties also

    BoXweight(BoXweight other) {
        super(other);
        weight = other.weight;

    }

    public BoXweight(double l, double h, double w, double weight) {
        super(l,h,w); //  this is also a type of constructor
        // default constructor is important here
        // gives access to upper vars
        // what is super ?
        // call the parent class constructor
        // used to initialize values present in parent class
        // it can initialize private vars also bcz box class is initializing it
        // super keyword access one level up vars.
        // super class is always initialized first as child class is depends
        this.weight = weight;
        System.out.println(super.height); // height from super
        System.out.println(this.height); // height from here;
        // if we do not use super then default values will be called.

    }

    // creating a copy constructor
}
