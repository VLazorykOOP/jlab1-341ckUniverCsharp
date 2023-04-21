//Лабораторна робота №1
//Завдання 3

import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Створення матриці та заповнення її комп'ютером  
        double[][] A = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = Math.random() * 10; // Випадкове дійсне число від 0 до 10
            }
        }

        // Обчислення вектора B
        double[] B = new double[n];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += A[i][j];
            }
            B[i] = sum / n;
        }

        // Виведення матриці A та вектора B на екран
        System.out.println("Matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%8.2f ", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("Vector B:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%8.2f ", B[i]);
        }
    }
}