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
		System.out.println("����һ��1��100����������²������");
		int realNumber=(int)(Math.random()*100)+1;
		int guessNumber=0;
		String str=JOptionPane.showInputDialog("������Ĳ²⣺");
		guessNumber=Integer.parseInt(str);
		while (guessNumber!=realNumber) {
			if (guessNumber>realNumber) {
				str=JOptionPane.showInputDialog("�´���,��������Ĳ²�:");
				guessNumber=Integer.parseInt(str); 
			}
			else if (guessNumber<realNumber) {
				str=JOptionPane.showInputDialog("��С��,��������Ĳ²�:");
				guessNumber=Integer.parseInt(str); 
			}
		}		
		System.out.println("�¶��ˣ�");
	}
	public static void main(String[] args) {
		GuessNumber gn=new GuessNumber();
		loop:for(;;) {
		gn.Guess();
		String str;int guessNumber;
		str=JOptionPane.showInputDialog("�¶��ˣ��Ƿ������\n1.yes   2.no");
		guessNumber=Integer.parseInt(str);
		while(true) {
		if(guessNumber==2)	break loop;
		else if(guessNumber==1)	break;
		else {
			str=JOptionPane.showInputDialog("����ѡ�����������1��2\n1.yes   2.no");
			guessNumber=Integer.parseInt(str);
		}
		}
	}
	}
}
