import java.util.Scanner;

/* Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */


public class HomeProject1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter number >");
        int number = iScanner.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= number; i++) {
            sum += i;
            mult *= i;
        }
        System.out.printf("sum of numbers: %d\n multiplication of numbers: %d\n", sum, mult);
        }
    }