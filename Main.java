import java.util.*;

public class Main {

    public static int coinChange(int[] coins, int amount) {
        int [] mindp = new int[amount+1];

        if(amount < 1 ) return 0;

        

        Arrays.fill(mindp, amount+1);

        mindp[0] =0;

        for(int i=1; i<=amount; i++){

            for(int coin:coins){
                if(coin<=i && mindp[i-coin] != amount+1){
                    mindp[i] = Math.min(mindp[i], 1+mindp[i-coin]);
                }
            }
        }

        return mindp[amount] == amount+1 ? -1 : mindp[amount];
       
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};

        int amount = 6;

        int ans = coinChange(coins, amount);

        System.out.println(ans);
    }
}