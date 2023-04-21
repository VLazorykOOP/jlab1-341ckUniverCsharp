//Лабораторна робота №1
//Завдання 4

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // розбиваємо текст на масив слів  
        String[] words = text.split("[\\s,.!?;:-]+");

        // перетворюємо кожне слово
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstLetter = word.charAt(0);
            // замінюємо всі наступні входження першої літери на порожній рядок
            words[i] = word.replace(String.valueOf(firstLetter), "").replace(" ", "");
        }

        // формуємо рядок зі словами масиву
        String result = String.join(" ", words);
        System.out.println("Result: " + result);
    }
}
