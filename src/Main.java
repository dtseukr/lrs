import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Завдання 1: Перевірка символів
        char char1 = '1';
        char char2 = 'A';
        char char3 = '$';
        // Пояснення про метод
        System.out.println("Метод Character.isLetterOrDigit(char ch) перевіряє, чи є вказаний символ літерою або цифрою.");
        System.out.println("Він повертає true, якщо символ — літера або цифра, і false в іншому випадку.");
        System.out.println();
        System.out.println("Перевірка символу '" + char1 + "': " + Character.isLetterOrDigit(char1));
        System.out.println("Пояснення: Символ '" + char1 + "' є цифрою, тому метод повертає true.");
        System.out.println();
        System.out.println("Перевірка символу '" + char2 + "': " + Character.isLetterOrDigit(char2));
        System.out.println("Пояснення: Символ '" + char2 + "' є літерою, тому метод повертає true.");
        System.out.println();
        System.out.println("Перевірка символу '" + char3 + "': " + Character.isLetterOrDigit(char3));
        System.out.println("Пояснення: Символ '" + char3 + "' не є ні літерою, ні цифрою, тому метод повертає false.");
        System.out.println("\n---------------------------------\n");
        // Завдання 2: Друк емоджі
        System.out.println("Друк трьох обраних емоджі:");
        System.out.println("😊"); // Емоджі щасливого обличчя
        System.out.println("🌍"); // Емоджі земної кулі
        System.out.println("🎉"); // Емоджі святкування
        System.out.println("\n---------------------------------\n");
        // Завдання 3: Перевірка типу речення
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть речення:");
        String sentence = scanner.nextLine();
        if (sentence.endsWith("?")) {
            System.out.println("Речення є питальним.");
        } else if (sentence.endsWith("!")) {
            System.out.println("Речення є окличним.");
        } else {
            System.out.println("Речення є звичайним.");
        }
        // Закриваємо сканер
        scanner.close();
    }
}
