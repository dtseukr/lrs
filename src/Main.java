import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -------------------- Завдання 1: Пояснення роботи switch та Math.random() --------------------
        System.out.println("Завдання 1: Пояснення роботи випадкового вибору і switch");

        // Генеруємо випадкове значення x від 0 до 2 включно
        int x = (int) (Math.random() * 3);  // Можливі значення: 0, 1, 2

        /*
         * Використовується метод Math.random(), який повертає випадкове значення від 0.0 до 1.0.
         * Потім це значення множиться на 3, тому результатом може бути дробове число від 0.0 до 2.999...
         * За допомогою (int) ми округлюємо це значення до цілого, отже x може мати значення 0, 1 або 2.
         */

        // Використовуємо оператор switch для обробки різних значень x
        switch (x) {
            case 1:
                System.out.println("Case 1");  // Якщо x == 1, виводиться це повідомлення
                break;
            case 2:
                System.out.println("Case 2");  // Якщо x == 2, виводиться це повідомлення
                break;
            case 3:
                System.out.println("Case 3");  // Якщо x == 3, виводиться це повідомлення (проте x не може дорівнювати 3 через обмеження Math.random())
                break;
            default:
                System.out.println("default case");  // Якщо x не дорівнює 1, 2 або 3 (в даному випадку тільки x == 0), виконується цей код
        }

        // Пояснювальний вивід
        System.out.println("\nПояснення:");
        System.out.println("Цей код використовує Math.random() для генерації випадкового числа x від 0 до 2.");
        System.out.println("Далі switch виконує різні дії залежно від значення x:");
        System.out.println("1. Якщо x == 1, виводиться 'Case 1'.");
        System.out.println("2. Якщо x == 2, виводиться 'Case 2'.");
        System.out.println("3. Якщо x == 0, виконується гілка 'default', і виводиться 'default case'.");



    }
}