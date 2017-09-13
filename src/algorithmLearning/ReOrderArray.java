package algorithmLearning;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        if(array.length==0||array.length==1)
            return;
        int oddCount=0,oddBegin=0;
        int[] newArray =new int[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1)
                oddCount++;
        }
        for(int i =0;i<array.length;i++){
            if(array[i]%2==1)
                newArray[oddBegin++]=array[i];
            else
                newArray[oddCount++]=array[i];
        }
        for(int i =0;i<array.length;i++){
            array[i]=newArray[i];
        }
    }
}
