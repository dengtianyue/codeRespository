package algorithmLearning;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 随机生成20个不重复的小写字母并倒序显示
 */
public class TwentyLettersInitAndSort {
    public static void main(String[] args){
        Random r = new Random();
        List<Integer> ls = new LinkedList<Integer>();
        for(int i=0;i<20;i++){
            int randomNum = r.nextInt(122)%26 + 97;//随机生成a-z小写字母的ASCII码
            if(ls.contains(randomNum)){
                i--;
                continue;
            }
            ls.add(randomNum);
        }
        Collections.sort(ls);//排序
        Collections.reverse(ls);//翻转倒序
        for(Integer i:ls){
            System.out.print((char)(int)i+" ");//打印出结果

        }
        System.out.println();
    }
}
