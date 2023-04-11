package blackjack;

public class BlackjackTest {

		public static void main(String[] args)throws InterruptedException {
			
			System.out.println("ブラックジャックを始めます");
			 Mymoney.mymoney();
			 int MyG = Mymoney.firstmoney();
			 while(MyG > 0 && MyG<2000) {
			User.setBet();
			 User.firstHand();

		     User.hitOrStand();
		     
		     
		     
		     Dealer.hitOrStand();

		     System.out.println("プレイヤーの得点は" + User.sumPoint(User.player) + "です。");
		     System.out.println("ディーラーの得点は" + Dealer.sumPoint(Dealer.dealer) + "です。");
			
		     int pPoint = User.sumPoint(User.player);
		     int dPoint = Dealer.sumPoint(Dealer.dealer);

		     if(pPoint > 21) {
		            System.out.println("プレイヤーはバーストしました。");
		            pPoint = 0;
		        }
		        if(dPoint > 21) {
		            System.out.println("ディーラーはバーストしました。");
		            dPoint = 0;
		        }

		        if(pPoint > dPoint) {
		            System.out.println("プレイヤーの勝ちです。");
		            MyG = MyG + User.bet;
		        }else if(pPoint < dPoint) {
		            System.out.println("ディーラーの勝ちです。");
		            MyG = MyG - User.bet;
		        }else {
		            System.out.println("引き分けです。");
		        }
		        System.out.println("現在の所持金：" + MyG);
		        User.bet = 0;
			 }
		        System.out.println("ブラックジャック終了!!");
		        if(MyG <= 0) {
		        	System.out.println("あなたの負け");
		        }else {
		        	System.out.println("あなたの勝ち");
		        }
		    }
	        }

		


			