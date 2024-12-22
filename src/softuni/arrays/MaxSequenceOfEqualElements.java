package softuni.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sequenceBegin = 0;
        int sequenceEnd = 0;

        for(int i = 0 ; i < array.length - 1; i++){
            int currentBegin = i;
            while (i < (array.length - 1) && array[i] == array[i+1]){
                i++;
            }
            if(i - currentBegin  > sequenceEnd - sequenceBegin){
                sequenceBegin = currentBegin;
                sequenceEnd = i;
            }
        }
        for(int i = sequenceBegin; i <= sequenceEnd; i++){
            System.out.printf("%d ", array[i]);
        }
    }
}