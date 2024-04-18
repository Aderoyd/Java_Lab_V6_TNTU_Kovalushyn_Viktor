import java.util.Scanner;

//Завдання 1 Варіант 6
// Скласти програму, яка підраховує кількість великих літер у тексті .
//для роботи Завдання забрати коментарі
// рядок 7-27
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        int uppercaseCount = countUppercaseLetters(text);

        System.out.println("Кількість великих літер у тексті: " + uppercaseCount);
    }
    public static int countUppercaseLetters(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
}
*/
//Завдання 2 Варіант 6
//Скласти програму, яка виводить на екран слова, що мають найменшу кількість літер.
// рядок 33-57
/*public class Main {
    public static void main(String[] args) {
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
*/
//Завдання 3 Варіант 6
//Скласти програму, яка виводить на екран слова, що мають найменшу кількість літер.
// рядок 61-81
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+"); // Розділяємо рядок на слова

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Перевіряємо чи починається слово з великої літери
            if (Character.isUpperCase(word.charAt(0))) {
                result.append(word).append(" "); // Додаємо слово до результату
            }
        }

        System.out.println("Результат:");
        System.out.println(result.toString().trim()); // Виводимо результат, видаляючи зайві пробіли
    }
}
*/

