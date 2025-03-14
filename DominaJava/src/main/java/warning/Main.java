package main.java.warning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            System.out.println(s);
        }

    }

}
