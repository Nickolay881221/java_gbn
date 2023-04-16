package Task1Sem2;

import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Task2 {
    /* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл. */

    /* private static Logger log = Logger.getLogger(Task2.class.getName());
  static {
    try {
      InputStream stream = Task2.class.getClassLoader()
          .getResourceAsStream("log.xml");
        LogManager.getLogManager().readConfiguration(stream);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
 */

    public static void bubbleSort(int[] sortArr) {
        
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        /* log.log(Level.INFO, "тестовое логирование"); */
        Logger log = Logger.getLogger(Task2.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        /*  FileHandler fh = new FileHandler("log.xml");  */// с выводом в файл возникает ошибка, похоже дело в конфигурации. Разбираюсь.
        log.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        /* XMLFormatter xml = new XMLFormatter(); */
        ch.setFormatter(sFormat);
        /* fh.setFormatter(xml); */
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter lenght of array fo sort >");
        int number = iScanner.nextInt();
        iScanner.close();
        int[] sortArr = new int[number];
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = (int)(Math.random() * 100);
        }
            bubbleSort(sortArr);
            for(int i = 0; i < sortArr.length; i++){
                System.out.print(sortArr[i] + " ");
            }
        log.info("тестовое логирование");
    }

}
