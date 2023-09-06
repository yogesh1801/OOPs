package com.yogesh.staticExample;

// to show initialization of static variables
public class staticBlock {
    static int a = 4;
    static int b;
    // this particular block is called when class loads for the first time
    static {
        System.out.println("i am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
        staticBlock.b += 3;
        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        // we can see static block runs only once and sets the values when classes are loaded for the first time

    }
}
