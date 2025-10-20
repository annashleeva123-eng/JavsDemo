package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создание массива
        int[] mass = new int[size];

        // Заполнение случайными числами
        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(50); // случайные числа от 0 до 49
        }

        // Вывод массива
        System.out.print("Случайные числа массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");
        }

        // Поиск минимального и максимального значений и их индексов
        int min = mass[0];
        int max = mass[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (mass[i] < min) {
                min = mass[i];
                minIndex = i;
            }
            if (mass[i] > max) {
                max = mass[i];
                maxIndex = i;
            }
        }

        // Результат
        System.out.println("Минимальное значение: " + min + " (индекс " + minIndex + ")");
        System.out.println("Максимальное значение: " + max + " (индекс " + maxIndex + ")");
    }
}