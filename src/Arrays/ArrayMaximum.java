package Arrays;

import java.sql.Array;

public class ArrayMaximum {
    public static void main(String[] args) {
        //int[] arrayIn= new int[3];
        int[] array = {22222222,34444,400000};
        max(array);
    }
    static int max(int[] arrayIn){
        int result =arrayIn[0];
        for(int i=1;i<arrayIn.length;i++){
            if(arrayIn[i] > result){
                result=arrayIn[i];
            }
        }
        System.out.println("MAX: "+result);
        return result;
    }
}
