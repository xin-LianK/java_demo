package demo;

public class GenericType {
	public static void main(String[] args) {
		Point point = new Point();
		
		point.setX(10);// int -> Integer -> Object
		point.setY(20);
		int x = (Integer)point.getX();  // 必须向下转型
		int y = (Integer)point.getY();
		System.out.println("This point is:" + x + "," + y);
		
//		泛型类在实例化时必须指出具体的类型，也就是向类型参数传值，格式为：
//	    	className variable<dataType1, dataType2> = new className<dataType1, dataType2>();
//		也可以省略等号右边的数据类型，但是会产生警告，即：
//	    	className variable<dataType1, dataType2> = new className();
		Point1<Integer,Integer> p1 = new Point1<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		int m = p1.getX();
		int n = p1.getY();
		System.out.println("This point is:" + m + "," + n);
		
		Point1<Double, String> p2 = new Point1<Double, String>();
        p2.setX(25.4);
        p2.setY("东京180度");
        double a = p2.getX();
        String b = p2.getY();
        System.out.println("This point is：" + a + ", " + b);
		
//		point.setX(25.4);
//		point.setY("东经180度");
//		double m = (Double)point.getX();// 必须向下转型
//        double n = (Double)point.getY();  // 运行期间抛出异常
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

//	与普通类的定义相比，上面的代码在类名后面多出了 <T1, T2>，T1, T2 是自定义的标识符，也是参数，
//	用来传递数据的类型，而不是数据的值，我们称之为类型参数。
//	在泛型中，不但数据的值可以通过参数传递，数据的类型也可以通过参数传递。
//	T1, T2 只是数据类型的占位符，运行时会被替换为真正的数据类型。

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