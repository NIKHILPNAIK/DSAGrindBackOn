import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        

        int [] arr = {12, 23, 9,51, 7};

        int n = arr.length;


        for(int i=0; i< n-1;i++){
            
            int min = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[min]){
                    min =j;
                }
            }

            // So now the variable min is in the jth position So its better to swap between them
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
