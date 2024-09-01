import java.util.*;
public class MinSumOfAbsDiffOFPair {
    public static int solution(int A[],int B[]){

        // step 1 sort both array 
        Arrays.sort(A);
        Arrays.sort(B);

            int sum=0;

        for(int i=0;i<A.length;i++){
            sum+=Math.abs(A[i]-B[i]);
        }
        return sum;
    }
    public static void main(String args[]){
        int a[]={3,2,1};
        int b[]={2,1,3};

        // int a[] = {4, 1, 8, 7};
        // int b[] = {2, 3, 6, 5};

        System.out.println(solution(a, b));
    }
}
