package demo;
//super 可以用在子类中，通过点号(.)来获取父类的成员变量和方法。
//super 也可以用在子类的子类中，Java 能自动向上层类追溯。
//父类行为被调用，就好象该行为是本类的行为一样，而且调用行为不必发生在父类中，它能自动向上层类追溯

//super 关键字的功能：
//	调用父类中声明为 private 的变量。
//	点取已经覆盖了的方法。
//	作为方法名表示父类构造方法。

//move() 方法也可以定义在某些祖先类中，比如父类的父类，Java 具有追溯性，会一直向上找，直到找到该方法为止。

//通过 super 调用父类的隐藏变量，必须要在父类中声明 getter 方法，因为声明为 private 的数据成员对子类是不可见的。
public class Super {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.move();
	}
}

class Aniaml{
	private String desc = "Animals are human`s good friends";
	//必须声明一个getter方法
	public String getDesc() {return desc;}
	
	public void move() {
		System.out.println("Animals can move");
	}
}

class Cat extends Aniaml{
	public void move() {
		super.move();//调用父类的方法
		System.out.println("Cats can walk and run");
		// 通过 getter 方法调用父类隐藏变量
		System.out.println("Please remember:" + super.getDesc());
	}
}