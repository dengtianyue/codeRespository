package algorithmLearning;

import java.util.Scanner;

/**
 * 给你六种面额 1、5、10、20、50、100 元的纸币，假设每种币值的数量都足够多，编写程序求组成N元（N为0~10000的非负整数）的不同组合的个数。
 */
public class PatchCoins {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        int n=sc.nextInt();
        long res=count(n);
        System.out.println(res);
        }
    }


    public static long count(int n){
        if(n<=0){
            return 0;
        }
        int[] coins=new int[]{1,5,10,20,50,100};
        long[] dp = new long[n+1];
        dp[0] = 1;
        for(int i =0;i<coins.length;i++)
            for (int j = coins[i];j<=n;j++){
                dp[j] = dp[j]+dp[j-coins[i]];
            }
        return dp[n];
    }
}
