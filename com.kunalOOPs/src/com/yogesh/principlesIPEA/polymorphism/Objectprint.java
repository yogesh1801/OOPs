package com.yogesh.principlesIPEA.polymorphism;

public class Objectprint {
    int num;

    public Objectprint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Objectprint{" +
                "num=" + num +
                '}';
    }

    // overriding toString method

    public static void main(String[] args) {
        Objectprint obj = new Objectprint((54));
        System.out.println(obj);
        // uses default to string method in the docs
        // all classes extent object classes
    }

}

// final keyword can avoid the overriding.
