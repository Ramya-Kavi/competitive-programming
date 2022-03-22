/* 3. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	  
And print the start and ending index as

Start index : <1,2>

End index: <3, 2> */

public class Problem3 {
    public static void main(String[] args) {
        String word = "WELCOMETOZOHOCORPORATION";
        char[] word_array = word.toCharArray();
        int k=0;
        char[][] arr = new char[5][5];
       
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(k < word_array.length){
                arr[i][j] = word_array[k];
                k++;
                }
            }
        }
    
        for(int i=0;i< arr.length;i++){
            for (int j = 0; j < arr.length;j++) {
                //check for left to right ----too
                if((i+2) < arr.length && (j+2) < arr.length){
                    if((arr[i][j] == 'T') && (arr[i][j+1] == 'O') && (j+2 < 5) && (arr[i][j+2] == 'O')){
                        System.out.printf("Start index : <%d,%d>", i,j);
                        System.out.println();
                        System.out.printf("End index : <%d,%d>", i,j+2);
                    }
                    System.out.println();
                    //check for top to down 
                    if((arr[i][j] == 'T') && (arr[i+1][j] == 'O') && (arr[i+2][j] == 'O')){
                        System.out.printf("Start index : <%d,%d>", i,j);
                        System.out.println();
                        System.out.printf("End index : <%d,%d>", i+2,j);
                    
                    } 
                }
            }
        }

        
       // printing the 2d array 

        /* for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        } */
    }
}
