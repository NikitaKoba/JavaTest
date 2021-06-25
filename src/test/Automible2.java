package test;

public class Automible2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("cvet " + color + " " + "motor " + engine + " " + "skorost " + speed);
    }
}
class Automoblie2Test{
    public static void main(String[] args) {
        Automible2 c1 = new Automible2();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;
        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(100);
        c1.showInfo();
    }
}

