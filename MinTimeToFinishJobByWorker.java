public class MinTimeToFinishJobByWorker {
public static int getmax(int job[],int n){

    int result=0;
    for(int i=0;i<n;i++){
        if(result < job[i]){
            result=job[i];
        }
    }
    return result;
}

public static boolean ispossible(int time,int k,int[] job,int n){

    //cnt count current assignees
    int cnt=1;

    int currtime=0;

    for(int i=0;i<n;){
        if(currtime+job[i] > time){
            currtime=0;
            cnt++;
        }
        else{
            currtime += job[i];
            i++;
        }
    }
    return (cnt <= k);
}
    public static int Mintime(int [] job,int k,int t,int n){
        // step 1 set start ans end for binary search
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            end+=job[i];  //end maximum time hoga
        }

        //initialize ans 
        int ans=end;

        // step 2 fint max job time
        int max_job=getmax(job,n); //getmax return maxjob time

        // step 3
        while(start <= end){
            int mid=(start+end)/2;
            if(mid >=max_job && ispossible(mid,k,job,n)){ //ispossible() return boolean
                ans=Math.min(ans,mid);
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans*t;
    }

    public static void main(String args[]){

        int job[]={4,5,10};
        int k=2;
        int t=5;
        int n=job.length;

        System.out.println(Mintime(job,k,t,n));
    }
}
