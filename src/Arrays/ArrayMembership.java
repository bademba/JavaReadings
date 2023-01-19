package Arrays;

public class ArrayMembership {
    //Pseudocode
//    LOOP FROM first element in array TO last element in array
//            BEGIN
//    IF current element = item to find
//            BEGIN
//    EXIT loop and RETURN true
//    END
//            END
//    RETURN false

    //runner class
    public static void main(String[] args) {
        int[] arrayIn={2,3,4,5,11,58,44,55};
        int givenItem=11;
        arrayMember(arrayIn,givenItem);
        if(arrayMember(arrayIn,givenItem) == true){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

    //array member method
    static boolean arrayMember(int[] arrayIn,int itemToFind){
        for(int i=0; i < arrayIn.length;i++){
            if(arrayIn[i] == itemToFind){
                return true;
            }
        }

        return false;
    }
}
