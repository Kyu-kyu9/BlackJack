package blackjack;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
	 	public class Image extends JPanel {
	 		
	 	    static final int WIDTH = 600;  // 画面の幅
	 	    static final int HEIGHT = 600; // 画面の高さ
	 	    BufferedImage img;// 画像オブジェクト
	 	    BufferedImage img2;//画像オブジェクト
	 	 
	 	    // コンストラクタ（初期化処理）
	 	    
	 		int MyG = Mymoney.firstmoney();
	 	    public Image() {
	 	    
	 	    	if(MyG==2000) {
	 	        setPreferredSize(new Dimension(WIDTH,HEIGHT));
	 	        // 画像ファイルの読み込み
	 	        try {
	 	            img = ImageIO.read(new File("win.jpg"));
	 	        } catch (Exception e) {
	 	            System.out.println(e);
	 	            System.exit(0);
	 	        }
	 	        
	 	    	}else if(MyG==0){
	 	    		setPreferredSize(new Dimension(WIDTH,HEIGHT));
	 		        // 画像ファイルの読み込み
	 		        try {
	 		            img2 = ImageIO.read(new File("lose.jpg"));
	 		        } catch (Exception e) {
	 		            System.out.println(e);
	 		            System.exit(0);
	 		        }	
	 	    	}
	 	    }
	 	 // 画面描画
	 	    public void paintComponent(Graphics g) {
	 	        // 背景
	 	        g.setColor(Color.black);
	 	        g.fillRect(0, 0, WIDTH, HEIGHT);
	 	        // 画像の表示
	 	        g.drawImage(img, 0, 0, null);
	 	        g.drawImage(img2, 0, 0, null);
	 	    }
	 	  
	 	    // 起動時
	 	    public static void main(String[] args) {
	 	    	
	 	        JFrame f = new JFrame();
	 	        f.getContentPane().setLayout(new FlowLayout());
	 	        f.getContentPane().add(new Image());
	 	        f.pack();
	 	        f.setResizable(false);
	 	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	        f.setVisible(true);

	 }
	 	}


