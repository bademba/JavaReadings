package ObjectsAndClasses;

import java.util.Scanner;

public class StringCheckWithSwitch {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String symbol;
        System.out.print("Enter the symbol(square/circle/triangle) :");
        symbol=keyboard.next();
        switch(symbol){
            case "square":
                System.out.println("ATTACK");
                break;
            case "circle":
                System.out.println("BLOCK");
                break;
            case "triangle":
                System.out.println("JUMP");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
