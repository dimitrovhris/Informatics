import java.util.Scanner;

public class Zad26_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valuesInput = sc.nextLine().split(" ");
        String[] limitsInput = sc.nextLine().split(" ");
        int t = Integer.parseInt(sc.nextLine());

        int[] limits = new int[Integer.parseInt(valuesInput[0])];
        for(int i = 0; i < limits.length; i++){
            limits[i] = Integer.parseInt(limitsInput[i]);
        }

        int currentStreak = 1;
        int maximumStreak = 1;
        int complexitySum = limits[0];

        for(int i = 1; i < limits.length; i++){
                complexitySum += limits[i];
                if(complexitySum <= Integer.parseInt(valuesInput[1])){
                    currentStreak ++;
                } else{
                    maximumStreak = currentStreak;
                    currentStreak = 1;
                    complexitySum = limits[i];
                }
        }
        System.out.println(maximumStreak);
    }
}
