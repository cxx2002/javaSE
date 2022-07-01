package test3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) 
			arr[i]=scanner.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[(arr.length)-1]+" "+arr[0]);
		scanner.close();
	}
}
