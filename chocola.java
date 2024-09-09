import java.util.*;
public class Chocola {

    public static void solution(Integer verCost[],Integer horCost[]){

        // step 1 sort both arr
        Arrays.sort(verCost ,Collections.reverseOrder());
        Arrays.sort(horCost ,Collections.reverseOrder());

        // step 2 
        int h=0;  //for horcost index
        int v=0;  //for verCost index
        int hp=1;  //for horizontal peice
        int vp=1;  //for vertical peice
        int cost=0;

        while(h < horCost.length && v < 
        verCost.length){
             
            if(verCost[v] <= horCost[h]){       //horizontal cost chhota hai to horizontal cut lagega  

                // vp se multiply isliye hoga Qki horizontal cut lgne pr   vertical peice increase hoga
              
                 cost += (horCost[h] * vp);        
                 h++;
                 hp++;
            }
            else{      //vartical cost chhota hai to horizontal cut lagega 

                // vp se multiply isliye hoga Qki horizontal cut lgne pr   vertical peice increase hoga
                cost += (verCost[v] * hp);      
                v++;
                vp++;
            }
        }

        // while loop se bahar aa gyue pr kisi me abhi bhi kuchh bacha hai to check kr le

        while(h < horCost.length){
            cost+=(horCost[h] * vp);        
            h++;
            hp++;
        }

        while(v < verCost.length){
            cost+=(verCost[v] * hp);        
            v++;
            vp++;
        }

        System.out.println("max cost is :"+ cost);

    }
    
    public static void main(String args[]){

        Integer verCost[]={2,1,1,3,4};

        Integer horCost[]={4,1,2};

        solution(verCost,horCost);
    }
}
