package demo;
import java.io.*;
public class File {
	public static void main(String args[]) throws IOException{
        String FilePath;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader a=new BufferedReader(in);
        System.out.println("������һ������·����");
        FilePath=a.readLine();  //�� FilePath ��Ϊ����ֵ
        File FileName=new File(FilePath);  //��ô�·�����ļ�����
        if (FileName.isDirectory()){  //�жϴ��ļ��Ƿ�ΪĿ¼
            System.out.println((FileName.getName())+"Ϊһ��Ŀ¼");
            System.out.println("================");
            File FileList[]=FileName.listFiles();  //��Ŀ¼�������ļ���������
            for(int i=0;i<FileList.length;i++){
                if(FileList[i].isHidden()==false){  //�ж��Ƿ�Ϊ�����ļ�
                    System.out.println(FileList[i].getName());  //����������ļ�
                }
            }
        }
        else{
            System.out.println((FileName.getName())+"Ϊһ���ļ�");
            System.out.println("================");
            //����ļ�����·��
            System.out.println("����·��Ϊ��"+FileName.getAbsolutePath());
            //�жϴ��ļ��Ƿ�ɶ�ȡ
            System.out.println(FileName.canRead()?"�ɶ�ȡ":"���ɶ�ȡ");
            //�жϴ��ļ��Ƿ���޸�
            System.out.println(FileName.canWrite()?"���޸�":"�����޸�");
            //�жϴ��ļ��Ƿ�Ϊ����
            System.out.println(FileName.isHidden()?"Ϊ�����ļ�":"�������ļ�");
        }
    }
}
