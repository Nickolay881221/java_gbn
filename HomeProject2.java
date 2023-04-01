/* Вывести все простые числа от 1 до 1000 */


public class HomeProject2 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
                else {
                    b = true;
                }
            }
            if (b) {
                System.out.println(i);
            }
        }
        }
    }
