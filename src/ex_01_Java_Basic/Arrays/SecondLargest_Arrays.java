package ex_01_Java_Basic.Arrays;

public class SecondLargest_Arrays {
    public static void main(String[] args) {
        int[] array = {52, 25, 68, 47, 36, 98, 47, 105, 25, 114, 85,767};

        int Max_output = Give_me_max(array);
        System.out.println(Max_output);

    }

    static int Give_me_max(int[] array) {

        int max = array[0];
        for (int i =0; i< array.length-2; i++){
            if (array[i]> max){
                max = array[i];
            }
        }
        return max;
    }


}



