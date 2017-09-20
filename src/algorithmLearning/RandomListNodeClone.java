package algorithmLearning;

/**
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 *
 * 解题思路：
 * 1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
 * 2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
 * 3、拆分链表，将链表拆分为原链表和复制后的链表
 */
public class RandomListNodeClone {

    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }

        RandomListNode currentNode = pHead;
        //1、复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面
        while(currentNode!=null){
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }

        currentNode = pHead;
        //2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
        while(currentNode!=null){
            currentNode.next.random = currentNode.random == null?null:currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        currentNode = pHead;
        RandomListNode pCloneNode = pHead.next;
        //3、拆分链表，将链表拆分为原链表和复制后的链表
        while(currentNode!=null){
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
            currentNode = currentNode.next;
        }
        return pCloneNode;
    }







    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}
