/* 1. Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M  */

import java.util.Scanner;
public class PrintOddLetter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.next();
        Pattern(str);
        sc.close();
       
    }

    public static void Pattern(String str){
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for(int j=0; j< len; j++){
                if( (i==j) || (i+j == len-1))
                    System.out.print(str.charAt(j));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
