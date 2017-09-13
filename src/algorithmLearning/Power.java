package algorithmLearning;

import java.util.Scanner;

/** 求快速幂
  * 1.全面考察指数的正负、底数是否为零等情况。
  * 2.写出指数的二进制表达，例如13表达为二进制1101。
  * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
  * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
  */
public class Power {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double base =sc.nextDouble();
            int n = sc.nextInt();
            double res = power(base,n);
            System.out.println(res);
        }
    }


    public static double power(double base, int n) {
        double result = 1;
        int exponent;
        if(n > 0){
            exponent = n;
        }
        else if(n < 0){
            exponent = - n;
        }
        else {
            return 1;
        }

        while(exponent!=0){
            if((exponent&1) == 1){
                result = result * base;
            }
            base *= base;
            exponent>>=1;
        }
        return n>0?result:(1/result);
    }
}
