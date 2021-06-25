package test;

public class methodOverloading {
    void show(int i1){
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }
    void Show(String s1){
        System.out.println(s1);
    }
}
class methodOverloadingtest{
    public static void main(String[] args) {
        methodOverloading mO = new methodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "privet";
        mO.Show(s);
    }
}