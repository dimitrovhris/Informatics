import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] heights = new int[n];
        String[] inputHeights = sc.nextLine().split(" ");

        for(int i = 0; i < heights.length ; i++){
            heights[i] = Integer.parseInt(inputHeights[i]);
        }

        int violations = 0;
        for(int i = 0; i < heights.length - 1; i++){
            if(heights[i] > heights[i+1]){
                violations++;
            }
        }
        int swaps = 0;

        for(int i = 0; i < heights.length - 1; i++){
            for(int j = 0; j < heights.length - 1 - i; j++){
                if(heights[j] > heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j+1] = temp;
                    swaps += 1;
                }
            }
        }
        System.out.println(violations);
        System.out.println(swaps);
    }
}
