package demo;
import java.io.*;
//	������ int ������ 100��0��-100 д�������ļ� ep10_6.dat ��
public class Communication {
	public static void main(String args[]){
        String fileName="ep10_5.dat";
        int value1=100,value2=0,value3=-100;
        try{
            //�� DataOutputStream �� FileOutputStream ���������ͬ���͵�����
            DataOutputStream a=new DataOutputStream(new FileOutputStream(fileName));
            a.writeInt(value1);
            a.writeInt(value2);
            a.writeInt(value3);
            a.close();
        }
        catch(IOException i){
            System.out.println("���ִ���!"+fileName);
        }
    }
}