// s23009
/*
public class は一つだけ。
getter と setter は外部で使わないといけないので publicと記述しなければならない
setterで定義したのはgetterで表示させる。
 */

class Temper {
    private double temperature; // 湿度
    public double getTemperature() {return temperature;} // privateからpublicに記述
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class d52Q2kadai {
    public static void main(String[] args) {
        Temper t = new Temper();
        t.setTemperature(17.2);
        System.out.println(t.getTemperature());
    }
}