package Array.String;
import java.util.*;
public class Strings {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        for(int i = 0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());
    }
    
}
