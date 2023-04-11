package blackjack;
	import java.util.ArrayList;
import java.util.List;
import java.util.Random;


	public class deck {
		static List<String> decks = new ArrayList<>();

		public deck() {
			for (String pattern : Tranp.patterns) {
				for (int num : Tranp.nums) {
					decks.add(pattern + "の," + num);
				}
			}
		}

		public static String hit() {
			Random r = new Random();
			String a = String.valueOf(decks.get(r.nextInt(decks.size())));
			decks.remove(decks.indexOf(a));
			return a;
		}
	}


