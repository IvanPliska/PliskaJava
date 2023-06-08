import java.util.Scanner;

public class TestItem {

    public static void main(String[] args) {

        // Интерактивный ввод данных
        Scanner sc = new Scanner(System.in);

        // Задание 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
        // Данные для ввода: -1, 0, 6, 7, 8, 124
        int inp = 0;
        System.out.println("Введите число больше 7: ");

        if (sc.hasNextInt()) {
            inp = sc.nextInt();
            if (inp > 7) {
                System.out.println("Привет");
            }
        }

        // Задание 2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
        // Данные для ввода: Николай, Вячеслав, вячеслав, Slava, Вера

        String name = "";
        System.out.println("Введите Имя (с учетом Регистра): ");

        if (sc.hasNext()) {
            name = sc.next();
            System.out.println(name);
        }
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);

        } else {
            System.out.println("Нет такого имени");
        }

        // Задание 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
        // Данные для ввода:
        // 0,1,2,3,4,5,6,7,8,9
        // [1, 2, 5, 9, 27, 64, 111, 547, 123456]
        // 1 2 3 4 5 6 7 8 9 33
        // -333,-99, -33,-22,-11, -3

        String arrayElement = "";
        System.out.println("Введите массив целых чисел с разделителем ',': ");

        if (sc.hasNext()) {
            arrayElement = sc.next();
        }
        String[] arrStr = arrayElement                                                        // Значение массива можно вводить:
                .replaceAll(" ", "")                                          // - с пробелами и без;
                .replaceAll("\\]", "").replaceAll("\\[", "")  // - в квадратных скобках;
                .split(",");

        int[] arr = new int[arrStr.length];
        int counterWrite = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[counterWrite] = Integer.valueOf(arrStr[i]);
            counterWrite++;
        }
        for (int i = 0; i < counterWrite; i++) {
            if (arr[i] % 3 == 0 && arr[i] != 0) { // Исключение 0 (arr[i] != 0), так как он не является кратным 3-м
                System.out.println(arr[i]);
            }
        }
    }
}