package DiffTypesQuickSort;
import java.util.Arrays;

public class quicksort1 {


    

    public static void main(String[] args) {
        int [] arr = {3,5,4,6};

        int n = arr.length;

        sort(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));


    }
    
}
