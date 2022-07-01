package uyhbjdn;
import java.io.IOException;


public class hfg {
	public static void main(String[] args) {

        int b =  'q';

        try {

            while((b =      System.in.read()                ) != 'q') {

                if(b==10||   b==13              ) {//遇到输入回车换行符时继续接收下一个输入字符

                    continue;

                }

                System.out.println((char)b);//将读到的字节数据转换为字符显示

            }

        }

        catch(        IOException e) {

            e.printStackTrace();

        }

    }
}
