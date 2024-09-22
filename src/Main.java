import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // 1. Оголошення змінних
        long l = 123456L;        // змінна типу long (8 байтів)
        double d1, d2;           // змінні типу double (8 байтів)
        float f = 14.75f;        // змінна типу float (4 байти)
        char c1 = '0';           // змінна типу char (2 байти)

        // Виведемо початкові значення змінних
        System.out.println("Початкове значення змінної l (тип long, 8 байтів): " + l);
        System.out.println("Початкове значення змінної f (тип float, 4 байти): " + f);
        System.out.println("Початкове значення змінної c1 (тип char): " + c1);
    }
}
