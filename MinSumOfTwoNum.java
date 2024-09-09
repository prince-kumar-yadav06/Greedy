import java.util.*;
public class MinSumOfTwoNum{

    public static Long MinSum(int arr[]){

        // step 1 create PriorityQueue
        PriorityQueue<Integer> PQ=new PriorityQueue<>();

        // step 2 store all value of arr in Pq
        for( int x : arr){
            PQ.add(x);
        }

        // step 3 remove all element from PQ and store in num1 and num2

        StringBuilder num2=new StringBuilder();
         StringBuilder num1=new StringBuilder();

        while(!PQ.isEmpty()){
            num1.append(PQ.poll()+"");

            if(!PQ.isEmpty()){
                num2.append(PQ.poll()+"");
            }
        }

        Long sum=Long.parseLong(num1.toString())+ Long.parseLong(num2.toString());

        return sum;
    }


    //   approach 2 without using PriorityQueue 

    public static int solution(int arr[]){

        // step 1 sort the arr
        Arrays.sort(arr);

        // step 2
       int num1=0;
       int num2=0;

    //    step 3

    for(int i=0;i<arr.length;i++){
        
        if(i%2==0){
            num1=num1*10+arr[i];
        }
        else{
            num2=num2*10+arr[i];
        }
    }

    // step 4 
     return num1+num2;

    }

    public static void main(String args[]){

        int arr[]={5,3,0,7,4};
        // int arr[]={6,8,4,5,2,3};


        System.out.println("Using PriorityQueue :"+MinSum(arr));

        System.out.println("without PriorityQueue :"+solution(arr));
    }
}
