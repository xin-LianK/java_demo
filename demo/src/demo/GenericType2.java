package demo;
//		���ͷ���
public class GenericType2 {
	public static void main(String[] args) {
		Point2<Integer, Integer> p1 = new Point2<Integer,Integer>();
		p1.setX(10);
		p1.setY(20);
		p1.printPoint(p1.getX(), p1.getY());
		
		Point2<Double, String> p2 = new Point2<Double, String>();
		p2.setX(25.4);
		p2.setY("����60��");
		p2.printPoint(p2.getX(), p2.getY());
	}
}
//���巺����
class Point2<T1, T2>{
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
	
	//���巺�ͷ���
	public <T1,T2> void printPoint(T1 x, T2 y) {
		T1 m = x;
		T2 n = y;
		System.out.println("This point is: " + m + "," + n);
	}
}