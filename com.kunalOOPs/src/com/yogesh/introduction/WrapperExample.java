package com.yogesh.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        // we can also do
        Integer num = new Integer(45);
        // also
        Integer num2 = 54;
        System.out.println(num + " " + num2);
        // above we are just creating objects also called Wrapper class
        swap(a,b);
        System.out.println(a + " " + b);
        // doesn't get swapped because it get swapped only inside the function



        swap2(a,b);
        System.out.println(a + " " + b);
        // still doesn't get swapped because Integer type is final class and cannot be changes

        final float PI = 3.14F;
        // this cannot be modified and is conventionally all CAPS
        // PI = 44; NOT ALLOWED

        // in case of objects internal value can be changed

        final A yogesh = new A("yogesh");
        System.out.println(yogesh.name);
        yogesh.name = "singla";
        System.out.println(yogesh.name);

        // but yogesh = new A("kunal") is not allowed because we are trying to change object reference value
        // reassigning is not allowed

    }

    static void swap (int a , int b){
        int temp = a;
        a=b;
        b = temp;
        // block scoped
    }

    static void swap2 (Integer a , Integer b){
        // objects are reference values so it should work
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    // final variables have to initialized always no matter what
    String name;
    public A (String name){
        this.name = name;

    }

}
// everything is passed by value
// garbage collection later