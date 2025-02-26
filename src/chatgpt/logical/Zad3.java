package chatgpt.logical;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[Integer.parseInt(sc.nextLine())];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        int difference = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        int target = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if (Math.abs(target - sum) < difference){
                    difference = Math.abs(target - sum);
                    num1 = numbers[i];
                    num2 = numbers[j];
                }
            }

        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
