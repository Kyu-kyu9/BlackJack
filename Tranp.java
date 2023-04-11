package blackjack;

public class Tranp {	static  int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		static String[] patterns = { "ハート", "スペード", "ダイヤ", "クローバー" };

		public static int point(int num) {
			if (num == 11 || num == 12 || num == 13) {
				num = 10;
}
			return num;
		}
	}


