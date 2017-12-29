package demo;

public class GenericType {
	public static void main(String[] args) {
		Point point = new Point();
		
		point.setX(10);// int -> Integer -> Object
		point.setY(20);
		int x = (Integer)point.getX();  // ��������ת��
		int y = (Integer)point.getY();
		System.out.println("This point is:" + x + "," + y);
		
//		��������ʵ����ʱ����ָ����������ͣ�Ҳ���������Ͳ�����ֵ����ʽΪ��
//	    	className variable<dataType1, dataType2> = new className<dataType1, dataType2>();
//		Ҳ����ʡ�ԵȺ��ұߵ��������ͣ����ǻ�������棬����
//	    	className variable<dataType1, dataType2> = new className();
		Point1<Integer,Integer> p1 = new Point1<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		int m = p1.getX();
		int n = p1.getY();
		System.out.println("This point is:" + m + "," + n);
		
		Point1<Double, String> p2 = new Point1<Double, String>();
        p2.setX(25.4);
        p2.setY("����180��");
        double a = p2.getX();
        String b = p2.getY();
        System.out.println("This point is��" + a + ", " + b);
		
//		point.setX(25.4);
//		point.setY("����180��");
//		double m = (Double)point.getX();// ��������ת��
//        double n = (Double)point.getY();  // �����ڼ��׳��쳣
//        System.out.println("This point is:" + m + "," + n);
	}
}

class Point{
	Object x = 0;
	Object y = 0;
	
	public Object getX() {
		return x;
	}
	public void setX(Object x) {
		this.x = x;
	}
	public Object getY() {
		return y;
	}
	public void setY(Object y) {
		this.y = y;
	}
}

//	����ͨ��Ķ�����ȣ�����Ĵ����������������� <T1, T2>��T1, T2 ���Զ���ı�ʶ����Ҳ�ǲ�����
//	�����������ݵ����ͣ����������ݵ�ֵ�����ǳ�֮Ϊ���Ͳ�����
//	�ڷ����У��������ݵ�ֵ����ͨ���������ݣ����ݵ�����Ҳ����ͨ���������ݡ�
//	T1, T2 ֻ���������͵�ռλ��������ʱ�ᱻ�滻Ϊ�������������͡�

class Point1<T1,T2>{
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