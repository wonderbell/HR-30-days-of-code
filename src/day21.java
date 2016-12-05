import java.lang.reflect.Array;
import java.util.ArrayList;

public class day21 {

    public static <T> void printArray(T[] arr){
        for(T item:arr){
            System.out.println(item);
        }
    }

    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        ArrayList<Integer> ar = new ArrayList<>();

        printArray( intArray  );
        printArray( stringArray );

        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
