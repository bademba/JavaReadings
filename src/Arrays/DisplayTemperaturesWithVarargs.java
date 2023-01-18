package Arrays;

public class DisplayTemperaturesWithVarargs {
    public static void main(String[] args) {
        double[] temperature ={7.5,8.2,7.7,11.3,10.5};
        System.out.println("SENDING ARRAY");
        displayTemps(temperature);
        System.out.println("Sending individual items");
        displayTemps(7.5,8.2,7.7,11.3,10.5);
        displayTemps();
    }
    static void displayTemps(double... temperatureIn){
        System.out.println();
        System.out.println("***TEMPERATURES***");
        System.out.println("Number of temperatures: "+ temperatureIn.length);
        for (int i=0;i<temperatureIn.length;i++){
            System.out.println(temperatureIn[i]+ " ");
        }
    }

}
