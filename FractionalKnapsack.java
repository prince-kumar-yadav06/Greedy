import java.util.*;
public class FractionalKnapsack {

    public static int solution(int weight[],int value[],int GivenWeight){

        int N=weight.length;

        // step 1 create ratio 2D array that store ratio of weight and value 
        double ratio[][]=new double[N][2];

        for(int i=0;i<N;i++){
             
            //step 2
            // col 0 store index 
            ratio[i][0]=i;

            //col 1 store value/weight
            ratio[i][1]=value[i]/ (double)weight[i];
        }

        // step 3
        // sort ratio in accending order using lambda function
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));


        int Finalval=0;
        int capacity=GivenWeight;

        // step 4 traversing ratio arr from last
        for(int i=ratio.length-1;i>=0;i--){

            // ratio arr se index nakal lenge
            int idx=(int)ratio[i][0];

            // agar given weight me idx index pr ka weight capacity se small hai tb 
            if(capacity >= weight[idx]){
                capacity-=weight[idx];
                Finalval+=value[idx];
            }

            //agar capacity weight me idx index pr large weight ho gya capacity se to 
            // idx index pr jo value hai uska ratio value add krenge jitna jaroot hai
            else{
                Finalval+=ratio[i][1]*capacity;
                capacity=0;
                break;
            }

        }
        return Finalval;
    }

    public static void main(String args[]){
        int value[]={500};
        int []weight={30};

        int givenweight=10;

        System.out.println(solution(weight,value,givenweight));
    }
    
}
