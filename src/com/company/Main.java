package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numbers;
        int[] numbers1;
        int[] numbers2;

        int d = 0;

        int s = 0;
        int k = 0;

        int m = 1;
        int l = 1;

        numbers = new int[n];


        for (int i = 0; i < n; i++){

            int a = scanner.nextInt();

            numbers[i] = a;

        }

            d = n/2;

        numbers1 = copyOfRange(numbers, 0, d);
        numbers2 = copyOfRange(numbers, d, n);

        for(int i = 0; i < numbers1.length; i++){

            s = s + numbers1[i];

        }

        for(int i = 0; i < numbers2.length; i++){

            k = k + numbers2[i];

        }

        for(int i = 0; i < numbers1.length; i++){

            m = m*numbers1[i];

        }

        for(int i = 0; i < numbers2.length; i++){

            l = l*numbers2[i];

        }

        System.out.println("The sum of the element in the first subarray: " + s);
        System.out.println("The sum of the element in the second subarray: " + k);
        System.out.println("The piece(произведение) of the element in the first subarray: " + m);
        System.out.println("The piece(произведение) of the element in the second subarray: " + l);

        int a = m + l;


        System.out.println("The sum of the pieces of the two subarrays: " + a);

    }
}
