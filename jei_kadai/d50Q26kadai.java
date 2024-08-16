// s23009
/*
for 文のCondition.values() で中身をとりだす
そして表示

 */
enum Condition {ROAD, MUD, SNOW}

class d50Q26kadai {
    public static void main(String[] args) {
        int c = Condition.values().length;
        for (Condition condition : Condition.values()) {
            System.out.println(condition);
        }
    }
}
