package algorithmLearning;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1 {

    /**
     *用1（1自身左移运算，其实后来就不是1了）和n的每位进行位与，来判断1的个数
     *1的二进制是 前面都是0，最后一位为1，也就是只有一个1，每次向左移位一下，使得flag的二进制表示中始终只有一个位为1，
     *每次与n做位与操作，这样就相当于逐个检测n的每一位是否是1了。
     */
    public static int numberOf1_low(int n){
        int flag = 1;
        int count = 0;
        while(flag != 0){
            if((n & flag) != 0){
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    /**
     *﻿如果一个整数不为0，那么这个整数至少有一位是1。如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0
     *原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。其余所有位将不会受到影响。
     * 把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.
     * 那么一个整数的二进制有多少个1，就可以进行多少次这样的操作
     */
    public static int numberOf1(int n){
        int count = 0;
        while(n!=0){
            ++count;
            n = (n-1)&n;
        }
        return count;
    }
}
