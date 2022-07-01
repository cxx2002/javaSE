package experiment2;

public class Pyramid {

	public static class pyramid{
		private int height;
		private char pattern;
		
		void draw() {
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= height - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print(pattern);
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		pyramid Demo=new pyramid();
		Demo.height=7;
		Demo.pattern='*';
		Demo.draw();
	}
}
