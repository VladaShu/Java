package Homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum = 0;
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
            if (array[i] > 8) {
                count++;
            }
            if (array[i] == 1) {
                count2++;
            }
            if (array[i] % 2 == 0) {
                count3++;
            }
            if (array[i] % 2 != 0) {
                count4++;
            }
        }
        for (int num : array) {
            sum = sum + num;
        }
            System.out.println("Длина массива : " + array.length);
            System.out.println("Количество чисел больше 8 : " + count);
            System.out.println("Количество чисел равных 1 : " + count2);
            System.out.println("Количество четных чисел : " + count3);
            System.out.println("Количество нечетных чисел : " + count4);
            System.out.println("Сумма элементов массива равна: " + sum);
    }
}
