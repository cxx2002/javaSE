package uyhbjdn;
import java.io.IOException;


public class hfg {
	public static void main(String[] args) {

        int b =  'q';

        try {

            while((b =      System.in.read()                ) != 'q') {

                if(b==10||   b==13              ) {//��������س����з�ʱ����������һ�������ַ�

                    continue;

                }

                System.out.println((char)b);//���������ֽ�����ת��Ϊ�ַ���ʾ

            }

        }

        catch(        IOException e) {

            e.printStackTrace();

        }

    }
}
