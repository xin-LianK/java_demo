package demo;
import java.io.*;
// 			�����ַ������������
public class IO {
    public static void main(String args[]) throws IOException{
        char a[]=new char[1000]; //���������� 1000 ���ַ�������
        FileReader b=new FileReader("1.txt");
        int num=b.read(a); //�����ݶ��뵽���� a �У��������ַ���
        String str=new String(a,0,num); //���ַ�������ת�����ַ���
        System.out.println("��ȡ���ַ�����Ϊ��"+num+",����Ϊ��\n");
        System.out.println(str);
    }
    
    public static void main(String args[]) throws IOException{
        String OneLine;
        int count=0;
        try{
            FileReader a=new FileReader("2.txt");
            BufferedReader b=new BufferedReader(a);
            while((OneLine=b.readLine())!=null){  //ÿ�ζ�ȡ 1 ��
                 count++;  //�����ȡ������
                 System.out.println(OneLine);
            }
            System.out.println("\n ����ȡ��"+count+"��");
            b.close();
        }catch(IOException io){
            System.out.println("������!"+io);
        }
      }
    public static void main(String args[]){
        try{
            FileWriter a=new FileWriter("3.txt");
            for(int i=32;i<126;i++){
                a.write(i);
            }
            a.close();
        }
        catch(IOException e){}
    }
    public static void main(String args[]){
        String str=new String();
        try{
            BufferedReader in=new BufferedReader(new FileReader("ep10_4_a.txt"));
            BufferedWriter out=new BufferedWriter(new FileWriter("ep10_4_b.txt"));
            while((str=in.readLine())!=null){
                System.out.println(str);
                out.write(str);  //����ȡ���� 1 ������д�������
                out.newLine();  //д�뻻�з�
            }
            out.flush();
            in.close();
            out.close();
        }
        catch(IOException e){
            System.out.println("���ִ���"+e);
        }
    }
   
    
    
}