package demo;

public class Modifier {
	//body of class  修饰符
	
	// 访问修饰符
//			访问控制符		能够控制类，成员变量，方法的使用权限的关键字
	
//				public					共有的，对所有的类可见
					public static void main(String[] args) {
//						如果几个相互访问的public类分布在不用的包中，则需要导入相应public类所在的包。
//						由于类的继承性，类所有的公有方法和变量都能被其子类继承
					}
					
//				protected				受保护的，对同一包内的类和所有子类可见
					protected static final int BOXWIDTH = 45;
					public class Dog{
						protected void bark() {
							System.out.println("汪汪，不要过来");
						}
					}
					class Teddy extends Dog{
//						void bark() {
//							System.out.println("旺旺，我好怕，不要跟着我");
//						}
					}
//						被声明为protected的变量、方法和构造方法能被同一个包中的任何其他类访问，也能够被不同包中的子类访问。
//						protected访问修饰符不能修饰类和接口，方法和成员变量
//						能够声明为protected，但是接口的成员变量和成员方法不能声明为protected。 
					
//				private					私有的，在同一类内可见
					
					public class Dogs{
						private String name;
						private int age;
						public String getName() {
							return name;
						}
						public void setName(String name) {
							this.name = name;
						}
						public int getAge() {
							return age;
						}
						public void setAge(int age) {
							this.age = age;
						}
					}
					
//				默认的					在同一包内可见，默认不选择任何修饰符
					static final double weeks = 9.5;
					
					
//					请注意以下方法继承（不了解继承概念的读者可以跳过这里，或者点击 Java继承和多态 预览）的规则：
//						父类中声明为public的方法在子类中也必须为public。
//						父类中声明为protected的方法在子类中要么声明为protected，要么声明为public。不能声明为private。
//						父类中默认修饰符声明的方法，能够在子类中声明为private。
//						父类中声明为private的方法，不能够被继承。
					
//					访问控制符可以让我们很方便的控制代码的权限：
//						当需要让自己编写的类被所有的其他类访问时，就可以将类的访问控制符声明为 public。
//						当需要让自己的类只能被自己的包中的类访问时，就可以省略访问控制符。
//						当需要控制一个类中的成员数据时，可以将这个类中的成员数据访问控制符设置为 public、protected，或者省略。
					
//	 		非访问修饰符
	
}



