import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вводим два целых числа
        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        double quotient = (b != 0) ? (double) a / b : Double.NaN; // Проверка деления на 0

        // Вывод результатов операций
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + diff);
        System.out.println("Произведение: " + product);
        if (b != 0) {
            System.out.println("Частное: " + quotient);
        } else {
            System.out.println("Частное: деление на 0 невозможно");
        }

        scanner.close();
    }
}
