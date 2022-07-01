package experiment2;

import javax.swing.JOptionPane;

public class GuessNumber {
	
	public static boolean bijiao(int a,int b) {
		if(a>b)
			return true;
		else
			return false;
	}
	void Guess() {
		System.out.println("给你一个1至100的整数，请猜测这个数");
		int realNumber=(int)(Math.random()*100)+1;
		int guessNumber=0;
		String str=JOptionPane.showInputDialog("输入你的猜测：");
		guessNumber=Integer.parseInt(str);
		while (guessNumber!=realNumber) {
			if (guessNumber>realNumber) {
				str=JOptionPane.showInputDialog("猜大了,再输入你的猜测:");
				guessNumber=Integer.parseInt(str); 
			}
			else if (guessNumber<realNumber) {
				str=JOptionPane.showInputDialog("猜小了,再输入你的猜测:");
				guessNumber=Integer.parseInt(str); 
			}
		}		
		System.out.println("猜对了！");
	}
	public static void main(String[] args) {
		GuessNumber gn=new GuessNumber();
		loop:for(;;) {
		gn.Guess();
		String str;int guessNumber;
		str=JOptionPane.showInputDialog("猜对了，是否继续？\n1.yes   2.no");
		guessNumber=Integer.parseInt(str);
		while(true) {
		if(guessNumber==2)	break loop;
		else if(guessNumber==1)	break;
		else {
			str=JOptionPane.showInputDialog("输入选项错误，请输入1或2\n1.yes   2.no");
			guessNumber=Integer.parseInt(str);
		}
		}
	}
	}
}
