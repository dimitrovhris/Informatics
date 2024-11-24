package maturi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DZI0520241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        Map<Integer, Integer> digits = new TreeMap<>();

        for(int currentNumber = a; currentNumber <= b; currentNumber++){
            int digitsCount = String.valueOf(currentNumber).length();
            for(int digitPosition = digitsCount; digitPosition >= 1; digitPosition--){
                int currentDigit = (int) (currentNumber / Math.pow(10, digitPosition - 1) % 10);
                if(!digits.containsKey(currentDigit)){
                    digits.put(currentDigit, 0);
                }
                digits.put(currentDigit, digits.get(currentDigit) + 1);
            }
        }
        int wantedDigit = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : digits.entrySet()) {
            int currentDigit = entry.getKey();
            int currentValue = entry.getValue();

            if(currentValue > maxValue){
                maxValue = currentValue;
                wantedDigit = currentDigit;
            }
        }
        System.out.printf("Digit %d - %d times", wantedDigit, maxValue);
    }
}
