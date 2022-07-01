package experiment4.String;

public class Matrix {
	
	public class SaddlePoint{
		int rownum;
		int colnum;
		int value;
	}
	
	
	int[][] data;
	
	Matrix add(Matrix matrix) {
		Matrix matrix2 = new Matrix();
		matrix2.data = new int[data.length][data[0].length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				matrix2.data[i][j] = data[i][j] + matrix.data[i][j];
			}
		}
		return matrix2;
	}
	
	Matrix transpose() {
		Matrix matrix = new Matrix();
		matrix.data = new int[data.length][data[0].length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				matrix.data[j][i]=data[i][j];
			}
		}
		return matrix;
	}
	
	void transpose2() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < i; j++) {
				int tmp = data[i][j];
				data[i][j] = data[j][i];
				data[j][i] = tmp;
			}
		}
	}
	
	int[] mapping2ArrayByRow() {
		int[] array = new int[data.length*data[0].length];
		int k = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				k = i*data[0].length + j;
				array[k] = data[i][j];
			}
		}
		return array;
	}
	
	int[] mapping2ArrayByCol() {
		int[] array = new int[data.length*data[0].length];
		int k = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				k = j*data.length + i;
				array[k] = data[i][j];
			}
		}
		return array;
	}
	
	void print() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	SaddlePoint searchSaddlePoint() {//鞍点
		//找行上最大且还是所在列的最小值的元素
		for (int i = 0; i < data.length; i++) {
			int maxValue = Integer.MIN_VALUE;
			int colnum = 0;
			for (int j = 0; j < data[i].length; j++) {
				if(maxValue < data[i][j]) {
					maxValue = data[i][j];
					colnum = j;
				}
			}
			boolean flag = true;
			for (int k = 0; k < data.length; k++) {
				if(maxValue > data[k][colnum]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				SaddlePoint sp = new SaddlePoint();
				sp.rownum = i;
				sp.colnum = colnum;
				sp.value = data[i][colnum];
				return sp;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Matrix matrix1 = new Matrix();
		Matrix matrix2 = new Matrix();
		matrix1.data = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		matrix2.data = new int[][] {{3,7,1},{10,21,1},{5,30,6}};
		Matrix matrix3 = matrix1.add(matrix2);
		Matrix matrix4 = matrix2.transpose();
		System.out.println("----1-------");
		matrix1.print();
		System.out.println("----2-------");
		matrix2.print();
		System.out.println("----3-------");
		matrix3.print();
		System.out.println("----4-------");
		matrix4.print();
		int[] a=matrix1.mapping2ArrayByCol();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
//		
	}
}
