package test3;

import java.util.Arrays;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) 
			arr[i]=scanner.nextInt();
		Arrays.sort(arr);
		
		for(int n:arr)
			System.out.printf(n+" ");
		scanner.close();
	}
}
