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

// -------------------- Завдання 2: Обчислення виразу Y --------------------
        System.out.println("\nЗавдання 2: Обчислення Y залежно від значення X");

// Запитуємо користувача ввести значення X
        System.out.print("Введіть ціле число X: ");
        int X = scanner.nextInt();
        double Y;  // Результат виразу Y

// Визначаємо вираз залежно від значення X
        if (X < 0) {
// Якщо X < 0, обчислюємо Y = 3X^3 - 12X + 4
            Y = 3 * Math.pow(X, 3) - 12 * X + 4;
            System.out.println("X < 0. Вираховуємо Y за формулою Y = 3X^3 - 12X + 4.");
        } else if (X == 0) {
// Якщо X == 0, то Y = 0
            Y = 0;
            System.out.println("X == 0. Y дорівнює 0.");
        } else {
// Якщо X > 0, обчислюємо Y = ((X^4 - 11)(X^4 + 11)) / sqrt(X)
            Y = ((Math.pow(X, 4) - 11) * (Math.pow(X, 4) + 11)) / Math.sqrt(X);
            System.out.println("X > 0. Вираховуємо Y за формулою ((X^4 - 11)(X^4 + 11)) / sqrt(X).");
        }

        // Виводимо результат обчислення Y
        System.out.println("Значення Y: " + Y);
        // -------------------- Завдання 3: Вітання користувача за часом --------------------
        System.out.println("\nЗавдання 3: Вітання користувача залежно від часу");

        // Запитуємо у користувача поточний час у форматі "година: хвилина"
        System.out.print("Введіть час у форматі 'година: хвилина' (наприклад, 14:30): ");
        scanner.nextLine();  // Щоб спожити символ нової лінії після nextInt()
        String time = scanner.nextLine();

        // Розділяємо введений час на години і хвилини
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        // Визначаємо привітання за годиною
        if (hour >= 0 && hour < 12) {
            System.out.println("Добрий ранок");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Добрий день");
        } else if (hour >= 17 && hour < 22) {
            System.out.println("Добрий вечір");
        } else {
            System.out.println("Добраніч");
        }
    }
}