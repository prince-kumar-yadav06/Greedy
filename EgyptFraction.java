public class EgyptFraction {
    
    public static void solution(int nr,int dr){

        if(dr == 0 || nr == 0){
            return;
        }


        // nr =2 ,dr =4 then fraction is 1/2
        if(dr % nr== 0){
            System.out.println("1/"+dr/nr);
            return;
        }

        // nr = 4 ,dr =2 then fraction is 2
        if(nr % dr ==0){
            System.out.println(nr /dr);
            return;
        }

        if(nr > dr){
            System.out.print( nr /dr+"+");
            solution(nr%dr,dr);
            return;
        }

        // if dr > nr and dr%nr non zero
        int n= dr/nr +1;
        System.out.print("1/"+n +" "+"+" +"  ");

        // rec call for remaining
        solution(nr *n-dr,dr*n);
    }

    public static void main(String args[]){
        int nr=2,dr=5;

        solution(nr, dr);
    }
}
