package Arrays.Test;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        int[] javaStudents=new int[3];
        //enterExamMarks();
        enterExamMarks2(javaStudents);
        increaseMarks(javaStudents);
    }

//    static int[] enterExamMarks(){
//        Scanner keyboard = new Scanner(System.in);
//        int[] marksOut =new int[3];
//        for (int i=0;i<marksOut.length;i++){
//             System.out.print("Enter marks [" +"] : ");
//            marksOut[i]=keyboard.nextInt();
//         }
//         return marksOut;
//    }

    static void enterExamMarks2(int[] marks){
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter marks ["+ i+"] : ");
            marks[i]=keyboard.nextInt();
        }
    }

    static  void increaseMarks(int[] marks){
        System.out.println();
        System.out.println("***INCREASED MARKS***");
        for (int i=0;i< marks.length;i++){
            marks[i]=marks[i]+5;
            System.out.println(marks[i]);
           // System.out.println("Marks after increase: "+(marks[i]+5));
        }

    }
}
