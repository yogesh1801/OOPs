package DictionaryApp;
import java.util.Scanner;
public class DictApp {
    public static void main(String[] args) {
        System.out.println("welcome To the Dictionary class");
        DictClass d = new DictClass();
        int userkey;
        double userValue;
        printMenu();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Choose a option from above : ");
        int input = myInput.nextInt();
        boolean check = true;
        while(check){
            switch (input) {
                case 1 -> {
                    System.out.print("Enter the key : ");
                    userkey = myInput.nextInt();
                    d.getKey(userkey);
                    System.out.print("Choose another Action : ");
                    input = myInput.nextInt();
                }
                case 2 -> {
                    System.out.print("Enter the value : ");
                    userValue = myInput.nextDouble();
                    d.putRecord(userValue);
                    System.out.print("Choose another Action : ");
                    input = myInput.nextInt();
                }
                case 3 -> {
                    System.out.print("Enter the record key :  ");
                    userkey = myInput.nextInt();
                    d.removeRecord(userkey);
                    System.out.print("Choose another action : ");
                    input = myInput.nextInt();
                }
                case 4 -> {
                    System.out.println("Current Records are : ");
                    d.records();
                    System.out.print("Choose another action : ");
                    input = myInput.nextInt();
                }
                case 5 -> check = false;
            }
        }
        System.out.println("you have exited the dictionary Thank you");

    }

    static void printMenu() {
        System.out.println("1) Get key");
        System.out.println("2) Put Record");
        System.out.println("3) Remove Record");
        System.out.println("4) Get records");
        System.out.println("5) exit");
    }
}
