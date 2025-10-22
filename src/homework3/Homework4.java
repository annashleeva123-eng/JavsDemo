package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
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
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] == 0) {
                zeroCount++;

            }
        }
            if (zeroCount > 0) {
                System.out.println("кол-во нулевых элементов " + zeroCount);
            } else {
                System.out.println("нет нулевых элементов");
            }
        }
    }



