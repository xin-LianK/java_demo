package demo;

public class Interface {
//		在抽象类中，可以包含一个或多个抽象方法；
//			但在接口(interface)中，所有的方法必须都是抽象的，不能有方法体，它比抽象类更加“抽象”。
//		接口使用 interface 关键字来声明，可以看做是一种特殊的抽象类，可以指定一个类必须做什么，而不是规定它如何去做。
//		接口中声明的成员变量默认都是 public static final 的，必须显示的初始化。因而在常量声明时可以省略这些修饰符。
	
//	1) 	接口中只能定义抽象方法，这些方法默认为 public abstract 的，因而在声明方法时可以省略这些修饰符。试图在接口中定义实例变量、非抽象的实例方法及静态方法，都是非法的。
	
//	public interface SataHdd{
//	    //连接线的数量
//	    public int connectLine; //编译出错，connectLine被看做静态常量，必须显式初始化
//	    //写数据
//	    protected void writeData(String data); //编译出错，必须是public类型
//	    //读数据
//	    public static String readData(){ //编译出错，接口中不能包含静态方法
//	        return "数据"; //编译出错，接口中只能包含抽象方法，
//	    }
//	}
	
//	2) 	接口中没有构造方法，不能被实例化。
	
//	3) 	一个接口不实现另一个接口，但可以继承多个其他接口。接口的多继承特点弥补了类的单继承
//	public interface SataHdd extends A,B{
//	    // 连接线的数量
//	    public static final int CONNECT_LINE = 4;
//	    // 写数据
//	    public void writeData(String data);
//	    // 读数据
//	    public String readData();
//	}
//	interface A{
//	    public void a();
//	}
//	interface B{
//	    public void b();
//	}
	
//	实现接口的格式如下：
//		修饰符 class 类名 extends 父类 implements 多个接口 {
//	    	实现方法
//		}
	public static void main(String[] args) {
		SataHdd sh1 = new SeagateHdd();
		SataHdd sh2 = new SamsungHdd();
	}
}
//串行硬盘接口
interface SataHdd{
    //连接线的数量
    public static final int CONNECT_LINE=4;
    //写数据
    public void writeData(String data);
    //读数据
    public String readData();
}

//维修硬盘接口
interface fixHdd{
 // 维修地址
	String address = "北京市海淀区";
 // 开始维修
	boolean doFix();
}

//希捷硬盘
class SeagateHdd implements SataHdd, fixHdd{
  //希捷硬盘读取数据
	public String readData(){
		return "数据";
	}
  //希捷硬盘写入数据
	public void writeData(String data) {
		System.out.println("写入成功");
	}
  // 维修希捷硬盘
	public boolean doFix(){
		return true;
	}
}

//三星硬盘
class SamsungHdd implements SataHdd{
  //三星硬盘读取数据
  public String readData(){
      return "数据";
  }
  //三星硬盘写入数据
  public void writeData(String data){
      System.out.println("写入成功");
  }
}

//某劣质硬盘，不能写数据
abstract class XXHdd implements SataHdd{
  //硬盘读取数据
  public String readData() {
      return "数据";
  }
}

//接口作为类型使用
//接口作为引用类型来使用，任何实现该接口的类的实例都可以存储在该接口类型的变量中，通过这些变量可以访问类中所实现的接口中的方法，
//Java 运行时系统会动态地确定应该使用哪个类中的方法，实际上是调用相应的实现类的方法。

//public class Demo{
//    public void test1(A a) {
//        a.doSth();
//    }
//    public static void main(String[] args) {
//        Demo d = new Demo();
//        A a = new B();
//        d.test1(a);
//    }
//}
//interface A {
//    public int doSth();
//}
//class B implements A {
//    public int doSth() {
//        System.out.println("now in B");
//        return 123;
//    }
//}