package demo;

public class This {
	public int x = 10;
	public int y = 15;
	
	public String name;
	public int age;
	
	public void sun() {
		//通过this来点取成员变量
		int z = this.x + this.y;
		
		System.out.println("x + y =" + z);
	}
	
//	public static void main(String[] args) {
//		This obj = new This();
//		obj.sun();
//	}
	public This() {
		this("Daye",14);
	}
	
	public This(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void say() {
		System.out.println("我的名字是：" + name + ",我的年龄是：" + age);
	}
	
	public static void main(String[] args) {
		This obj = new This("Daye", 14);
		obj.say();
	}
	
//		值得注意的是：
//			在构造方法中调用另一个构造方法，调用动作必须置于最起始的位置。
//			不能在构造方法以外的任何方法内调用构造方法。
//			在一个构造方法内只能调用一个构造方法。
}
