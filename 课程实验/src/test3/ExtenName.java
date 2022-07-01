package test3;
import java.util.Scanner;

public class ExtenName {
	
	public static String fun(String str) {		
		boolean flag = false;
		int i = 0;
		for (i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i)=='.')
			{flag=true;break;}
		}
		if (flag) 
			return str.substring(i+1);
		else 
			return "error";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(fun(str));
		sc.close();
	}
}
