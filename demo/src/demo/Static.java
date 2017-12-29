package demo;

public class Static {
//		static 修饰符能够与变量、方法一起使用，表示是“静态”的。
//			静态变量和静态方法能够通过类名来访问，不需要创建一个类的对象来访问该类的静态成员，所以static修饰的成员又称作类变量和类方法。
//			静态变量与实例变量不同，实例变量总是通过对象来访问，因为它们的值在对象和对象之间有所不同。
	static int i = 10;
	static int a;
	int j;
	int b;
	
	Static(){
		this.j = 20;
	}
	
	public static void main(String[] args) {
		System.out.println("类变量 i = " + Static.i);
		Static obj = new Static();
		System.out.println("实例变量 j = " + obj.j);
		
		Static obj1 = new Static();
		obj1.a = 20;
		obj1.b = 10;
		
		Static obj2 = new Static();
		
		System.out.println("obj1.a=" + obj1.a + ",obj1.b=" + obj1.b);
		System.out.println("obj2.a=" + obj2.a + ",obj2.b=" + obj2.b);
	}
	
//	注意：static 的变量是在类装载的时候就会被初始化。也就是说，只要类被装载，不管你是否使用了这个static 变量，它都会被初始化。
	
//	小结：类变量(class variables)用关键字 static 修饰，在类加载的时候，分配类变量的内存，以后再生成类的实例对象时，将共享这块内存（类变量），任何一个对象对类变量的修改，都会影响其它对象。
//		外部有两种访问方式：通过对象来访问或通过类名来访问。
}
