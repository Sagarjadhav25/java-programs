package patterns;
import java.util.*;
public class factorialnumber {
    public static int facto(int a){
        if(a==0){
            return 1;

        }
        else{
            return a*facto(a-1);
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int number = sc.nextInt();
        System.out.println(facto(number));
    }

    
}
