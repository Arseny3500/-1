import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён");
            return;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
    }
}