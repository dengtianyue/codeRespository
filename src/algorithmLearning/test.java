package algorithmLearning;//package main
//注意不要添加包名称，否则会报错。

import java.io.*;
import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int a = 0, b = 0,c = 0;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            b = cin.nextInt();
            c = cin.nextInt();
        }
        int left = 0;
        int right = 0;
        int result1 = 0;
        int result2 = 0;
        if((a+b)>(a*b)){
            left = a + b;
            System.out.println("left="+left);
        }else
        {
            left = a * b;
            System.out.println("left="+left);

        }

        if((b+c)>(b*c)){
            right = b + c;
            System.out.println("right="+right);

        }else
        {
            right = b * c;
            System.out.println("right="+right);
        }

        if((left*c) > (left + c)){
            result1 = left*c;
        }else{
            result1 = left + c;
        }

        if((right*a)>(right+c)){
            result2 = right*a;
        }else{
            result2 = right + a;
        }

        if(result1 > result2){
            System.out.println(result1);
        }else
        {
            System.out.println(result2);
        }
    }
}