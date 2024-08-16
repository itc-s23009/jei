// s23009
/*
中央地を表示するものを追加
int型ではなくdouble型。
許して。
 */

public class d49Q6kadai02 {
    public static void main(String[] args) {
        int[] nums = new int[args.length];

        int i = 0;
        for (String arg : args) {
            nums[i++] = Integer.parseInt(arg);
        }
        Analyzer analyzer = new Analyzer();
        analyzer.setNums(nums);
        System.out.println(analyzer.analyze());
    }
}
class Analyzer {
    int[] nums;

    void setNums(int[] nums) {
        this.nums = nums;
    }
    String analyze() {
        StringBuilder sb = new StringBuilder();

        double avg = getAverage();
        sb.append("平均値:" + avg + "\n");

        int r = getRange();
        sb.append("値の範囲:" + r + "\n");

        int[]counts = getHighLowCouts(avg);
        sb.append("平均より大きい値の個数:" + counts[0] + " 平均より小さい値の個数:" + counts[1] + "\n");

        double median = getMedian();
        sb.append("中央値: " + median + "\n");
        return sb.toString();
    }
    double getAverage() {
        double sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum / nums.length;
    }
    int getRange() {
        int min = 1000, max = -1000;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    int[] getHighLowCouts(double avg) {
        int high = 0, low = 0;
        for (int n : nums) {
            if (n < avg) {
                low++;
            }
            if (n > avg) {
                high++;
            }
        }
        return new int[]{high, low};
    }
    double getMedian() {
        int[] sortedNums = nums.clone();
        java.util.Arrays.sort(sortedNums);
        if (sortedNums.length % 2 == 0) {
            return (sortedNums[sortedNums.length / 2 - 1] + sortedNums[sortedNums.length / 2]) / 2.0;
        } else {
            return sortedNums[sortedNums.length / 2];
        }
    }
}