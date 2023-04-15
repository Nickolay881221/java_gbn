package Task1Sem2;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

/* Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

    
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\user\\Desktop\\GeekBrains\\Java_gbn\\Hometask\\Task1Sem2\\file.json")) {
            int c;
            String str = "select * from students where ";
            StringBuilder strBuild = new StringBuilder(str);
            
            while((c=reader.read())!=-1){
                char symbol = (char)c;
                if (Character.isLetter(symbol) | Character.isDigit(symbol) | symbol == (char)' ' | symbol == (char)':') {
                strBuild.append(symbol);// построчно добавляем символы к исходной строке
                }  
            }
            
            String result = strBuild.toString(); // перевод/ в String для удаления null
            int stopPosition = result.indexOf("null"); 
            int startPosition = 0;
            Boolean test = true;
            while (test) {
                for (int i = stopPosition; i >=0; i--) {
                    if (result.charAt(i) == ' ') {
                        startPosition = i;
                        test = false;
                        break;
                    }
                }
            }
            String delete = result.substring(startPosition, stopPosition+4); // формирование подстроки которая будет исключаться из результата
            /* System.out.println(delete); */
            String finalResult = result.replace(delete, ""); // формирвоание конечной строки с учетом удаления ненужной части
            System.out.println(finalResult);
         
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        } 
        
}
}
    
