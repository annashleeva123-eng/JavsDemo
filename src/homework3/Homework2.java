package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
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
            mass[i] = random.nextInt(50);
        }

        // Вывод массива
        System.out.print("Случайные числа массива: ");
        for (int i = 0; i < size; i++) {
            System.out.println(mass[i] + " ");
        }
// Поиск макс и мин значения
        int min = mass[0];
        int max = mass[0];

        for (int i = 1; i < size; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }

        //результат
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}