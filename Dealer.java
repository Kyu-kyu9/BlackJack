package blackjack;

import java.util.ArrayList;

	public class Dealer extends PlayerBase{
		public Dealer(String name) {
			super(name);
		}
		
		public static ArrayList<String> dealer = new ArrayList<>();
		
		
		 public static void firstHand() {
			 dealer.add(blackjack.deck.hit());
		     dealer.add(blackjack.deck.hit());
		     System.out.println("ディーラーが引いたのは" + dealer.get(0) + "でもう一枚は裏です。");
		 }
		
		 
		
		 public static void hitOrStand() {
			
			 if(Dealer.sumPoint(Dealer.dealer)<17) {
			 System.out.println("ディーラーの2枚目は" + dealer.get(1) + "でした。");
	         int j = 2;
	         while(PlayerBase.sumPoint(dealer) < 17) {
	             dealer.add(deck.hit());
	             System.out.println("ディーラーは" + dealer.get(j) + "を引きました。");
	             System.out.println("ディーラーの現在の得点は" + sumPoint(dealer) + "です。");
	             j++;
	         }
	     }else if(Dealer.sumPoint(Dealer.dealer)>=17){
	         hitOrStand(); 
	     	}

		 }
	}


