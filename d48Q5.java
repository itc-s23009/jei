// s23009

class d48Q5 {
	public static void main(String[] args) {
		int[] numbers = new int[args.length]; // 引数の長さの配列を作る

		for (int i = 0; i < args.length; i++) { // 与えられた値をすべて配列へ格納する (28) ア
			numbers[i] = Integer.parseInt(args[i]);
		}

		for (int nextMinIndex = 0; nextMinIndex < numbers.length - 1; nextMinIndex++) { // 配列の全体を並べ替え対象にする(29)
												// ア
			// numbers.length -1 の理由は、最後の要素を除くすべてを対象にするため
			int minIndex = nextMinIndex;
			int minValue = numbers[nextMinIndex];
			for (int checkIndex = nextMinIndex
					+ 1; checkIndex < numbers.length; checkIndex++) {
				if (numbers[checkIndex] < minValue) { // minIndex,
									// minvalueを更新するための条件式 (30)
									// ェ
					minIndex = checkIndex;
					minValue = numbers[minIndex];
				}
			}
			// 交換
			int t;
			t = numbers[nextMinIndex];
			numbers[nextMinIndex] = numbers[minIndex];
			numbers[minIndex] = numbers[minIndex];
		}
		for (int n : numbers) { // 拡張for文
			System.out.println(numbers[n] + " ");
		}
	}
}
