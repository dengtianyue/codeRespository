package algorithmLearning;

import java.util.Scanner;

public class test2 {

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        long a = 0;

        while (cin.hasNextLong()) {
            a = cin.nextLong();
            System.out.println(a);
        }
        Long b = a + 1;
        int sum = 0;
        while(true){
             sum = check(b);
            if((b-sum)>=a){
                System.out.println(b);
                break;
            }else
            {
                b++;
            }
        }


    }


    public static int check(Long a){
        int sum = 0;
        while(a / 10 != 0){
            sum += a % 10;
            a = a / 10;
        }

        sum = (int)(sum + a);
        return sum;
    }
}
