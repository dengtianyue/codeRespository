package algorithmLearning;

import java.util.Scanner;

/**
 * 斐波那契数列 1 1 2 3 5 ....
 */
public class FibonacciSequence{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = 0;
        while(cin.hasNextInt()){
            n = cin.nextInt();
            System.out.println(fibonacciByRecursion(n));
        }

    }

    //迭代解法
    public static int fibonacciByIteration(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int numf1 = 0;
        int numf2 = 1;
        int sum = 0;
        for(int i=2;i<=n;i++){
            sum=numf1 + numf2;
            numf1 = numf2 ;
            numf2 = sum ;
        }
        return sum;
    }

    //递归解法
    public static int fibonacciByRecursion(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fibonacciByRecursion(n-1)+fibonacciByRecursion(n-2);
    }
}
