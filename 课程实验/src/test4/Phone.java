package test4;

import java.util.Scanner;

public class Phone {

	//private String code;
	
	public interface Payable {
		void pay();
	}
	
	public static class MobilePhone extends Phone implements Payable{
		private int time;
		private double price;
		public MobilePhone(int a,double b) {
			this.price=b;
			this.time=a;
			// TODO �Զ����ɵĹ��캯�����
		}
		@Override
		public void pay() {
			// TODO �Զ����ɵķ������
			System.out.printf("Fee=%.1f",this.time*this.price);
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		double b=scanner.nextDouble();
		
MobilePhone cMobilePhone=new MobilePhone(a,b);
		cMobilePhone.pay();
		scanner.close();
	}
}
