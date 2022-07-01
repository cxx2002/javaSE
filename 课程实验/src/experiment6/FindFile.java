package experiment6;

import java.io.File;

public class FindFile {
	public static void main(String[] args) {
		getFileListame("C:\\Users\\陈喜喜\\source\\repos(Java)\\课程实验\\src");
	}
	
	public static void getFileListame(String strPath) {
		File dir = new File(strPath);
		File[] files = dir.listFiles();//该文件目录下文件全部放入数组
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName()+"  is file");
				if (files[i].isDirectory()) {//判断是否文件还是目录
					getFileListame(files[i].getAbsolutePath());//获取文件绝对路径(递归获取)
					System.out.println("."+files[i].getName()+"  is Directory");
					//当前目录名用"."表示
				}
			}
		}
	}
}
