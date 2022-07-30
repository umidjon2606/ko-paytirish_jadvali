package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner scanner = new Scanner(System.in);
        System.out.println("= ");
        int n = scanner.nextInt();
        int a = 1;

        for (int i = 1; i <= 10; i++) {

            a = n * i;
            System.out.println(n + " * " + i + " = " + a);

        }
    }
}



































