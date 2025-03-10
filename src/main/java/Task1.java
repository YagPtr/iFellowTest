/**
 * Задача 1 - легкая:
 * Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
 *
 * Для генерации случайного числа использовать метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class Task1 {
    public static void main(String[] args) {
        int size = 100;
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {                         // Заполнение массива
            numbers[i] = (1000) * Math.random();
        }
        double min = numbers[0];
        double max = numbers[0];
        double sum = 0;
        for (double num : numbers) {                             //Итерация по массиву
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double average = sum / size;                            //Поиск среднего значения.
        System.out.println("Сгенерированный массив:");          //Вывод массива
        for (double num : numbers) {
            System.out.printf("%.2f ; ", num);
        }
        System.out.println("\nМинимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
