package softuni.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            int firstNumber = array[0];
            for (int j = 0; j < array.length-1; j++){
                array[j] = array[j+1];
            }
            array[array.length-1] = firstNumber;
        }
        for(int num: array){
            System.out.printf("%d ", num);
        }
    }
}
