package blackjack;
import java.util.ArrayList;
	public class PlayerBase {
		static final int BURST_POINT = 21;
		
		private final String name;
		private boolean isBURST = false;				//バーストしたかどうか
		private int bet;
		
		public PlayerBase(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
	   public boolean isBurst() {
			if(score > 21) {
				return true;
			}return false;
		}
		
	   public int getBet() {
			return bet;
	   }
		public static void hitOrStand() {
		}
		public static int sumPoint(ArrayList<String> list) {
	        int sum = 0;

	        for(int i = 0 ; i < list.size() ; i++) {
	            String[] point = list.get(i).split(",",0);
	            switch(Tranp.point(Integer.parseInt(point[1]))) {
	                case 11 : sum += 10; break;
	                case 12 : sum += 10; break;
	                case 13 : sum += 10; break;
	                default : sum += Tranp.point(Integer.parseInt(point[1])); break;
	            }
	        }

	        return sum;
	    }
	}


