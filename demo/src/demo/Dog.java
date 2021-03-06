package demo;

//public 是类的修饰符，表明该类是公共类，可以被其他类访问。修饰符将在下节讲解。
//class 是定义类的关键字。
//Dog 是类名称。
//name、age 是类的成员变量，也叫属性；bark()、hungry() 是类中的函数，也叫方法。

public class Dog {
	String name;
	int age;
//	成员变量：成员变量是定义在类中、方法体之外的变量。这种变量在创建对象的时候实例化（分配内存）。成员变量可以被类中的方法和特定类的语句访问。
	
//	类变量：类变量也声明在类中，方法体之外，但必须声明为static类型。static 也是修饰符的一种
	
	
	// 构造方法，没有返回值
	Dog(String name1, int age1){
		name = name1;
		age = age1;
		System.out.println("感谢主人领养了我.....");
	}
//		构造方法不能被显示调用。
//		构造方法不能有返回值，因为没有变量来接收返回值。
	
	
	// 普通方法，必须有返回值
	void bark() {
		String in;
//		局部变量：在方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
		System.out.println("旺旺，不要过来....");
	}
	
	void hungry() {
		System.out.println("主人，" + name + "饿了......");
	}
	
	public static void main(String[] args) {
	//	Dog myDog;							//声明一个对象
	//	myDog = new Dog("huahua", 3);		//实例化
	
		Dog myDog = new Dog("虎虎", 3);   //声明的同时进行初始化
		
		//访问成员变量
		String name = myDog.name;
		int age = myDog.age;
		System.out.println("这是我的小狗，他的名字叫" + name + "，他的年龄是" + age + "岁");
		
		//访问方法
		myDog.bark();
		myDog.hungry();
	}
}

