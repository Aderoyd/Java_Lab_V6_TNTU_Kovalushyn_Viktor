import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//ЗАВДАННЯ 1 ВАРІАНТ 6 !!!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово: ");
        String word = scanner.nextLine();

        // Відкриває файл для читання
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/user/pipipupu"))) {
            String line;

            // Читає рядки з файлу
            while ((line = reader.readLine()) != null) {
                String[] sentences = line.split("[.!?]");

                // Перевіряємо кожне речення, чи містить воно введене слово
                for (String sentence : sentences) {
                    if (sentence.toLowerCase().contains(word.toLowerCase())) {
                        System.out.println(sentence.trim());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Помилка читання файлу: " + e.getMessage());
        }
// ЗАВДАННЯ 2 ВАРІАНТ 6 !!!
        String filename = "/home/user/cars";

        // Створення HashMap для зберігання к-ті автомобілів кожної марки
        HashMap<String, Integer> carCounts = new HashMap<>();

        // Відкриває файл для читання
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Читає рядки з файлу
            while ((line = reader.readLine()) != null) {
                // Розділення : рядок на марку, номер і прізвище власника
                String[] carInfo = line.split(", ");

                // Перевіряємо, чи рядок містить достатньо елементів
                if (carInfo.length >= 1) {
                    // Отримання марки автомобіля
                    String brand = carInfo[0];

                    // Перевірка порожний/не порожній марка
                    if (!brand.isEmpty()) {
                        // Оновлюємо кількість автомобілів цієї марки в HashMap
                        carCounts.put(brand, carCounts.getOrDefault(brand, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Помилка читання файлу: " + e.getMessage());
        }

        // Результат
        System.out.println("Кількість автомобілів кожної марки:");
        for (String brand : carCounts.keySet()) {
            int count = carCounts.get(brand);
            System.out.println(brand + ": " + count);
        }
    }
}