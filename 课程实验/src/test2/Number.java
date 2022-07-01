package test2;
import java.util.Scanner;

public class Number {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i*10+j)*(j*10+i)==n) {
					b=i;a=j;
				}
			}
		}
		if(a==0&&b==0)
			System.out.println("No Answer");
		System.out.print(a);
		System.out.print(b);
		sc.close();
	}
}
