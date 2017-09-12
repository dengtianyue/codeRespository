package algorithmLearning;

import java.util.Scanner;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 所以f(n)=f(n-1)+f(n-2)+...+f(1)
 * 因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
 * 所以f(n)=2*f(n-1)
 * 此类题型也可先算几个找找规律
 */
public class JumpFloorII {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = 0;
        while(cin.hasNextInt()){
            n = cin.nextInt();
            System.out.println(jumpFloor(n));
        }
    }

    public static int jumpFloor(int target){
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        return 2 * jumpFloor(target - 1);
    }
}
