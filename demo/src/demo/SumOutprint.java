package demo;
import java.io.*;

public class SumOutprint {
	public static void main(String args[]) throws IOException{
        DataInputStream a=new DataInputStream(System.in);
        System.out.print("������һ��������");
        int b=a.readInt();
        int sum=0;
        int c=b;
        while(c>0){
            int d=c%10;  //ȡ���λ
            c=c/10;  //ȥ�����λ
            sum=sum+d;  //�ۼӸ�λ֮��
        }
        System.out.println(b+"�ĸ�λ����֮��="+sum);
    }
}
