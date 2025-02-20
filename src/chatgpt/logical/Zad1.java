package chatgpt.logical;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for(int i = 1; i <= n; i++){
            int digitsSum = 0;
            int currentNumber = i;
            while (currentNumber != 0){
                int lastDigit = currentNumber % 10;
                digitsSum += lastDigit;
                currentNumber /= 10;
            }
            if(i % digitsSum == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
