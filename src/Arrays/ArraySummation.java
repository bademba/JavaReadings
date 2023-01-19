package Arrays;

public class ArraySummation {
//    SET total TO zero
//    LOOP FROM first element in array TO last element in array
//            BEGIN
//    SET total TO total + value of current element
//    END
//    RETURN total

    //runner method
    public static void main(String[] args) {
        double[] arrayIn={12.5,13.5};
        summation1(arrayIn);
        summation2(arrayIn);
        summation3(arrayIn);
    }
    //using for loop
    static double summation1(double[] arrayIn){
        double sum=0;
        for(int i=0;i<arrayIn.length;i++){
            sum=sum + arrayIn[i];
        }
        System.out.println("SUMMATION 1:" +sum);
        return sum;
    }
    //using enhanced loop
    static double summation2(double[] arr){
        double sum=0;
        for(double item: arr){
            sum=sum+item;
        }
        System.out.println("SUMMATION 2:" +sum);
        return sum;
    }
    //usind varargs and for loop
    static double summation3(double... arr){
       double sum=0;
       for(int i =0;i<arr.length;i++){
           sum=sum+arr[i];
       }
        System.out.println("SUMMATION 3:" +sum);
        return sum;
    }
}
