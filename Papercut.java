import java.util.*;
public class Papercut {
    public static int MinSquare(int a,int b){
        //bas case
        if(a==b){
            return 1;
        }

        Map<String,Integer> memo=new HashMap<>();

        String key=a +","+ b;

        if(memo.containsKey(key)){
            return memo.get(key);
        }

        // a always be grater than if not swap a,b
        if(a <b){
            int temp=a;
            a=b;
            b=temp;
        }
        // cut larget possible square (b*b) and find solution for remaining rectangle
        int MinSq=1+ MinSquare(a-b,b);

        // store result in memo
        memo.put(key,MinSq);

        return MinSq;

    }

    public static void main(String args[]){

        int a=18;
        int b=12;

        System.out.println(MinSquare(a, b));
    }
}
