package number;

public class Maxnumber {
	
	public class name{
		public int a;
		
	}

	public static void main(String[] args) {
		
		int n1=55;
		int n2=33;
		int n3=123;
		
		int max1=n1>n2?n1:n2;
		int max2 = extracted(n3, max1);
		
		System.out.println("×î´óÊý="+max2);
		System.out.println(max2);
	}

	private static int extracted(int n3, int max1) {
		int max2=max1>n3?max1:n3;
		return max2;
	}

}
