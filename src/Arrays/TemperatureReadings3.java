package Arrays;

import java.util.Scanner;

public class TemperatureReadings3 {
    public static void main(String[] args) {
        double[] temperature = new double[7];
        enterTemps(temperature);
        displayTemps(temperature);
        wasHot(temperature);
        wasHotUsingEnhancedLoop(temperature);
    }

    //method to enter temperaures
    static void enterTemps(double[] temperatureIn){
        Scanner keyboard = new Scanner(System.in);
        for(int i =0;i<=temperatureIn.length-1;i++){
            System.out.print("Enter temp for day ["+i+ "] :");
            temperatureIn[i] =keyboard.nextDouble();
        }
    }

    //display temperatures
    static void displayTemps(double... temperatureIn){
        System.out.println();
        System.out.println("****TEMPERATURE ENTERED***");
        System.out.println();
        for (int i=0;i<temperatureIn.length;i++){
            System.out.println("day " +(1+i)+" "+temperatureIn[i]);
        }
    }

    //wasHot method using for loop
    static void wasHot(double[] temperatureIn){
        System.out.println();
        System.out.println("**HOT DAYS***");
        System.out.println();
        for (int i =0;i<temperatureIn.length;i++){
            if(temperatureIn[i]>18){
                System.out.println(temperatureIn[i]);
            }
        }
    }

    //wasHot using enhanced loop
    static void wasHotUsingEnhancedLoop(double[] temperatureIn){
        System.out.println();
        System.out.println("**HOT DAYS USING enhanced Loop***");
        System.out.println();
        for(double item:temperatureIn){
            if(item>18){
                System.out.println(item);}
        }
    }
}
