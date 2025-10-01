/*
* Java Notes: Hello World!
* File: Main.java
* FAMICOM, 1-1-2025
*
*/

// Add Public Class
// MUST BE SAME AS FILE NAME!!
// Cap Class Names + File Names

// Cmd + / = Note everything

import java.util.Scanner;

public class Main{
    /**
     * Java Doc
     * Describes the purpose of a funcion
     * @param args
     * What parameter means/is
     * 
     */
    public static void main(String[] args) {

        // Scanners: allows use input
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("Enter a name: ");
        name = scan.nextLine();
        System.out.println("Hello " + name);

        // Print
        System.out.println("Hello World!"); // <-- Prints "Hello World!" to the terminal
        System.out.print("Hello World! ");
        System.out.print("Look ma! No line!");

        // Variables
        // Value needed or won't compile
        // <Type> <Name> = <Value>;

        // Integers types
        byte bNum = 100; // between -128 and 127
        short sNum = 5000; // between -32768 and 32767
        int iNum = 1000; // <-- between -2147483648 and 2147483647
        long lNum = 15000000000L; // <-- between -9223372036854775808 and 9223372036854775807

        // Floating point types
        // Integers with a decimal point
        float fNum = 1; // <-- 32 bit
        double pi = 5; // <--  64 bit

        // Boolean types
        boolean isOn = true;
        boolean isOff = false;

        // Characters
        char Grade = 'f'; // <-- Single Character

        // String
        String text = ("Beans"); // <-- Text String

        int x = 5;
        int b = x++;
        System.out.println("b");

        // If / Else statments
        int time = 20;
        if (time < 18) {
            System.out.println("text");
        }else if (time == 3){
            System.out.println("text");
        }else {
            System.out.println("text");
        }
        

        // Switch case
        int day = 0;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do / While loop
        int t = 6;
        do {
            System.out.println(t);
        }
        while (t < 5);

        // For loop
        // int y = 0
        // for (y < 5)
        for (int y = 0; y < 5; y++) {
            System.out.println(y);
        }

        // For / Each loop
        String[] cars = {};
        // for (type loopVar: array){
        // }
        for (String o : cars) {
            System.out.println(o);
        }

        timeTwo(5);

        
    }
    // How to build a funtion
    // visibility returnType methodName (type paraName, type param2, type...){}
    public static double timeTwo(double num){
        double result = num * 2;
        return(result);
    }
}
