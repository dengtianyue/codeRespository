package algorithmLearning;//用scanner卡在百分之九十TLE    bufferedreader一直runtime error
//交卷了才发现bufferedreader用的有点问了 修改以后的代码

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while((str = bufferedReader.readLine() )!=null){
            int n = Integer.parseInt(str);
            double a[] = new double[n];
            for (int i=0; i<n; i++){
                a[i] = Double.parseDouble(bufferedReader.readLine());
            }
            double answer = 0;
            for (int i=0; i<n; ++i){
                double fastMax = findA((a[i]+180)%360, a, 0, n-1, a[i]);
                double length = Math.abs(fastMax-a[i]);
                answer = Math.max(answer, length<180?length:360-length);
            }
            System.out.printf("%.8f\n", answer);
        }
        bufferedReader.close();
    }

    public static double findA(double m, double a[], int be, int ed, double ans){
        if(ed - be <= 1) {
            ans = getAns(m, ans, a[ed]);
            ans = getAns(m, ans, a[be]);
            return ans;
        }
        int mi = (be+ed)/2;
        if(a[mi] > m){
            ans = findA(m, a, be, mi, ans);
        }
        else if(a[mi] < m){
            ans = findA(m, a, mi, ed, ans);
        }
        else {
            ans = a[mi];
        }
        return ans;
    }

    public static double getAns(double m, double ans, double ami){
        if(Math.abs(m-ans) > Math.abs(m-ami))
            return ami;
        else
            return ans;
    }
}