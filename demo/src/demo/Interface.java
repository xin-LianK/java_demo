package demo;

public class Interface {
//		�ڳ������У����԰���һ���������󷽷���
//			���ڽӿ�(interface)�У����еķ������붼�ǳ���ģ������з����壬���ȳ�������ӡ����󡱡�
//		�ӿ�ʹ�� interface �ؼ��������������Կ�����һ������ĳ����࣬����ָ��һ���������ʲô�������ǹ涨�����ȥ����
//		�ӿ��������ĳ�Ա����Ĭ�϶��� public static final �ģ�������ʾ�ĳ�ʼ��������ڳ�������ʱ����ʡ����Щ���η���
	
//	1) 	�ӿ���ֻ�ܶ�����󷽷�����Щ����Ĭ��Ϊ public abstract �ģ��������������ʱ����ʡ����Щ���η�����ͼ�ڽӿ��ж���ʵ���������ǳ����ʵ����������̬���������ǷǷ��ġ�
	
//	public interface SataHdd{
//	    //�����ߵ�����
//	    public int connectLine; //�������connectLine��������̬������������ʽ��ʼ��
//	    //д����
//	    protected void writeData(String data); //�������������public����
//	    //������
//	    public static String readData(){ //��������ӿ��в��ܰ�����̬����
//	        return "����"; //��������ӿ���ֻ�ܰ������󷽷���
//	    }
//	}
	
//	2) 	�ӿ���û�й��췽�������ܱ�ʵ������
	
//	3) 	һ���ӿڲ�ʵ����һ���ӿڣ������Լ̳ж�������ӿڡ��ӿڵĶ�̳��ص��ֲ�����ĵ��̳�
//	public interface SataHdd extends A,B{
//	    // �����ߵ�����
//	    public static final int CONNECT_LINE = 4;
//	    // д����
//	    public void writeData(String data);
//	    // ������
//	    public String readData();
//	}
//	interface A{
//	    public void a();
//	}
//	interface B{
//	    public void b();
//	}
	
//	ʵ�ֽӿڵĸ�ʽ���£�
//		���η� class ���� extends ���� implements ����ӿ� {
//	    	ʵ�ַ���
//		}
	public static void main(String[] args) {
		SataHdd sh1 = new SeagateHdd();
		SataHdd sh2 = new SamsungHdd();
	}
}
//����Ӳ�̽ӿ�
interface SataHdd{
    //�����ߵ�����
    public static final int CONNECT_LINE=4;
    //д����
    public void writeData(String data);
    //������
    public String readData();
}

//ά��Ӳ�̽ӿ�
interface fixHdd{
 // ά�޵�ַ
	String address = "�����к�����";
 // ��ʼά��
	boolean doFix();
}

//ϣ��Ӳ��
class SeagateHdd implements SataHdd, fixHdd{
  //ϣ��Ӳ�̶�ȡ����
	public String readData(){
		return "����";
	}
  //ϣ��Ӳ��д������
	public void writeData(String data) {
		System.out.println("д��ɹ�");
	}
  // ά��ϣ��Ӳ��
	public boolean doFix(){
		return true;
	}
}

//����Ӳ��
class SamsungHdd implements SataHdd{
  //����Ӳ�̶�ȡ����
  public String readData(){
      return "����";
  }
  //����Ӳ��д������
  public void writeData(String data){
      System.out.println("д��ɹ�");
  }
}

//ĳ����Ӳ�̣�����д����
abstract class XXHdd implements SataHdd{
  //Ӳ�̶�ȡ����
  public String readData() {
      return "����";
  }
}

//�ӿ���Ϊ����ʹ��
//�ӿ���Ϊ����������ʹ�ã��κ�ʵ�ָýӿڵ����ʵ�������Դ洢�ڸýӿ����͵ı����У�ͨ����Щ�������Է���������ʵ�ֵĽӿ��еķ�����
//Java ����ʱϵͳ�ᶯ̬��ȷ��Ӧ��ʹ���ĸ����еķ�����ʵ�����ǵ�����Ӧ��ʵ����ķ�����

//public class Demo{
//    public void test1(A a) {
//        a.doSth();
//    }
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        A a = new B();
//        d.test1(a);
//    }
//}
//interface A {
//    public int doSth();
//}
//class B implements A {
//    public int doSth() {
//        System.out.println("now in B");
//        return 123;
//    }
//}