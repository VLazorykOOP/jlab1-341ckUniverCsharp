//Лабораторна робота №1
//Завдання 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    boolean validInput = false;

    while (!validInput) {
        try {
            System.out.print("Enter n: ");
            n = Integer.parseInt(scanner.nextLine());

            if (n <= 0) {
                System.out.println("Invalid input. Enter valid n.");
            } else {
                validInput = true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter valid n.");
        }
    }

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