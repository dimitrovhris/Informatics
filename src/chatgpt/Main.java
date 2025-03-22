package chatgpt;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("HOLOH"));
    }
    //11
    public static boolean isPalindrome(String string){
        StringBuilder sb = new StringBuilder(string);
        String reversed = sb.reverse().toString();
        return string.equals(reversed);
    }

    //12
    public static int charFrequency(String string, char ch){
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    //13
    public static void reverseWorld(){
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb.reverse());
    }
    //14
    public static String longestString(List<String> strings){
        String shortest = strings.get(0);
        for (String string: strings){
            if(string.length() < shortest.length()){
                shortest = string;
            }
        }
        return shortest;
    }
    //15
    public static String replace(String string){
        return string.replace(' ', '_');
    }
    //16
    public static List<String> sorted(List<String> list){

        Collections.sort(list);
        return list;
    }

    //17


}
