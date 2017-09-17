package algorithmLearning;


/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeList {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 递归解法:
     * 比较两个链表当前节点,若List1当前节点小于List2当前节点,则list1.next=Merge(list1.next,list2)
     */
    public ListNode mergeByRecursion(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val<=list2.val){
            list1.next=mergeByRecursion(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeByRecursion(list1,list2.next);
            return list2;
        }
    }

    /**
     * 非递归解法
     * 设置一个头指针mergeHead和一个当前指针current
     * 遍历,先判断头指针是否为空,为空则头指针保存较小值
     * 后每次current指针指向较小值.且较小值节点向后移动
     * 必有一个链表先遍历完,此时将未遍历完的链表添加至尾部即可
     */
    public ListNode mergeByIteration(ListNode list1,ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode current = null;
        ListNode mergeHead = null;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                if(mergeHead == null){
                    mergeHead = current = list1;
                }
                else {
                    current.next = list1;
                    current = current.next;
                }
                list1 = list1.next;
            }else {
                if(mergeHead == null){
                    mergeHead = current = list2;
                }
                else {
                    current.next = list2;
                    current = current.next;
                }
                list2 = list2.next;
            }
        }
        if(list1==null){
            current.next = list2;
        }else {
            current.next = list1;
        }
        return mergeHead;
    }
}
