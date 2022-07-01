package experiment6;

import java.io.File;

public class GetJava {

	public static void main(String[] args) {
		getFileListame("C:\\Users\\陈喜喜\\source\\repos(Java)\\课程实验\\src");
	}
	
	public static boolean fun(String strPath) {//判断扩展名是否为.java
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
		File[] files = dir.listFiles();//该文件目录下文件全部放入数组
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				getFileListame(files[i].getAbsolutePath());//获取文件绝对路径(递归获取)
				if (fun(files[i].getName())) //判断扩展名是否为.java
					System.out.println(files[i].getName());
			}
		}
	}
}
