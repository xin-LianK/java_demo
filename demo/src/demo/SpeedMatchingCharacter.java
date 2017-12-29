package demo;

public class SpeedMatchingCharacter {
	public static void main(String[] args) {
		Point3<Integer, Integer> p1 = new Point3<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		printNumPoint(p1);
		
		Point3<String, String> p2 = new Point3<String, String>();
        p2.setX("东京180度");
        p2.setY("北纬210度");
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
//? extends Number 表示泛型的类型参数只能是 Number 及其子类，? extends String 也一样，这与定义泛型类或泛型方法时限制类型参数的范围类似。

//不过，使用通配符(?)不但可以限制类型的上限，还可以限制下限。限制下限使用 super 关键字，例如 <? super Number> 表示只能接受 Number 及其父类。
