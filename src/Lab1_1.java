//https://www.tutorialspoint.com/online_java_compiler.php
//Лабораторна робота №1
//Завдання 1

import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        // Вхідні дані дійсного типу, результат - дійсного
        double result1 = ((a * b - (a + b) * ( a- b))/(Math.pow(b, 4) + (Math.pow(a, 3)))) + 5 * b;

        System.out.println("Result (double): " + result1);

        // Вхідні дані цілого типу, результат - дійсного
        int aInt = (int) a;
        int bInt = (int) b;
        double result2 =((aInt * bInt - (aInt + bInt) * ( aInt- bInt))/(Math.pow(bInt, 4) + (Math.pow(aInt, 3)))) + 5 * bInt;
        System.out.println("Result (double): " + result2);

        // Вхідні дані дійсного типу, результат - цілого
        int result3 = (int) (((a * b - (a + b) * ( a- b))/(Math.pow(b, 4) + (Math.pow(a, 3)))) + 5 * b);
        System.out.println("Result (int): " + result3);
    }
}