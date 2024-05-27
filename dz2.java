import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        task2(args);
    }
    public static void task1(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = in.nextInt();
        System.out.println("Введите степень x: ");
        int x = in.nextInt();        
        System.out.println(MyPow(n, x));;
    }
    public static int MyPow(int n, int x) {
        if (x == 0) {
            return 1;
        }
        else if (x == 1) {
            return n;
        }
        else {
            return n * MyPow(n, x - 1);
        }
    }
    public static void task2(String[] args) {
        System.out.println(PowOfTwo(5, 2));
    }
    public static boolean PowOfTwo(int n, int x) {
        if (n == 1) {
            return true;
        }
        else if ((n > 1 && n < 2) || (n % 2 == 1)) {
            return false;
        }
        else {
            return PowOfTwo(n/2, x);
        }
    }
}
