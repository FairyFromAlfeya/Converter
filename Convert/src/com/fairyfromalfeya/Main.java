package com.fairyfromalfeya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Основание исходной системы счисления: ");
	    int a = sc.nextInt();

        System.out.print("Основание целевой системы счисления: ");
	    int b = sc.nextInt();

        System.out.print("Число, записанное в " + a + "-ричной системе счисления: ");
	    String x = sc.next();

        System.out.print("Число, записанное в " + b + "-ричной системе счисления: " + Converter.convert(x, a, b));
    }
}
