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


//Задание 1: Сравнение чисел и выполнение операций
//        Программа принимает два целых числа и выполняет следующее:
//        Сравнивает их и выводит результат сравнения.
//        Выполняет операции сложения, вычитания, деления и умножения, выводя их результаты.
//Объяснение:
//        Мы используем Scanner для ввода данных с консоли.
//        Программа сравнивает числа a и b с помощью условных операторов.
//        Затем выполняются операции сложения, вычитания, умножения и деления. При делении на 0 проверяется, чтобы не было ошибки.