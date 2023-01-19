package Arrays;

import java.util.Scanner;

public class ArrayEnhancedLoop {
    public static void main(String[] args) {
        double[] temperature;
        temperature= enterTemps();
        enhancedLoop(temperature);
    }

    static double[] enterTemps(){
        Scanner input =new Scanner(System.in);
        double[] temperatureOut= new double[7];
        for(int i=0;i<temperatureOut.length;i++){
            System.out.print("enter max temp for the day [" +(i+1) +"]: ");
            temperatureOut[i] =input.nextDouble();
        }
        //System.out.println(temperatureOut);
        return temperatureOut;
    }

    //NOTES
    //Enhanced loops used in he following scenarios
    // 1.you wish to access the entire array (and not just part of the array);
    // 2.you wish to read the elements in the array, not modify them;
    // 3. you do not require the array index for additional processing.
    static void enhancedLoop(double... temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES***");
        System.out.println("Number of temperatures: "+ temperatureIn.length);
        for (double items: temperatureIn){
            System.out.println(" ITEMS :" +items);
        }
    }

}
