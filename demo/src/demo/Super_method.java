package demo;

public class Super_method {
	public static void main(String[] args) {
		Fish obj = new Fish("花花", 14);
		obj.say();
	}
}

class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
}

class Fish extends Animal{
    int age;
    public Fish(String name, int age){
        super(name);
        this.age = age;
    }
    public void say(){
        System.out.println("我养了一条可爱的金鱼，它的名字叫" + name + "，他活了" + age + "岁了");
    }
}

//无论是 super() 还是 this()，都必须放在构造方法的第一行。

//值得注意的是：
//	在构造方法中调用另一个构造方法，调用动作必须置于最起始的位置。
//	不能在构造方法以外的任何方法内调用构造方法。
//	在一个构造方法内只能调用一个构造方法。
//
//如果编写一个构造方法，既没有调用 super() 也没有调用 this()，编译器会自动插入一个调用到父类构造方法中，而且不带参数。 
//
//最后注意 super 与 this 的区别：super 不是一个对象的引用，不能将 super 赋值给另一个对象变量，它只是一个指示编译器调用父类方法的特殊关键字。