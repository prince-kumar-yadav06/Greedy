import java.util.*;

public class IndianCoin {
    public static void solution(Integer coins[],int value){

        int Len=coins.length;

        // sort coins arr in descending order
        // int type ke liye sort function kaam nhimkrega isliye Integer type kr de coins arr ko
        Arrays.sort(coins,Comparator.reverseOrder());

        // ans arraylist to store ans
        ArrayList<Integer> ans=new ArrayList<>();

        int CountCoin=0;
        int amount=value;

        for(int i=0;i<Len;i++){

            //agar ith index wala coin small hai amount se to below wala kaam hoga
            if(coins[i] <= amount){

                // har i index ke liye while loop chalega
                while(coins[i] <= amount){
                    CountCoin++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println("Total coins required to make change :"+CountCoin);

        // Print coin
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }

    public static void main(String args[]){
        Integer arr[]={1,2,5,10,20,50,100,500,2000};

        // int value=590;
        int value=121;


        solution(arr,value);
    }
}
