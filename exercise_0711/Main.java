package exercise.exercise_0711;

/*
锤子剪刀布（20)
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> str = new ArrayList<>();
        str.add("B");
        str.add("C");
        str.add("J");
        int[] n1 = {0,0,0};//记录哪个胜的多
        int[] n2 = {0,0,0};
        int[] n3 = {0,0,0};//记录胜、平、负数
        int[] n4 = {0,0,0};
        while(n>0){
            String atmp = in.next();
            String btmp = in.next();
            if(atmp.equals(btmp)){//平
                n3[1]++;
                n4[1]++;
            }else{
                int aindex = str.indexOf(atmp);
                int bindex = str.indexOf(btmp);
                if((aindex+1)%3 == bindex){//甲胜已负
                    n1[aindex]++;
                    n3[0]++;
                    n4[2]++;
                }else{//已胜甲负
                    n2[bindex]++;
                    n3[2]++;
                    n4[0]++;
                }
            }
            n--;
        }
        System.out.println(n3[0]+" "+n3[1]+" "+n3[2]);
        System.out.println(n4[0]+" "+n4[1]+" "+n4[2]);
        int n1_i =0;
        int n2_i =0;
        for(int i=1; i<3; i++){
            if(n1[i] > n1[n1_i]){
                n1_i = i;
            }
            if(n2[i] > n2[n2_i]){
                n2_i = i;
            }
        }
        System.out.println(str.get(n1_i)+" "+str.get(n2_i));
    }
}