package Array.String;
import java.util.*;
public class bitmanipulation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = 1;
        int bitmask = 1<<pos;
        int not = ~(bitmask);
        int set = num&not;
        System.out.println(set);

    }
    
}
