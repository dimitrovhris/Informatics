package school.lesson2;

import java.util.*;

public class Couples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        Set<Integer> numbers = new HashSet<>();
        int aloneNumber = 0;

        while(number != 0){
            if(!numbers.contains(number)){
                aloneNumber = number;
            }
            numbers.add(number);
            number = Integer.parseInt(sc.nextLine());
        }
        System.out.println(aloneNumber);
    }
}
