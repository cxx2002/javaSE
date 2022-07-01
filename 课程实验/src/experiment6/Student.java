package experiment6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Student implements Serializable{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		File srcFile = new File("s       dsa");
		System.out.println(srcFile.getName());
		System.out.println(srcFile.getAbsolutePath());
		//把对象的原始信息和图形保存到文件中 序列化
		Student p=new Student(1,"小明",'男');
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(new File("D:\\p.txt")));
		out.writeObject(p);
		//拿出来
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(new File("D:\\p.txt")));
		Object readObject = (Student)in.readObject();
		System.out.println(readObject.toString());
		
	}
	private static final long serialVersionUID = 1L;
	private int pid;
	private String pname;
	private char sex;

	
	@Override
	public String toString() {
		return "Student [pid=" + pid + ", pname=" + pname + ", sex=" + sex + "]";
	}

	public Student() {
		super();
	}

	public Student(int pid, String pname, char sex)
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.sex = sex;
	}



}
