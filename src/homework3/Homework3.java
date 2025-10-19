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
            mass[i] = random.nextInt(50);
        }

        // Вывод массива
        System.out.print("Случайные числа массива: ");
        for (int i = 0; i < size; i++) {
            System.out.println(mass[i] + " ");
        }
// Поиск макс и мин значения
        int minInd = 0;
        int maxInd = 0;

        for (int i = 1; i < size; i++) {
            if (mass[i] < minInd) {
                minInd = mass[i];
            }
            if (mass[i] > maxInd) {
                maxInd = mass[i];
            }
        }

        //результат
        System.out.println("Минимальный индекс: " + minInd);
        System.out.println("Максимальный индекс: " + maxInd);
    }

}
//я не поняла что значит найти индекс :) сделала похоже тож самое что с макс и мин. Давай обсудим вместе
