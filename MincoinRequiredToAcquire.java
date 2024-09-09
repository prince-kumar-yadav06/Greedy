import java.util.*;
public class MincoinRequiredToAcquire {
    public static int findMin(int arr[],int k){

        // step 1 sort the arr
        Arrays.sort(arr);

        // step 2 
        int N=arr.length;
        int i=0;

        int TotalReqcoin=0;

        while (i <= N) {
            TotalReqcoin += arr[i];
            i++;
            N = N -k;
        }

         return TotalReqcoin;

    }

    public static void main(String args[]){

        //  int arr[]={100,20,50,10,2,5};

         int arr[]={1,2,5,10,20,50,60,70,30,100,200,212,123};


         int k=4;

         System.out.println(findMin(arr,k));
    }
}
