package test2;
import java.util.Scanner;

public class Salary {

	public static double fun (double s) {
		int t=0;
		if(s<1000)
			t=0;
		else if(s<2000)
			t=1;
		else if(s<3000)
			t=2;
		else if(s<4000)
			t=3;
		else
			t=4;
		switch(t) {
		case 0:
			break;
		case 1:s=0.9*s;
			break;
		case 2:s=0.85*s;
			break;
		case 3:s=0.8*s;
			break;
		case 4:s=0.75*s;
			break;
		default:
			break;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double s=sc.nextDouble();
		System.out.printf("%2.2f",fun(s));
		sc.close();
	}

	
}
