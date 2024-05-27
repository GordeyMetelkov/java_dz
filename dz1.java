import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {
        task4(args);
        
    }
    public static void task1(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void task2(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = in.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        System.out.println(mult);
    }
    public static boolean IsPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void task3(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (IsPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static void task4(String[] args) {
        // Реализовать простой калькулятор
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Выберите действие ('+', '-', '*', '/'): ");
        String action = in.next();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        if (action.equals("+")) {
            System.out.println(Sum(a, b));
        }
        else if (action.equals("-")) {
            System.out.println(Subtrac(a, b));
        }
        else if (action.equals("*")) {
            System.out.println(Mult(a, b));
        }
        else if (action.equals("/")) {
            System.out.println(Div(a, b));
        }
        else {
            System.out.println("Введите корректную операцию, попробуй снова");
        }
    }
    public static int Sum(int a, int b) {
        return a + b;
    }
    public static int Subtrac(int a, int b) {
        return a - b;
    }
    public static int Mult(int a, int b) {
        return a * b;
    }
    public static float Div(float a, float b) {
        return a / b;
    }
}