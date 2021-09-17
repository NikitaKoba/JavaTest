import java.util.Scanner;

public class WhIle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;//Присвоить МИН значение
        while (console.hasNextInt()){// Пока вводятся целые числы
            int x = console.nextInt();//Собираем ввод в x
            if (x < min) {//Если x < min
                min = x;// min = x
            }
            }
        System.out.println(min);
        }
    }

