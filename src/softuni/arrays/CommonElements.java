package softuni.arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array1 = sc.nextLine().split(" ");
        String[] array2 = sc.nextLine().split(" ");
        for(String el1: array2){
            for (String el2: array1){
                if(el1.equals(el2)){
                    System.out.printf("%s ",el1);
                }
            }
        }
    }
}
