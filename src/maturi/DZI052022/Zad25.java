package maturi.DZI052022;

import java.util.Scanner;

public class Zad25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Моля, въведете a:");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Моля, въведете b:");
            int b = Integer.parseInt(sc.nextLine());

            if(a <= 0){
                if(b < 0){
                    double x = Math.sqrt(1.0 * b / a);

                    System.out.printf("Решенията са (-inf; -%.2f) U (%.2f; +inf)%n", x,x);
                } else{
                    System.out.println("Всички числа са решения");
                }
            } else{
                if(b > 0){
                    double x = Math.sqrt(1.0 * b / a);
                    System.out.printf("Решенията са: (-%.2f; %.2f)%n", x, x);
                } else{
                    System.out.println("Няма реални решения");
                }
            }
        } catch(Exception e){
            System.out.println("Некоректно въведено число");
        }
    }
}
