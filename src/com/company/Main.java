package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите А");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите В");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        int sum, i;
        sum = 0;
        i = 0;
        do {
            sum = sum + a;
            i++;
        } while (i < b);
        System.out.println(sum);
    }
}