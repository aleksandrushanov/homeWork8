import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        // Задание 3
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i <number.length; i++) {

            if ( number[i] % 2 !=0) {
                number[i]++;
            }
        }
        System.out.println(Arrays.toString(number));



    }
}
