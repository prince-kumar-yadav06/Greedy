import java.util.*;

public class FractionalKnapsack {

    // profit weight ka node bana le
   static class Node{
         double profit;
        double weight;

        // p=profit  w=weight
        Node(double p,double w){
            this.profit=p;
            this.weight=w;
        }
    }
    
    public static double MaxProfit(Node arr[],int capacity){

        Double maxProfit=0.0;

        int currweight=capacity;

       int i=0;

       while(currweight > 0){

        if((arr[i].weight) < currweight){
            currweight -= arr[i].weight;
            maxProfit += (double)arr[i].profit;
            i++;
        }
        else{
            // agar currweight se jayda weight hai to fraction part lenge
            double N=arr[i].profit/arr[i].weight;
            maxProfit +=(double)(N * currweight);
            currweight -=arr[i].weight;
        }
       }
       return maxProfit;
    }

    public static void main(String args[]){

        // Node arr[]={new Node(60,10),
        //                 // new Node(100,20),
        //             // new Node(120,30)};
        
        // int capacity=50;
        Node arr[]={new Node(500, 30)};
        int capacity=10;

            System.out.println(MaxProfit(arr,capacity));

    }
}
