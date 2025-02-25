package chatgpt.logical;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        int primeCount = 0;
        for (int i = m; i <= n; i++) {
            if (isPrimeNumber(i))
                primeCount++;
        }

    }

    static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Преминаваме през масива многократно
        for (int i = 0; i < n - 1; i++) {
            // Във всяка итерация преминаваме през масива и сравняваме съседни елементи
            for (int j = 0; j < n - 1 - i; j++) {
                // Ако текущият елемент е по-голям от следващия, ги разменяме
                if (arr[j] > arr[j + 1]) {
                    // Размяна на елементи
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
