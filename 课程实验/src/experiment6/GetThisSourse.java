package experiment6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetThisSourse {

	public static void main(String[] args) {
		getThisSourse("C:\\Users\\陈喜喜\\source\\repos(Java)\\课程实验\\src\\experiment6\\GetThisSourse.java");
	}
	
	public static void getThisSourse(String strPath) {
		byte[] bytes = new byte[2056];
		File file = new File(strPath);
		try {
			FileInputStream fileInputStream = new FileInputStream(file);//出现 FileNotFoundException异常
			try {
				int data = fileInputStream.read(bytes,0,2056) ;//出现IOException异常
	            String str=new String(bytes,0,data);//String的byte[]构造函数
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
