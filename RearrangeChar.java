import java.util.*;
public class RearrangeChar {
    public static String NoTWoAdjacentChar(String str){

        String ansStr=" ";
        int i=0;
        int j=str.length()-1;

        while(i < j){
            String newstr="";
            char left=str.charAt(i);
            char right=str.charAt(j);

             newstr=newstr+right;
             newstr=newstr+left;

            if(left != right){
                ansStr= newstr+ansStr;
            }
            else{
                ansStr="not possible";
                break;
            }
            i++;
            j--;
        }
        if(i == j){
            ansStr=str.charAt(i)+ansStr;
        }
        return ansStr;
    }
    public static void main(String args[]){

        // String str="aaabc";
        // String str="aabb";
        // String str="aa";
        String str="aaaabc";
        System.out.println(NoTWoAdjacentChar(str));
       
    }
}
