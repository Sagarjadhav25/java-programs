package Array.String.sorting;
import java.util.*;
public class insertion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int []arr = {6,4,3,2,1};
        for(int i =0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
