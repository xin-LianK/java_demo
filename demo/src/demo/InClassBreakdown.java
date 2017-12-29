package demo;
//	内部类可以是静态(static)的，可以使用 public、protected 和 private 访问控制符，而外部类只能使用 public，或者默认。
public class InClassBreakdown {
//	在外部类内部直接定义（不在方法内部或代码块内部）的类就是成员式内部类，它可以直接使用外部类的所有变量和方法，即使是 private 的。
//	外部类要想访问内部类的成员变量和方法，则需要通过内部类的对象来获取。
//	------------------成员式内部类-----------------
	private int size;
//	成员式内部类可以使用各种修饰符，包括 public、protected、private、static、final 和 abstract，也可以不写。
	class Inner{
		public void dostuff(){
			size ++;
		}
	}
	public void testTheInner(){
		Inner inner =new Inner();
		inner.dostuff();
	}
//	成员式内部类如同外部类的一个普通成员
//	若有 static 修饰符，就为类级，否则为对象级
	
//	
	public static void main(String[] args) {
		
//		1) 		使用内部类中定义的非静态变量和方法时，要先创建外部类的对象，再由“outObjectName.new”操作符创建内部类的对象，再调用内部类的方法
		InClassBreakdown outer = new InClassBreakdown();
		InClassBreakdown.Inner inner = outer.new Inner();
		
//		2)		static 内部类相当于其外部类的 static 成员，它的对象与外部类对象间不存在依赖关系，因此可直接创建。
		InClassBreakdown.Inner inner = new InClassBreakdown().Inner();
		
//		3)		由于内部类可以直接访问其外部类的成分，因此当内部类与其外部类中存在同名属性或方法时，也将导致命名冲突。所以在多层调用时要指明
//		public class Outer{
//		    private int size;
//		    public class Inner{
//		        private int size;
//		        public void dostuff(int size){
//		            size++;  // 局部变量 size;
//		            this.size;  // 内部类的 size
//		            Outer.this.size++;  // 外部类的 size
//		        }
//		    }
//		}
		inner.dostuff();
	}
//	-------------------局部内部类---------------------
//	局部内部类(Local class)是定义在代码块中的类。它们只在定义它们的代码块中是可见的。
//		局部类有几个重要特性：
//			仅在定义了它们的代码块中是可见的；
//			可以使用定义它们的代码块中的任何局部 final 变量；
//			局部类不可以是 static 的，里边也不能定义 static 成员；
//			局部类不可以用 public、private、protected 修饰，只能使用缺省的；
//			局部类可以是 abstract 的。
//	public class Outer {
//	    public static final int TOTAL_NUMBER = 5;
//	    public int id = 123;
//	    public void func() {
//	        final int age = 15;
//	        String str = "http://www.weixueyuan.net";
//	        class Inner {
//	            public void innerTest() {
//	                System.out.println(TOTAL_NUMBER);
//	                System.out.println(id);
//	                // System.out.println(str);不合法，只能访问本地方法的final变量
//	                System.out.println(age);
//	            }
//	        }
//	        new Inner().innerTest();
//	    }
//	    public static void main(String[] args) {
//	        Outer outer = new Outer();
//	        outer.func();
//	    }
//	}
//	---------------------匿名内部类-------------------
//	匿名内部类是局部内部类的一种特殊形式，也就是没有变量名指向这个类的实例，而且具体的类实现会写在这个内部类里面。
//	abstract class Person {
//	    public abstract void eat();
//	}
//	class Child extends Person {
//	    public void eat() {
//	        System.out.println("eat something");
//	    }
//	}
//	public class Demo {
//	    public static void main(String[] args) {
//	        Person p = new Child();
//	        p.eat();
//	    }
//	}
}
