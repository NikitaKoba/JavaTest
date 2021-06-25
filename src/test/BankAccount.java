package test;

public class BankAccount {

    double refill(){
        balance =balance + upRefill;
        return balance;
    }

        int id;
        String name;
        double balance;
        double upRefill;



}
class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        myAccount.id=1;
        myAccount.name="Nikita";
        myAccount.balance=12.35;

        YourAccount.id=3;
        YourAccount.name="Alexa";
        YourAccount.balance=31.22;

        HisAccount.id=4;
        HisAccount.name="Zahar";
        HisAccount.balance=44.22;
        myAccount.upRefill = 147.22;
        BankAccount ref = new BankAccount();
        System.out.println("Пополнение баланса аккаунта:  " + myAccount.id + "\n" + "На сумму: " + myAccount.upRefill + "\n" + "Доступный остаток: " + myAccount.refill());

    }
}