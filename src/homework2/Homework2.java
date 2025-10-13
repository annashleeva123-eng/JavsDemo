package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //запрос температуры
        System.out.print("Введите температуру: ");
        int t = scanner.nextInt();
        //Проверка условий
        if (t > -5) {
            System.out.println("Warm");
        } else if (-20 >= t) {
            System.out.println("Cold");
        } else {
            System.out.println("Normal");
        }
        scanner.close();
    }
}
