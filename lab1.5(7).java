import java.util.Scanner;

public class GcdThree {
    // НОД двух чисел (алгоритм Евклида)
    static int gcd(int x, int y) {
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        return Math.abs(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три целых числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = gcd(gcd(a, b), c);
        System.out.println("НОД(" + a + ", " + b + ", " + c + ") = " + result);
    }
}