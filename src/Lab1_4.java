//Лабораторна робота №1
//Завдання 4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+"); // розділяємо текст на масив слів
        StringBuilder result = new StringBuilder(); // створюємо StringBuilder для збереження результату

        for (String word : words) {
            char firstLetter = word.charAt(0); // отримуємо першу літеру слова
            result.append(firstLetter); // додаємо першу літеру до результату

            // видаляємо всі наступні входження першої літери
            for (int i = 1; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (letter != firstLetter) {
                    result.append(letter);
                }
            }

            result.append(" "); // додаємо пробіл після слова
        }

        System.out.println("Result: " + result.toString().trim()); // виводимо результат
    }
}
