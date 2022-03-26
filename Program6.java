
/* 1) Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.

    Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
         Output : {7, 1, 6, 2, 5, 3, 4}  */
         
         
import java.util.Arrays;
public class Program1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(arr);

        int i=0, j = arr.length-1;

        while(i < j){
            System.out.print(arr[j--]+" ");
            System.out.print(arr[i++]+" ");
        }

        if(arr.length % 2 != 0)
            System.out.print(arr[i]);

    }
    
}
