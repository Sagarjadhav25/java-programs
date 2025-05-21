package recursion;

public class recursion2 {
    public static void printfib(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        printfib(b, a+b, n-1);

    }
    public static void main(String[] args) {
        int n = 10;
        printfib(0, 1, n);
    }
    
}
