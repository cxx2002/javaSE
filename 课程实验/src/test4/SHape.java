package test4;

import java.util.Scanner;
import java.lang.Math;

public abstract class SHape {

	public static class round extends SHape{
		private int r;
		public round() {
			// TODO 自动生成的构造函数存根
		}
		public round(int r) {
			this.r=r;
		}
		public void name() {
			System.out.printf("area=%.2f",Math.PI*this.r*this.r);
		}
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int b=Sc.nextInt();
		round a=new round(b);
		a.name();
		Sc.close();
	}
}
