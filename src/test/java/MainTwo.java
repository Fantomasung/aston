import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        // Создаем объект для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вводим две строки
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}

//Задание 2: Сравнение строк
//        Программа принимает две строки и сравнивает их. В выводе будет сообщение о том, идентичны ли строки или нет.
//Объяснение:
//        Мы используем метод equals для сравнения строк. Это проверяет, идентичны ли строки по содержимому.
//        Важно использовать equals для сравнения строк, а не ==, так как == сравнивает ссылки, а не содержимое строк.