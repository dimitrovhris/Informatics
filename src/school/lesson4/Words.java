package school.lesson4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            list.add(input);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        list.sort(comparator);
        String w = sc.nextLine();
        boolean isValid = false;
        for(String word: list){
            String trimWord = word.replaceAll("\\s+", "");
            StringBuilder trimWordReversed = new StringBuilder();
            for(int i = trimWord.length()-1; i >= 0; i--){
                trimWordReversed.append(trimWord.charAt(i));
            }
            if(trimWord.contains(w) || trimWordReversed.toString().contains(w)){
                System.out.println(word);
                isValid = true;
            }
        }
        if(!isValid){
            System.out.println("no");
        }

    }
}
