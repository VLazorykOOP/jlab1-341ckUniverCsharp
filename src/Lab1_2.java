//Лабораторна робота №1
//Завдання 2

import java.util.Scanner;
import java.util.Random;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter n(n <= 200): ");
                n = Integer.parseInt(scanner.nextLine());

                if (n < 1 || n > 200) {
                    System.out.println("Invalid input. Enter n between 1 and 200.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter n between 1 and 200.");
            }
        }

        // Створюємо масив та заповнюємо його дійсними числами
        double[] a = new double[2 * n];
        Random rand = new Random();
        for (int i = 0; i < 2 * n; i++) {
            a[i] = rand.nextDouble() * 200 - 100;
        }

        // Виводимо масив на екран
        System.out.println("Array: ");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Обчислюємо середнє арифметичне значення чисел A(1),..., A(n)
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double avg = sum / n;

        // Знаходимо суму тих чисел із A(n+1),..., A(2n), які перевищують середнє арифметичне
        double sumExceedingAvg = 0;
        for (int i = n; i < 2 * n; i++) {
            if (a[i] > avg) {
                sumExceedingAvg += a[i];
            }
        }

        // Виводимо результат
        System.out.println("Average of A(1),..., A(n): " + avg);
        System.out.println("Sum of numbers from A(n+1),..., A(2n), that exceed average: " + sumExceedingAvg);
    }

}