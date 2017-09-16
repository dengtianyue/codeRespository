package algorithmLearning;

/**
 *输入一个链表，输出该链表中倒数第k个结点。
 * 设置两个指针,pre,last都指向头结点.
 * last先走k-1步,两个指针再一起遍历
 * 当last走到尾节点时,pre走到第k个节点
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head,int k) {
        ListNode pre=head,last=head;
        int a = k;
        int count = 0;
        while(last!=null){
            last=last.next;
            count++;
            //last走完k-1步后 第k步pre开始走
            if(count>k){
                pre=pre.next;
            }
        }
        if(count<a){
            return null;
        }
        return pre;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
