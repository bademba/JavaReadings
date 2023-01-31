package ObjectsAndClasses;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String str;
        System.out.print("Enter string without spaces:");
        str=keyboard.next();
        System.out.println("Length of the tring is : "+str.length());
        System.out.println("Charcter at position 3 is :"+str.charAt(2));
        System.out.println("Characters 2-4 are: "+str.substring(2,4));
    }
}
