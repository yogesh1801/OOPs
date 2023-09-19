package com.yogesh.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(5,"yogesh");

        // 1) access the data members
        // 2) modify the data members

        // obj.num = 10 (not allowed)
        System.out.println(obj.getNum());
        obj.setNum(55);
        System.out.println(obj.getNum());
        System.out.println(obj.getClass().getAnnotations());
    }
}
