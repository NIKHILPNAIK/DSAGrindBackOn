import java.util.Arrays;

public class BubbSort {
    public static void main(String[] args) {
        

        int [] arr = {12, 23, 9,51, 7};

        int n = arr.length;



        for(int i=0; i< n-1; i++)
            
            {

                
            for(int j=0; j<n-1-i ;j++)
                // I created the n-1-i bcoz n-1 as you all for array reasons and -i is bcoz it loses the reason to check the already sortedd array
                {

                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
