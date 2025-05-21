package recursion;

public class recursion1 {
    public static void recursion(int n, int m){
        if(n==0 ||m==6){
            return;
        }
            
            System.out.println(n+" "+m);
            recursion(n-1, m+1);
        }

    
    public static void main(String[] args) {
        recursion(5,1);
    }
    
}
