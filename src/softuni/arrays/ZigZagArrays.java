package softuni.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[4];
        int[] array2 = new int[4];

        for(int i = 0; i < n; i++){
            int[] integerArr = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if(i % 2 == 0){
                array1[i] = integerArr[0];
                array2[i] = integerArr[1];
            }else{
                array1[i] = integerArr[1];
                array2[i] = integerArr[0];
            }
        }
        for(int num: array1){
            System.out.printf("%d ", num);
        }
        System.out.println();
        for(int num: array2){
            System.out.printf("%d ", num);
        }
    }
}
