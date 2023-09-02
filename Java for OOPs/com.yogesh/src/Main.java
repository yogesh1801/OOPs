
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printJava() {
        System.out.println("hello java");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Variables

        String name = "yogesh";
        int age = 30;

        // primitive types
        // byte , short , int , long , float , double , char
        long phone = 123442534535L;
        float pi = 3.14F;
        char letter = 'y';
        boolean isAdult = true;

        // Non-primitive types
        String name2 = "yogesh";
        System.out.println(name2.length());

        // the new keyword
        // can be used to define new Non - primtive varibales
        String name3 = new String("yogesh");
        // String concatinating
        String name4 = name2 + " " + name;
        System.out.println(name4);
        // using charAt
        System.out.println(name.charAt(0));

        // replace function
        String replacedString = name.replace('y' , 'z');
        System.out.println(replacedString);

        // in java strings are immutable
        String name5 = "yogesh singla";
        System.out.println(name5.substring(0,4));

        // Arrays in java
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[0]);

        // Array utils
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // another way to declare fixed length arrays
        int[] marks2 = {97,98,99};

        // 2-D arrays
        int [][] finalmarks = {{97,98,99} , {95,95,8}};
        System.out.println(finalmarks[0][0]); // basically a matrix

        //type casting - implicit and explicit type casting
        double price = 100;
        double priceFinal = price + 18; // implicit casting
        System.out.println(priceFinal);

        // always go from lower capacity to higher capacity
        int p = 100;
        int fp = p + (int)18.0; // trunkates the decimal part
        System.out.println(fp);

        final float PI = 3.14F; // now read only variables (consts)

        // operators
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);

        // num ++ is available in java

        // Maths class in java
        int a1 = 2;
        int a2 = 5;
        System.out.println(Math.max(5,6));
        // similarly we have min also
        // random number from 0-1
        System.out.println(Math.random());

        // taking input from user
        Scanner sc = new Scanner(System.in);
//        System.out.print("Input your age: ");
//        int agescanned = sc.nextInt();
//        System.out.println(agescanned);
//
//         // inputting string
//        System.out.print("Enter your name : ");
//        String namescanned = sc.next();
//        System.out.println(namescanned);
//        // only takes one word not lines
//
//        System.out.print("Enter your line : ");
//        String lineScanned = sc.nextLine();
//        System.out.println(lineScanned);

        // comparison operators
        // logical operators - && , || , !
        // conditional statements
        System.out.println("Enter the cash you have : ");
        int cash = sc.nextInt();
        if (cash < 10){
            System.out.println("Can not by anything");
        }
        else if(cash>10 && cash <40) {
            System.out.println("only one thing");
        }
        else {
            System.out.println("can get both");
        }

        // switch case statements

        int day = 2;
        switch(day){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            default:
                System.out.println("i dont know");

        }

        // loops
        for (int j =0 ; j < 10 ; j++){
            System.out.println(j);
        }

        // while loops
        int i = 10;
        while(i > 1){
            System.out.println(i);
            i = i-1;
        }

        // do while loop
        int k = 10;
        do {
            System.out.println(k);
            k =k -1;
        }while(k>0);

        // break and continue
        int i2 =0 ;
        while(true){
            System.out.println(i);
            i++;
            if(i2 > 5){
                break;
            }
            if(i2 == 3){
                continue;
            } // for skiping the things
        }

        // function and methods
        // METHOD
        printJava();


    }
}