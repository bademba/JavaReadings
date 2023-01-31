package ObjectsAndClasses;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String str;
        System.out.print("Enter string without spaces:");
        str=keyboard.next();
        System.out.println("Length of the string is : "+str.length());
        System.out.println("Character at position 3 is :"+str.charAt(2));
        System.out.println("Characters 2-4 are: "+str.substring(2,4));
        System.out.println(str.concat(" was the string entered"));
        System.out.println("This is uppercase "+str.toUpperCase());
        System.out.println("This is lower case "+str.toLowerCase());
    }
}
