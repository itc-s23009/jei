// s23009
/*
コマンドラインから引数を受け取る。
switch の記述がめんどいのでラムダ式に変更
 */
public class d50Q27kadai {
    public static void main(String[] args) {
        int control = Integer.parseInt(args[0]);
        String mode = "";

        switch (control) {
            case 1 -> mode = "Warm";
            case 2 -> mode = "Cool";
            case 3 -> mode = "Wind";
            default -> mode = "hoge";
        }
        System.out.println(mode);
    }
}
