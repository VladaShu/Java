package Homework4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < 8; j++) {
                sum += array[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);
    }
}