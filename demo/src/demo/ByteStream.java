package demo;
import java.io.*;
//		�����ֽڵ����������
//		�����򴴽�һ���ļ����Ӽ��������ַ����������ַ���#��ʱ����������Ļ����ʾ���ļ�����������
public class ByteStream {
	public static void main(String args[]){
        char ch;
        int data;
        try{
            FileInputStream a=new FileInputStream(FileDescriptor.in);  //�����ļ�����������
            FileOutputStream b=new FileOutputStream("ep10_5");  //�����ļ����������
            System.out.println("�������ַ�����#�Ž�����");
            while((ch=(char)a.read())!='#'){
                b.write(ch);
            }
            a.close();
            b.close();
            System.out.println();
            FileInputStream c=new FileInputStream("ep10_5");
            FileOutputStream d=new FileOutputStream(FileDescriptor.out);
            while(c.available()>0){
               data=c.read();
               d.write(data);
           }
           c.close();d.close();
       }
       catch(FileNotFoundException e){
          System.out.println("�Ҳ������ļ���");
       }
       catch(IOException e){}
    }
}