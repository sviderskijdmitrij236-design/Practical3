import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.print("Введіть ціле число: ");
        int integer = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double floating = scanner.nextDouble();

        scanner.nextLine(); // очищення буфера

        System.out.print("Введіть строку: ");
        String text = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean bool = scanner.nextBoolean();

        System.out.println("\n--- Форматований вивід ---");

        // 1. println
        System.out.println("1. Ціле число: " + integer);

        // 2. printf — десяткова система
        System.out.printf("2. Ціле число: %d%n", integer);

        // 3. printf — шістнадцяткова система
        System.out.printf("3. Шістнадцяткове число: %x%n", integer);

        // 4. printf — вісімкова система
        System.out.printf("4. Вісімкове число: %o%n", integer);

        // 5. printf — число з 2 знаками після коми
        System.out.printf("5. Число з плаваючою точкою: %.2f%n", floating);

        // 6. printf — число з 4 знаками після коми
        System.out.printf("6. Число з плаваючою точкою: %.4f%n", floating);

        // 7. printf — строка з шириною поля
        System.out.printf("7. Строка: %15s%n", text);

        // 8. printf — обрізана строка
        System.out.printf("8. Строка: %.5s%n", text);

        // 9. String.format
        String result = String.format("9. Логічне значення: %b", bool);
        System.out.println(result);

        // 10. Форматований вивід через System.out.format
        System.out.format("10. Число: %10.2f | Строка: %-10s%n", floating, text);

        scanner.close();
    }
}
