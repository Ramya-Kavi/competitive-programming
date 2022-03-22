/* 5. Given a two dimensional array of string like

  <”luke”, “shaw”>
  <”wayne”, “rooney”>
  <”rooney”, “ronaldo”>
  <”shaw”, “rooney”> 
Where the first string is “child”, second string is “Father”.
And given “ronaldo” we have to find his no of grandchildren 
Here “ronaldo” has 2 grandchildren. So our output should be 2. */
import java.util.Scanner;


public class Problem5 {
    public static void main(String[] args) {
        String[][] family = { {"luke", "shaw"},
                            {"wayne", "rooney"},
                            {"rooney", "ronaldo"},
                            {"shaw", "rooney"},
        };

        String child = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person name to check his grandson's");
        String check = sc.next();
        int count=0;
        int son_count =0;
        for (int i = 0; i < family.length; i++) {
            if(family[i][1].equals(check)){
                child = family[i][0];
                son_count++;
                System.out.println("son of "+ check+ " is " + family[i][0]);
            }
        }
        for (int i = 0; i < family.length; i++) {
            if(family[i][1] == child){
                count++;
            }
        }
        System.out.println("The no of grand children for "+check+ " is "+ count);
        System.out.println("The no of children for "+check+ " is "+ son_count);
        sc.close();
    }
}
