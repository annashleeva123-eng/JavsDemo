package homework2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //запрос числа
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        //Проверка четности
        if (a % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
        scanner.close();
    }
}
