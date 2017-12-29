package demo;

public class QubieClassInter {
//	类是对象的模板，抽象类和接口可以看做是具体的类的模板
//	1) 抽象类可以为部分方法提供实现，避免了在子类中重复实现这些方法，提高了代码的可重用性，这是抽象类的优势；而接口中只能包含抽象方法，不能包含任何实现。
	public abstract class A() {
		public abstract void method();
		public void method2() {
			//A.method2
		}
	}
	
	public class B extends A{
		public void method1() {
			//B.method1
		}
	}
	
	public class C extends A{
		public Void method1() {
			//C.method1
		}
	}
//	抽象类A有两个子类B、C，由于A中有方法method2的实现，子类B、C中不需要重写method2方法，我们就说A为子类提供了公共的功能，或A约束了子类的行为。
//	method2就是代码可重用的例子。A 并没有定义 method1的实现，也就是说B、C 可以根据自己的特点实现method1方法，这又体现了松散耦合的特性。
	
	public interface A{
		public void method1();
		public void method2();
	}
	
	public class B implements A{
		public void method1() {
			//B.method1
		}
	}
	public class C implements A{
	    public void method1(){
	        //C method1
	    }
	    public void method2(){
	        //C method2
	    }
	}
//	接口A无法为实现类B、C提供公共的功能，也就是说A无法约束B、C的行为。
//	B、C可以自由地发挥自己的特点现实 method1和 method2方法，接口A毫无掌控能力。
	
//	2) 一个类只能继承一个直接的父类（可能是抽象类），但一个类可以实现多个接口，这个就是接口的优势。
	interface A {
		public void method2();
	}
	interface B {
		public void method1();
	}
	class C implements A,B{
		public void method1(){
			//C.method1
		}
		public void method2(){
			//C.method2
		}
	}
	//可以如此灵活的使用C，并且C还有机会进行扩展，实现其他接口
	A a = new C();
	B b = new C();
	abstract class A{
		public abstract void method1();
	}
	abstract class B extends A{
		public abstract void method2();
	}
	class C extends B{
		public void method1() {
			//C.method1
		}
		public void method2() {
			//C.method2
		}
	}
}
//对于C类，将没有机会继承其他父类了。
//
//综上所述，接口和抽象类各有优缺点，在接口和抽象类的选择上，必须遵守这样一个原则：
//行为模型应该总是通过接口而不是抽象类定义，所以通常是优先选用接口，尽量少用抽象类。
//选择抽象类的时候通常是如下情况：需要定义子类的行为，又要为子类提供通用的功能。
