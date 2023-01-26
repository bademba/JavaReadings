package Arrays.Test;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        int[] javaStudents=new int[3];
        enterMarks(javaStudents);
    }

    static void enterMarks(int[] studentMarks){
        Scanner keyboard = new Scanner(System.in);
        for (int i=0;i<studentMarks.length;i++){
            System.out.println();
            System.out.print("Enter marks [" +"] : ");
            studentMarks[i]=keyboard.nextInt();
            System.out.println(studentMarks[i]);
        }
        //studentMarks=keyboard.nextInt();
    }
}
