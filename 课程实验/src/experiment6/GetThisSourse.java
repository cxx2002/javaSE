package experiment6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetThisSourse {

	public static void main(String[] args) {
		getThisSourse("C:\\Users\\��ϲϲ\\source\\repos(Java)\\�γ�ʵ��\\src\\experiment6\\GetThisSourse.java");
	}
	
	public static void getThisSourse(String strPath) {
		byte[] bytes = new byte[2056];
		File file = new File(strPath);
		try {
			FileInputStream fileInputStream = new FileInputStream(file);//���� FileNotFoundException�쳣
			try {
				int data = fileInputStream.read(bytes,0,2056) ;//����IOException�쳣
	            String str=new String(bytes,0,data);//String��byte[]���캯��
	            System.out.println(str);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
