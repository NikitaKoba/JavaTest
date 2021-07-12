package test;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Auth {
    String login(){
       String log = "Kobanv";
       Scanner t = new Scanner(System.in);
       System.out.println("Введите логин: ");
       String string = t.nextLine();
       if (!string.equals(log)){
           System.out.println("Логин веден не верно. Попробуйте еще раз");
           login();
       }
       else {
           System.out.println("Логин верен.");
           password();
       }
       return null;

    }
    String password(){
        String pwd = "5EN5LssG";
        Scanner p = new Scanner(System.in);
        System.out.println("Введи пароль: ");
        String str = p.nextLine();
        if (!str.equals(pwd)){
            System.out.println("Пароль не верен");
            password();
        }
        else {
            System.out.println("Пароль верен.");

        }
     return null;
    }
}

class AutStep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Это страница аутентификации в сервисе.");
        Auth FirstLogin = new Auth();
        FirstLogin.login();

    }

}



