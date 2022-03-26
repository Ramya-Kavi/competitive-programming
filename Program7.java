
/* Remove unbalanced parentheses in a given expression.

    Eg.) Input  : ((abc)((de))
         Output : ((abc)(de))  

         Input  : (((ab)
         Output : (ab)  */


import java.util.Scanner;

public class Program7 {
    public static String minRemoveToMakeValid(String s) {
        char[] ch=s.toCharArray();
        
        //left to right 
        //)---> (
        int count=0;
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                count++;
            }
            else if(ch[i]==')'){
                if(count>0){
                    count--;
                }
                else{
                    ch[i]=0;
                }
            }
        }
        
        //right->left
        // ( ----> )
        count=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]==')'){
                count++;
            }
            else if(ch[i]=='('){
                if(count>0){
                    count--;
                }
                else{
                    ch[i]=0;
                }
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            if(c!=0){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression....");
        String str = sc.next();
        String res = minRemoveToMakeValid(str);
        System.out.println(res);
       sc.close();
    }
}
