public class parameterisedrecursion {
    public static void main(String[] args) {
        

        int n = sumadd(3, 0);

        System.out.println(n);
    }


    public static int sumadd(int i, int sum){

        if(i<1){
            
            return sum;
        }


        return sumadd(i-1, sum+i);
    }
}
