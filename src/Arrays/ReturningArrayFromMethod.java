package Arrays;

import java.util.Scanner;

public class ReturningArrayFromMethod {
    public static void main(String[] args) {
        enterTemps();
    }
    static double[] enterTemps(){
        Scanner input =new Scanner(System.in);
        double[] temperatureOut= new double[7];
        for(int i=0;i<temperatureOut.length;i++){
            System.out.print("enter max temp for the day: [" +(i+1) +"]");
            temperatureOut[i] =input.nextDouble();
        }
        System.out.println(temperatureOut);
        return temperatureOut;
    }
}
