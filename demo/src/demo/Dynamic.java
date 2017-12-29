package demo;

public class Dynamic {
	public static void main(String[] args) {
		Animalss obj = new Animalss();
		obj.cry();
		
		obj = new Chicken();
		obj.cry();
		
		obj = new Cattle();
		obj.cry();
	}
}
class Animalss{
	//动物的叫声
	public void cry() {
		System.out.println("不知道怎么叫");
	}
}

class Chicken extends Animalss{
	public void cry() {
		System.out.println("咕咕···");
	}
}

class Cattle extends Animalss{
	public void cry() {
		System.out.println("哞哞···");
	}
}

//多态是指一个事物有不同的表现形式或形态。

//多态存在的三个必要条件：要有继承、要有重写、父类变量引用子类对象。

//当使用多态方式调用方法时：
//	首先检查父类中是否有该方法，如果没有，则编译错误；
//	如果有，则检查子类是否覆盖了该方法。
//	如果子类覆盖了该方法，就调用子类的方法，否则调用父类方法。

//从上面的例子可以看出，多态的一个好处是：
//		当子类比较多时，也不需要定义多个变量，可以只定义一个父类类型的变量来引用不同子类的实例






