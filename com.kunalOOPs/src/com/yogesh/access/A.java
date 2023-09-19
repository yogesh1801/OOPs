package com.yogesh.access;

public class A {
    private int num;
    // we cannot directly modify value of private var in the main
    // we can set value either using constructor or also using getters and setters
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // upper are the getters and setters

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

// if you don't specify public or private , in same packages it will allow
// in other packages it won't allow you to access the same.
// we have a table which shows the same.

// inbuilt packages
/*
 * 1) lang packages - primitive datatype and lang specific things are available here
 * 2) io - input / output during file reading
 * 3) util - Array , ArrayList (contains data structures and collection frameworks)
 * 4) applet - more for dev stuff(obsolete)
 * 5) awt - GUI using java (not required)
 * 6) net - for internet things.
 * */


