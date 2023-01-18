package Arrays;

import java.util.Scanner;

public class ReturningArrayFromMethod {
    public static void main(String[] args) {
        double[] temperature;
        temperature= enterTemps();
        displayTemps(temperature);
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

    static void displayTemps(double[] temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES***");
        System.out.println("Number of temperatures: "+ temperatureIn.length);
        for (int i=0;i<temperatureIn.length;i++){
            System.out.println(temperatureIn[i]+ " ");
        }
    }
}
