import java.util.*;

public class JobShequence {
 
    // job ,dadeline, profit ka node bana lenge
         static class job{
            int SeqId;
            int dadeline;
            int profit;
        
       public job(int id,int dline,int profit){
            this.SeqId=id;
            this.dadeline=dline;
            this.profit=profit;
        }
    }

        public static void solution(int[][] arr){

            // arraylsit ko job node type bana denge 
            ArrayList<job> jobs=new ArrayList<>();

            for(int i=0;i<arr.length;i++){
                // jobs arraylist me hr index pr job,dadeline,profit store kre denge
                jobs.add(new job(i,arr[i][0],arr[i][1]));
            }

            // sort kr denge jobs ko profit ke basis pr
            Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
    

    // arraylist to store job seq
    ArrayList<Integer> ans=new ArrayList<>();
    int time=0;
    

    for(int j=0;j<jobs.size();j++){
        // i index ke liye jobs se node nikale
        job curr=jobs.get(j);

        // agar curr node ka dadeline greater than hai time se
        if(time < curr.dadeline){
            ans.add(curr.SeqId);
            time++;
        }
    }

    System.out.println("total jobs is :"+time);

    // print job sequence
    for(int i=0;i<ans.size();i++){
        System.out.println("Job seuence for max Profit is:"+ans.get(i));
    }

}   

public static void main(String args[]){

    int arr[][]={{40,20},
                {1,10},
                {1,40},
                {1,30}};

                solution(arr);
}
}
 

