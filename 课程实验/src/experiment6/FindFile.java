package experiment6;

import java.io.File;

public class FindFile {
	public static void main(String[] args) {
		getFileListame("C:\\Users\\��ϲϲ\\source\\repos(Java)\\�γ�ʵ��\\src");
	}
	
	public static void getFileListame(String strPath) {
		File dir = new File(strPath);
		File[] files = dir.listFiles();//���ļ�Ŀ¼���ļ�ȫ����������
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName()+"  is file");
				if (files[i].isDirectory()) {//�ж��Ƿ��ļ�����Ŀ¼
					getFileListame(files[i].getAbsolutePath());//��ȡ�ļ�����·��(�ݹ��ȡ)
					System.out.println("."+files[i].getName()+"  is Directory");
					//��ǰĿ¼����"."��ʾ
				}
			}
		}
	}
}
