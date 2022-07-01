package pk1;
import java.util.*;


public class Test {

	private static void extracted(String s1) {
		System.out.println(s1);
	}

	private static int extracted(int a, int b, int sum) {
		for(int i=0;i<b;i++)
		{
			int j=0;
			j++;
			sum+=(a+b+i+j);
		}
		return sum;
	}
	
	private static void extracted() {
		System.out.println("hello wprld!");
	}
	
	public static void main(String[] args) {
		
		int a=2;
		int b=0;
		Scanner scan=new Scanner(System.in);
		b=scan.nextInt();
		
		String s1="hello";
		String s2="";
		s2=scan.nextLine();
		
		int sum=0;
		sum = extracted(a, b, sum);
				
		extracted();
		System.out.println(sum);
		extracted(s1+s2);
		
		scan.close();
	}

}
