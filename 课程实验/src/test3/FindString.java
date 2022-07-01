package test3;
import java.util.Scanner;

public class FindString {
	
	public static int fun(String str) {
		String[] names = {"zhangsan","ada","wangwu","lisi","xiaohong"};
		int index=-1;
		for (int i = 0; i < names.length; i++) 
			if(names[i].equals(str))
				index = i;
		return index;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(fun(str));
		sc.close();
	}
}
