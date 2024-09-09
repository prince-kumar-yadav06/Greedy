
public class MaxSumOf3Stack {
    
    public static int maxsum(int s1[],int s2[],int s3[]){

        int sum1=0;
        int sum2=0;
        int sum3=0;

        for(int e : s1){
            sum1 += e;
        }

        for(int e : s2){
            sum2+= e;
        }

        for(int e : s3){
            sum3 += e;
        }


        //  step 2
        int i=0;
        int j=0;
        int k=0;

        while(!(sum1 == sum2 && sum2 == sum3 ) && (i < s1.length) && (j< s2.length) && (k < s3.length)){

            if( sum1 > sum2 ){
                if(sum1 > sum3){
                    sum1 -= s1[i];
                    i++;
                }
                else{
                    sum3 -= s3[k];
                    k++;
                }
            }
            else{
                if(sum2 > sum3){
                    sum2 -= s2[j];
                    j++;
                }
                else{
                    sum3 -= s3[k];
                    k++;
                }
            }

        }

        if(sum1 == sum2 && sum2 == sum3){
            return sum1;
        }

        return 0;
    }

    public static void main(String args[]){

        int s1[]={3,2,1,1,1};
        int s2[]={4,3,2};
        int s3[]={1,1,4,1};

        System.out.println(maxsum(s1,s2,s3));

    }
}
