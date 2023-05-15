package com.epam.training.student_andrey_davydenko;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Hello, nice to meet you, " + input);
    }
}
