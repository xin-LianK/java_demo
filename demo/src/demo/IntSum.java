package demo;
import java.io.*;
public class IntSum {
	public static void main(String args[]){
        String fileName="D:\\myjava/ep10_5.dat";
        int sum=0;
        try{
            DataInputStream a=new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
            sum+=a.readInt();
            sum+=a.readInt();
            sum+=a.readInt();
            System.out.println("�������ĺ�Ϊ��"+sum);
            a.close();
        }
        catch(IOException e){
            System.out.println("���ִ���"+fileName);
        }
    }
}