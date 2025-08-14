import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array1 {
    public static void main (String [] args){
        List<Integer> list = Arrays.asList(10,20,30);

        int[] arr = new int[] {10,5,4,3,12,8};
        Arrays.sort(arr, 1,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
