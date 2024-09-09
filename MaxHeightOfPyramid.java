
import java.util.*;
public class MaxHeightOfPyramid {
    
    public static int solution(int arr[]){

        // step 1 sort arr 
        Arrays.sort(arr);

        // step 2 initialize top object and count number of object 

        int top_width=arr[0]; // 10 hai top pe
        int top_count=1; // abhi top pr ek objeect hai

        // step 2 curr object
        int curr_width=0;
        int curr_count=0;

        int ans=1;

        // step 3
        for(int i=1;i<arr.length;i++){

            curr_width+=arr[i];
            curr_count+=1;

            // top ka width curr ke width se jyada hian tb top ke liche object rakhenge

            if(curr_width > top_width && curr_count > top_count){
                top_width=curr_width;
                top_count=curr_count;

                // and curr_width and curr_count ko 0 krde
                curr_count=0;
                curr_width=0;

                ans++;
            }
        }

        return ans;
    } 
    public static void main(String args[]){

        // int arr[]={10,20,30,50,60,70};
        int arr[]={40,100,20,30};

        System.out.println(solution(arr));
    }
}
