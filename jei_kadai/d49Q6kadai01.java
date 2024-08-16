// s23009
/* コマンドライン引数を連結して表示するプログラム */

public class d49Q6kadai01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (String arg : args) {
            sb.append(arg);
        }

        System.out.println(sb.toString());
    }
}
