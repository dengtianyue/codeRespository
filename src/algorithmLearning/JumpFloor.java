package algorithmLearning;

import java.util.Scanner;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 类似斐波那契数列 1 2 3 5 8 13 ....
 */
public class JumpFloor {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = 0;
        while(cin.hasNextInt()){
            n = cin.nextInt();
            System.out.println(jumpFloorByRecursion(n));
        }

    }

    //迭代解法
    public static int jumpFloorByIteration(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        int numf1 = 1;
        int numf2 = 2;
        int sum = 0;
        for(int i=3;i<=n;i++){
            sum=numf1 + numf2;
            numf1 = numf2 ;
            numf2 = sum ;
        }
        return sum;
    }

    //递归解法
    public static int jumpFloorByRecursion(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return jumpFloorByRecursion(n-1)+jumpFloorByRecursion(n-2);
    }
}
