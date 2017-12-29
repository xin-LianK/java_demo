package demo;

class People{
	String name;
	int age;
	int height;
	
	void say(){
		System.out.println("我的名字是：" + name + "，年龄是：" + age + "，我的身高是：" + height);
	}
}

class Teacher extends People{
	String school;
	String subject;
	int seniority;
	
	 // 覆盖 People 类中的 say() 方法
	void say() {
		System.out.println("我叫" + name + "，在" + school + "学校教" + subject + "课程，已经有" + seniority + "的教龄了");
	}
	
	void lecturing() {
		System.out.println("我已经" + age + "岁了，依然还在讲台上教书");
	}
}

public class Inherit {
//	继承可以理解为一个类从另一个类获取方法和属性的过程。如果类B继承于类A，那么B就拥有A的方法和属性。
//	继承使用 extends 关键字。
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Jack";
		t.age = 50;
		t.school = "NiuJin unity";
		t.subject = "Math";
		t.seniority = 14;
		t.say();
		t.lecturing();
	}
}

	
//对程序的说明
//name 和 age 变量虽然没有在 Teacher 中定义，但是已在 People 中定义，可以直接拿来用。
//Teacher 是 People 的子类，People 是Teacher 类的父类。
//子类可以覆盖父类的方法。
//子类可以继承父类除private以为的所有的成员。
//构造方法不能被继承

//单继承性：Java 允许一个类仅能继承一个其它类，即一个类只能有一个父类，这个限制被称做单继承性。
//后面将会学到接口(interface)的概念，接口允许多继承。