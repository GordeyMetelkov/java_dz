import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {
        task1(args);
        
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
}