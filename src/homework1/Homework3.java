package homework1;

public class Homework3 {
    public static void main(String[] args) {
        int n = 125;
        int pamPem = n / 10;
        int pamPum = n % 10;
        int a = pamPem / 10;
        int b = pamPem % 10;
        int sum = pamPum + a + b;
        System.out.println(sum);
    }
}
