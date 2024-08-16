// s23009
/*
今回はDouble型なので、IntgerではなくDouble.parseDoubleを使う。
 */

public class d49Q26kadai {
    public static void main(String[] args) {
        d49Q26kadai obj = new d49Q26kadai();
        double i = Double.parseDouble(args[0]);
        obj.show(i);
    }
    void show(double n){
        System.out.println("value is " + n);
    }
}
