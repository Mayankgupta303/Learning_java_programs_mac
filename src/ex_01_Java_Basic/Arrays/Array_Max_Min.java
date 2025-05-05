package ex_01_Java_Basic.Arrays;

public class Array_Max_Min {
    public static void main(String[] args) {
        int[] array = {52, 25, 68, 47, 36, 98, 47, 105, 25, 114, 85};

        int Max_output = Give_me_max(array);
        System.out.println(Max_output);
        int Min_output = Give_me_min(array);
        System.out.println(Min_output);
    }

     static int Give_me_max(int[] array) {

        int max = array[0];
        for (int i =0; i< array.length; i++){
            if (array[i]> max){
                max = array[i];
            }
        }
        return max;
    }

     static int Give_me_min(int[] array) {

        int min = array[0];
        for (int i =0; i< array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
