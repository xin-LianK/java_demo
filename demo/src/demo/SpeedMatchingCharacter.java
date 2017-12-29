package demo;

public class SpeedMatchingCharacter {
	public static void main(String[] args) {
		Point3<Integer, Integer> p1 = new Point3<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		printNumPoint(p1);
		
		Point3<String, String> p2 = new Point3<String, String>();
        p2.setX("����180��");
        p2.setY("��γ210��");
        printStrPoint(p2);
	}
	
	public static void printNumPoint(Point3<? extends Number,? extends Number> p) {
		System.out.println("x:" + p.getX() + ",y:" + p.getY());
	}
	public static void printStrPoint(Point3<? extends String,? extends String> p) {
		System.out.println("x:" + p.getX() + ",y:" + p.getY());	
	}
}
class Point3<T1, T2>{
	T1 x;
	T2 y;
	public T1 getX() {
		return x;
	}
	public void setX(T1 x) {
		this.x = x;
	}
	public T2 getY() {
		return y;
	}
	public void setY(T2 y) {
		this.y = y;
	}
}
//? extends Number ��ʾ���͵����Ͳ���ֻ���� Number �������࣬? extends String Ҳһ�������붨�巺������ͷ���ʱ�������Ͳ����ķ�Χ���ơ�

//������ʹ��ͨ���(?)���������������͵����ޣ��������������ޡ���������ʹ�� super �ؼ��֣����� <? super Number> ��ʾֻ�ܽ��� Number ���丸�ࡣ
