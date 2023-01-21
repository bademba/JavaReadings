package MultiDimentionalArray;

import java.util.Scanner;

public class MonthlyTemperatures {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char choice;
        double[][] temperature = new double[4][7];
        do{
            System.out.println();
            System.out.println("[1] Enter Temperature");
            System.out.println("[2] Display all");
            System.out.println("[3] Display one week");
            System.out.println("[4] Display day of the week");
            System.out.println("[5] Exit");
            System.out.print("Enter choice [1-5]: ");
            choice=keyboard.next().charAt(0);
            switch (choice){
                case'1':enterTemps(temperature);
                        break;
                case'2': displayAllTemps(temperature);
                        break;
                case'3': displayWeek(temperature);
                        break;
                case'4': displayDays(temperature);
                        break;
                case'5': System.out.println("Goodbye");
                         break;
                default:
                    System.out.println("Error: options 1-5 only");
            }
        }while(choice !='5');
    }
    //method to enter temperatures into 2D requires a nested loop
    static void enterTemps(double[][] temepratureIn){
        Scanner keyboard = new Scanner(System.in);
        //outer loop controls week number
        for(int week =1;week<temepratureIn.length;week++){

            //inner loop controls day number
            for (int day=1;day<temepratureIn[0].length;day++){
                System.out.println("Enter temperature of the week"+week+ "and day"+ day);
                temepratureIn[week-1][day-1]=keyboard.nextDouble();
            }
        }
    }

}
