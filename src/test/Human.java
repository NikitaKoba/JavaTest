package test;

public class Human {
    String name;
    Car3 car;
    BankAcc bA;

    void info(){
        System.out.println("Name: " + name + " Color Car: " + car.color + " Balance bank Acc: " + bA.balance + bA.Valuta);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red","V8");
        h.bA = new BankAcc(18,200.5,'$');
        h.info();
    }
}

class Car3{
    Car3(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAcc{
    BankAcc(int id2,double balance2,char Valuta2){
        id=id2;
        balance = balance2;
        Valuta = Valuta2;
    }
    int id;
    double balance;
    char Valuta;
}