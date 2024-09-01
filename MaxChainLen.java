import java.util.Comparator;
import java.util.*;

public class MaxChainLen {
    
    public static int solution(int arr1[],int arr2[]){

            int pair[][]=new int[arr1.length][2];

            for(int i=0;i<arr1.length;i++){
                pair[i][0]=arr1[i];
                pair[i][1]=arr2[i];
            }

            Arrays.sort(pair,Comparator.comparing(o->o[1]));

            int chainlen=1;
            int startNum=pair[0][0];
            int EndNum=pair[0][1];

            for(int i=1;i<pair.length;i++){
                startNum=pair[i][0];
                if(startNum >= EndNum){
                    chainlen++;
                    EndNum=pair[i][1];
                }
            }
            return chainlen;
    }
    public static void main(String args[]){

        int arr1[]={5,39,5,27};

        int arr2[]={24,60,28,40};

        System.out.print(solution(arr1,arr2));
    }
}
