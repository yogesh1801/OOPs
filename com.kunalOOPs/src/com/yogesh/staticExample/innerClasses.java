package com.yogesh.staticExample;
// only inner classes can be static
public class innerClasses {
    static class Test {
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test ("yogesh");
        Test b = new Test ("Singla");

        System.out.println(a.name);
        System.out.println(b.name);
    }

    // main have instances of Test , Test is not static for main
    // static methods are made during compile time

}



// note Test class is independent of instance of innerClass,
// but it still can interact and make instances from inner classes
