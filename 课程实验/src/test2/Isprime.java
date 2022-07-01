package test2;
import java.util.Scanner;

public class Isprime {

	public static void isprime(int n) {
		boolean flag = false;
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0)
				flag=true;
		}
		if (!flag) 
			System.out.println(1);
		else
			System.out.println(0);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		isprime(n);
		scan.close();
	}
}
