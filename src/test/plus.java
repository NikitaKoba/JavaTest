package test;
import java.util.Scanner;
public class plus {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true){//Пока истинно то
            String s = console.nextLine();//-----Создаем s с вычитываем строки
            if (s.equals("enough")){//если s равна enough то останавливаем.
                break;
            }
            else {// если нет то го вывод
                System.out.println(s);
                System.out.println();
            }
        }
        }
    }
