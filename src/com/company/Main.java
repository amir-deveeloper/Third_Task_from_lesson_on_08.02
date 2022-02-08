package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        String[] names;

        names = new String[n+1];

        for (int i = 0; i < n+1; i++){

            names[i] = scanner.nextLine();


        }

        int max = names[0].length();
        String maximum = "";

        for (int i = 0; i < names.length; i++){

            if (names[i].length() > max){

                max = names[i].length();

                maximum = names[i];
            }



        }

        System.out.println(maximum);

    }
}
