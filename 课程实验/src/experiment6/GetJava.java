package experiment6;

import java.io.File;

public class GetJava {

	public static void main(String[] args) {
		getFileListame("C:\\Users\\��ϲϲ\\source\\repos(Java)\\�γ�ʵ��\\src");
	}
	
	public static boolean fun(String strPath) {//�ж���չ���Ƿ�Ϊ.java
		String str=new String();
		for (int i = strPath.length()-1; i >= 0; i--) 
			if(strPath.charAt(i)=='.')
				str = strPath.substring(i, strPath.length());
		if (str.equals(".java")) 
			return true;
		return false;
	}
	
	public static void getFileListame(String strPath) {
		File dir = new File(strPath);
		File[] files = dir.listFiles();//���ļ�Ŀ¼���ļ�ȫ����������
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				getFileListame(files[i].getAbsolutePath());//��ȡ�ļ�����·��(�ݹ��ȡ)
				if (fun(files[i].getName())) //�ж���չ���Ƿ�Ϊ.java
					System.out.println(files[i].getName());
			}
		}
	}
}
