package softuni.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < array.length; i++){
            boolean error = false;
            for (int j = i + 1; j < array.length; j++){
                if(array[i] <= array[j]){
                    error = true;
                    break;
                }
            }
            if(!error){
                System.out.printf("%d ", array[i]);
            }
        }
    }
}
