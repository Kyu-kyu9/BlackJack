package blackjack;

	import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

	public class User extends PlayerBase{
		public static int bet;
		public static ArrayList<String> player = new ArrayList<>();
		public User(String name) {
			super(name);
		}

		public static void firstHand() {
			deck decks = new deck();
			player.add(blackjack.deck.hit());
	        player.add(blackjack.deck.hit());
	  
	        System.out.println("あなたが引いたのは" + player.get(0) + "と" + player.get(1) +"です。");
	        System.out.println("現在の得点は" + sumPoint(player) + "です。");
	    }
		
		public static void  setBet() {
			while(bet == 0) {
			try {
			System.out.println("掛金を決めてください");
			Scanner sc = new Scanner(System.in);
			bet = sc.nextInt();
			System.out.println("掛金：" + bet + "円");
			}catch(NumberFormatException e) {
				System.out.println("整数値を入力してください");
			}
			catch(InputMismatchException e) {
				System.out.println("整数値を入力してください");
			}
			}
		}

		public static void hitOrStand() {
			System.out.println("hitなら0 standなら1を選択してください");
			 Scanner sc=new Scanner(System.in);
			 int str = sc.nextInt();
			 if(str==0) {
				player.add(blackjack.deck.hit());
				System.out.println("あなたが引いたのは"+player.get(2)+"です");
				System.out.println("現在の得点は"+sumPoint(player)+"です");
				hitOrStand();
			 }else if(str==1) {
				 Dealer.firstHand();
			 }else if(str>=2) {
				 hitOrStand();
			 }
			
		}
		
		
	    }


