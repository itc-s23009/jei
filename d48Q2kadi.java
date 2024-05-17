class Animal {
    public void makeSound() {
        System.out.println("");
    }

    public void test() {
        System.out.println("テスト出力");
    }
}

//継承したサブクラスDogの定義
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("ワンワン");
    }
}

public class d48Q2kadi {
    public static void main(String[] args) {
        Animal a = new Dog(); // インスタンス化
        a.makeSound(); // どのような処理になるでしょう？
        a.test(); // どのような処理になるでしょう
    }
}

