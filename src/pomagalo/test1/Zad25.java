package pomagalo.test1;

import java.util.Scanner;

public class Zad25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Enter a positive number:");
            String input = scanner.nextLine();
            if(issValidPositiveNumber(input)){
                int number = Integer.parseInt(input);
                if(numberIsSpecial(number)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
                break;
            } else{
                System.out.println("Something went wrong!");
            }
        }

    }

    private static boolean numberIsSpecial(int number) {
        int originalNumber = number;

        while (number > 0){
            int lastDigit = number % 10;
            if(lastDigit == 0 || originalNumber % lastDigit != 0){
                return false;
            }
            number /= 10;
        }
        return true;
    }

    private static boolean issValidPositiveNumber(String input) {
        try{
            int number = Integer.parseInt(input);
            return number > 0;
        } catch (Exception e){
            return false;
        }
    }
}