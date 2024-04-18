import java.util.Scanner;

public class second {
    public static void second(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+"); // Розділяємо рядок на слова

        // Знаходимо довжину найкоротшого слова
        int shortestLength = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < shortestLength) {
                shortestLength = word.length();
            }
        }

        // Виводимо слова, які мають найменшу кількість літер
        System.out.println("Слова з найменшою кількістю літер:");
        for (String word : words) {
            if (word.length() == shortestLength) {
                System.out.println(word);
            }
        }
    }
}
