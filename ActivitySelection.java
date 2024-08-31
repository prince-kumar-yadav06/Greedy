import java.util.*;
public class Activityselect{
    public static void solution(int Start[],int End[]){

        ArrayList<Integer> ans=new ArrayList<>();

        //first time EK activity select hoga
        ans.add(0); 

        int activity=1; 

        int Endtime=End[0];

        for(int i=1;i<End.length;i++){
            //agar start time EndTime se Bada hoga tabhi activity select hone ki possibility hai
            //chhota hoga start time to time khatam hogya hoga to start nhi krke dusro activity ko check krenge

            if(Start[i]>=Endtime){
                activity++;
                ans.add(i);
                Endtime=End[i];
            }
        }
        System.out.println("Total activity is:"+activity);

            int i=0;
        while(!ans.isEmpty() && i<ans.size()){
            System.out.println("Acitivity A"+ans.get(i));
            i++;
        }
        
    }
    public static void main(String args[]){

        int []starttime={10,12,20};
        int []Endtime={20,25,30};

        solution(starttime,Endtime);
    }
}
