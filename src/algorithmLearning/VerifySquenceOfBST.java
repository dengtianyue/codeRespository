package algorithmLearning;

/**
 * 二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

 * 对于后序遍历来说，序列数组的最后一个元素一定是根节点,
 * 则根据这个元素，将前面的数组分为左、右两个部分，左侧部分都小，右侧部分都大，
 * 如果右侧部分有比该根节点小的元素，那么就不是后序遍历,如此递归进行
 */
public class VerifySquenceOfBST {
    public boolean verifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length==0)
            return false;

        return isBST(sequence,0,sequence.length-1);
    }

    public boolean isBST(int [] sequence,int start,int end){
        if(start>=end){
            return true;
        }
        //当前根节点
        int curElement = sequence[end];
        int splitIndex;
        //查找分割点
        for(splitIndex = start;splitIndex < end && sequence[splitIndex] < curElement;splitIndex++);
        //判断右边序列有没有比根节点大的
        for(int i =splitIndex;i<end;i++){
            if (sequence[i]<curElement)
                return false;
        }

        return isBST(sequence,start,splitIndex-1)&&isBST(sequence,splitIndex,end-1);
    }
}
