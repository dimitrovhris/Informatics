package maturi.DZI082024.zad28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try(Scanner sc = new Scanner(new FileInputStream("src/maturi/DZI082024/zad28/input.txt"))){
            while(sc.hasNextLine()){
                String input = sc.nextLine();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
