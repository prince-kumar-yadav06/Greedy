public class SumofDigit {
    
    public static int[] sol(int s,int d){

        if(s==0){
        System.out.println("not possible for 0");
        
        }

        //suppose s=38  d=4  then we have to put on 4 digit but 9*4=36 so for 38 putting on 4 digit place is not possible
        if(s > 9*d){
            System.out.println("Not possible");
        }

        s=s-1;
        int ans[]= new int[d];

        for(int i=d-1;i>0;i--){
            if(s > 9){
                ans[i]=9;
                s=s-9;
            }
            else{
                ans[i]=s;
                s=0;
            }
           
        }
        // last me index 0 pr s+1 store kr denge
        ans[0]=s+1;

        return ans;
    }
    public static void main(String args[]){
        int s=9;
        int d=3;

        int ret[]=sol(s,d);

        for(int i=0;i<ret.length;i++){
            System.out.print(ret[i]);
        }
    }
}
