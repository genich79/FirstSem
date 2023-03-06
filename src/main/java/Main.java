//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Случайное число i в диапозоне от 0 до 2000
        int i = new Random().nextInt(0, 2000 + 1); // int i = (int) ( Math.random() * 2000 );
        System.out.println("Случайное число i: " + i);

        System.out.println("Случайное число i в двоичном представлении: " + Integer.toBinaryString(i));

        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = (Integer.toBinaryString(i).length());
        System.out.println("Номер старшего значащего бита n: " + n);

        int[] arr = IntStream.rangeClosed(i, Short.MAX_VALUE).toArray();
//        System.out.print(Arrays.toString(arr));
//
        int j;
        for (j = i; j <= arr.length; j++) {
            if (arr[j] % n == 0) {

                System.out.print(Arrays.toString(new int[]{arr[j]}) + ", ");

//        for (m = i; m <= Short.MAX_VALUE ; m++) ;
//        if (m % n == 0) ;
//        int[] array = new int[0];
//        array[m] = i++;
//        System.out.print(Arrays.toString(array));
            }
        }
    }
}