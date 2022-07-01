package test1;
import java.util.*;

public class Temp {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int a,b,temp;
			a=scan.nextInt();
			b=scan.nextInt();
			temp=a;
			a=b;
			b=temp;
			System.out.println(a);
			System.out.println(b);
			scan.close();
			
			
			
			
		}
}
