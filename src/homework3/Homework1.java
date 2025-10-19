package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
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
        //прямой порядок
        System.out.print("Значения массива в прямом порядке: ");
        for (int i = 0; i < size; i++) {
            System.out.println(mass[i] + " ");
        }
        //обратный порядок
        System.out.println("Значения массива в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(mass[i] + " ");
        }
    }
}

