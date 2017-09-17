package algorithmLearning;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * 设置三个指针,pre为前一节点,head为当前节点,next为当前节点的下一节点
 * 需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
 * 用next节点保存下一节点防止丢失,此时循环让head指向pre,反转后再让pre,head,next依次指向下一节点
 */
public class ReverseList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
