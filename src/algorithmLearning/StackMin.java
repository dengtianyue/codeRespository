package algorithmLearning;

import java.util.Stack;

/**
 * ﻿定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 ﻿* 1.dataStack为存储数据的栈，minStack为存储最小值的栈；
 * 2.push的时候将value值与minStack中的top值比较，小则minStack push value，大则push top值
 */
public class StackMin {
    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int node) {
        dataStack.push(node);
        //判断空要在前面 否则会报空栈异常
        if(minStack.isEmpty() || node < minStack.peek()){
            minStack.push(node);
        }else{
            minStack.push(minStack.peek());
        }
    }
    public void pop() {
        dataStack.pop();
        minStack.pop();
    }
    public int top() {
        return dataStack.peek();
    }
    public int min() {
        return minStack.peek();
    }
}
