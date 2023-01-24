package Arrays.Test;

public class TestArrays {
    public static void main(String[] args) {
        //print the length of the array
        SomeArray();
       newSomeArray();
       doubleSomeArray();
       enhancedLoop();
       modifiedEnhancedLoop();
    }

    static void SomeArray(){
        int[] someArray={2,5,1,9,11};
        System.out.println(someArray.length);

    }

    //creating same array with new operator and assign each value element individually
    static void newSomeArray(){
        int[] someArray= new int[5];
        someArray[0]=2;
        someArray[1]=5;
        someArray[2]=1;
        someArray[3]=9;
        someArray[4]=11;
        System.out.println(someArray);
    }

    //Write a standard for loop that will double the value of every item in someArray
    static void doubleSomeArray(){
        int[] someArray= {2, 5, 1, 9, 11};
        System.out.println("****DOUBLE ARRAY VALUE***");
        for (int i=0;i<someArray.length;i++){
            //someArray[i]=someArray[i]+someArray[i];
            //or
            someArray[i]=someArray[i]*2;
            System.out.print(" " +someArray[i]);
            System.out.println();
        }
    }

    //Use an enhanced for loop to display the values inside the array.
    static void enhancedLoop(){
        int[] someArray= {2, 5, 1, 9, 11};
        System.out.println();
        System.out.println("***ENHANCED LOOP***");
        for (int item: someArray){
            System.out.println(item);
        }
    }

    //Modify the enhanced for loop above so that only numbers greater than 2 are displayed.
    static void modifiedEnhancedLoop(){
        int[] someArray= {2, 5, 1, 9, 11};
        System.out.println();
        System.out.println("***Arrays greater than 2 ***");
        for(int item: someArray){
            if(item>2){
                System.out.println(item);
            }
        }
    }
}
