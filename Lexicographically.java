import java.util.*;
public class Lexicographically {
    public static void SmallestLexicoArr(int arr[],int n,int k){

        // step 1 i=0 to n && k>0 bcqz we have to swap only k time
        for(int i=0;i<n-1 && k>0;i++){

            // pos batayenga kaha se swap krna hai
            int pos=i;

            for(int j=i+1;j<n;j++){

                //agar j-i>k hai to j loop se break kr jayenge
                if(j-i > k){
                    break;
                }

                //jab tk j ka next index value greater hai prev se tb tk pos ko change krte rehenge

                if(arr[j] < arr[pos]){
                    pos=j;
                }
            }
            // j loop se bahar aa ke swap kr denge
            int temp;
            for(int j=pos;j>i;j--){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            // update k value
            k=k-pos-i;
        }
    }
    public static void main(String args[]){

        int arr[]={7,6,9,2,1};
        int k=1;
        int n=arr.length;

        SmallestLexicoArr(arr, n, k);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
