package com.company;
import java.util.Arrays;//
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            int n = 25;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 45 - 20);
            }
            int max =0;
            int min =0;
            int maxI =0;
            int minI =0;
            int temp = 0;
            System.out.println("МАССИВ:");
            System.out.println(Arrays.toString(array) + "\n");
            for (int i = 0; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxI = i;
                }
                if (array[i] < min) {
                    min = array[i];
                    minI = i;
                }
            }
            temp = array[maxI];
            array[maxI] = array[minI];
            array[minI] = temp;
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
            System.out.println("МАССИВ ПОСЛЕ ПЕРЕУСТАНОВКИ:");
            System.out.println(Arrays.toString(array) + "\n");
        }

    }}


