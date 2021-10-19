package Homework4;

public class Task2 {
    public static void main(String[] args) {
        int max = 0;
        int min = 10000;
        int count = 0;
        int sum = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
            System.out.println(array[i]);
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] % 10 == 0) {
                count++;
                sum+=array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
        System.out.println(sum);
    }
}
