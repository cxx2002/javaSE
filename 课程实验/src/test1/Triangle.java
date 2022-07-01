package test1;

public class Triangle {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i < n+1; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
