package Array;
import java.util.*;
public class simpleOpretion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[10];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        for(int i =0; i<3;i++){
            System.err.println("marks of given : "+marks[i]);
            


        

        }
        //FOR CHAR ARRAY
        int size1 = sc.nextInt();
       char [] ch = new char[size1];
       ch[0]=sc.next().charAt(0);
       System.out.println(ch[0]);
    }
    
}
