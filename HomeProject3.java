import java.util.Scanner;

public class HomeProject3 {
   
    /* Реализовать простой калькулятор */
    public static void main(String[] args) {
        int res = 0;
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter first number >");
        int num1 = scan.nextInt();
        System.out.println("Enter operation: -,+,*,/");
        char oper = scan.next().charAt(0);
        System.out.println("Enter second namber:");
        int num2 = scan.nextInt();
        switch (oper) {
            case '+': res = num1 + num2;
            break;
            case '-': res = num1 - num2;
            break;
            case '*': res = num1 * num2;
            break;
            case '/': res = num1 / num2;
            break;
            default: System.out.println("Entered incorrect operation");
                break;
        }
        System.out.println(res);
    }
}
