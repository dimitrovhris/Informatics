package softuni.arrays;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(sc.nextLine());
        }
        for(int num: array){
            System.out.printf("%d ", num);
        }
        System.out.println();
        System.out.println(IntStream.of(array).sum());
    }
}
