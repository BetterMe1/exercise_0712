package exercise.exercise_0711;

/*
走楼梯
 */
import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        if(n<=1){
            return 1;
        }
        int d1 = 1;
        int d2 = 2;
        int d3 = 4;
        for(int i=4; i<=n; i++){
            int temp = ((d1+d2)%1000000007+d3)%1000000007;//可以从下面第一、二、三个台阶跳上来
            d1=d2;
            d2=d3;
            d3=temp;
        }
        return d3;
    }
}