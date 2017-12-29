package demo;

public class Final {
	public static final int TOTAL_NUMBER = 5;
	public int id;
	public Final() {
		//错误，二次赋值
//		id = ++ TOTAL_NUMBER;
	}
	
	public static void main(String[] args) {
		final Final t = new Final();
		final int i = 10;
		final int j;
		j = 20;
//		j = 30;		错误，二次赋值
	}
}

//	在 Java 中，声明类、变量和方法时，可使用关键字 final 来修饰。final 所修饰的数据具有“终态”的特征，表示“最终的”意思。具体规定如下：
//		final 修饰的类不能被继承。
//		final 修饰的方法不能被子类重写。
//		final 修饰的变量（成员变量或局部变量）即成为常量，只能赋值一次。
//		final 修饰的成员变量必须在声明的同时赋值，如果在声明的时候没有赋值，那么只有 一次赋值的机会，而且只能在构造方法中显式赋值，然后才能使用。
//		final 修饰的局部变量可以只声明不赋值，然后再进行一次性的赋值。

//	final 也可以用来修饰类（放在 class 关键字前面），阻止该类再派生出子类
//	方法也可以被 final 修饰，被 final 修饰的方法不能被覆盖
//	变量也可以被 final 修饰，被 final 修饰的变量在创建对象以后就不允许改变它们的值了
//	一旦将一个类声明为 final，那么该类包含的方法也将被隐式地声明为 final，但是变量不是

//	被 final 修饰的方法为静态绑定，不会产生多态（动态绑定），程序在运行时不需要再检索方法表，能够提高代码的执行效率。
//	在Java中，被 static 或 private 修饰的方法会被隐式的声明为 final，因为动态绑定没有意义。
