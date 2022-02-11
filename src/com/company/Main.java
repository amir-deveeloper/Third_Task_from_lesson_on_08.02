package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");
        String[] str1 = scanner.nextLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int d = Integer.parseInt(str[1]);

        int[] num = new int[n];
        int[] rev = new int[d];
        int j = 0;

        for (int i = 0; i < n; i++){

            num[i] = Integer.parseInt(str1[i]);


        }

        for (int i = 0; i < d; i++){

            rev[i] = num[i];


        }


        for (int i = 0; i < n - d; i++){

            int k = num[i];

            num[i] = num[d+i];


        }

        for (int i = n - d; i < n; i++){

            num[i] = rev[j];
            j++;
        }






        System.out.println(java.util.Arrays.toString(num));




    }
}
