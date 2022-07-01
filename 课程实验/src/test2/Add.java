package test2;
import java.util.*;

public class Add {

	public static int fun(int n) {
		if(n==1)
			return 1;
		return n+fun(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		for (int i = 1; i <= n; i++)			
			s+=fun(i);
		System.out.println(s);
		sc.close();
	}
}
