/* 2. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number

And sort the numbers based on the weight and print it as follows

<10,its_weight>,<36,its weight><89,its weight>

Should display the numbers based on increasing order. */

public class Weight {
    public static void main(String[] args) {
        int[] num = {10, 36, 54, 89, 12};
        int[] sum_arr = new int[num.length];
        int square_num =0;

        for(int i=0;i<num.length;i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] > num[j]){
                    int temp_num = num[i];
                    num[i] = num[j];
                    num[j] = temp_num;
                }
            }
        }

        for(int i=0;i< num.length;i++){
           square_num = (int)Math.sqrt(num[i]);
           if((square_num*square_num) == num[i])
               sum_arr[i] += 5;

           if(((num[i] % 4) == 0)&&((num[i] % 6) == 0))
               sum_arr[i] += 4;

           if((num[i] % 2) == 0)
               sum_arr[i] += 3;    
               
           System.out.printf("<%d,%d>,",num[i], sum_arr[i]);
        }
    }
}
