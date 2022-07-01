package test2;
import java.util.*;

public class PingPong {

	public static void main(String[] args) {
		//a-z  c-y  b-x
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a')
			System.out.println('z');
		if(ch=='b')
			System.out.println('x');
		if(ch=='c')
			System.out.println('y');
		if(ch=='x')
			System.out.println('b');
		if(ch=='y')
			System.out.println('c');
		if(ch=='z')
			System.out.println('a');
		sc.close();
	}
}
