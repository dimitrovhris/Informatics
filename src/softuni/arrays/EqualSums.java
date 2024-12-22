package softuni.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean found = false;
        for(int i = 0; i < array.length; i++){
            int sumLeft = 0;
            int sumRight = 0;
            for(int j = 0 ; j < i; j++){
                sumLeft += array[j];
            }
            for(int k = i + 1; k < array.length; k++){
                sumRight += array[k];
            }
            if(sumLeft == sumRight){
                found = true;
                System.out.println(i);
                break;
            }
        }
        if(!found){
            System.out.println("no");
        }
    }
}
