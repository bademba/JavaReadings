package ObjectsAndClasses;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String string1,string2;
        int comparison;

        System.out.print("Enter String 1: ");
        string1=keyboard.next();
        //String s1=string1.toUpperCase();
        System.out.print("Enter string 2: ");
        string2=keyboard.next();
        //String s2=string2.toUpperCase();

        comparison=string1.compareTo(string2);
        System.out.println(comparison);
        if(comparison<0){
            System.out.println(string1 + " comes before "+string2 +" in the alphabet");
        }else if(comparison>0){
            System.out.println(string2 + " comes before "+string1 +" in the alphabet");
        }else {
            System.out.println("The strings are identical");
        }
    }
}
