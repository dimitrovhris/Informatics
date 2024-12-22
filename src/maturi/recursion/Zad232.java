package maturi.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Zad232 {
    public static void main(String[] args) {
        ArrayList<Object> alist = new ArrayList<> (Arrays.asList(4,3,"Pepo"));
        String[] names = {"Koko", "Emi"};
        alist.addAll(Arrays.asList(names));
        alist.add(1, 3);
        alist.remove(4);
        alist.remove((Object)3);
        for (Object elem : alist) {
            System.out.print(elem + " ");
        }
    }
    private static double rec(int n){
        if(n == 1){
            return Math.sqrt(1);
        }
        return Math.sqrt(n + rec(n-1));
    }
}
