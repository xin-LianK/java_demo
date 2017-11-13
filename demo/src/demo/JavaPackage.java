package demo;

import java.util.Date;

public class JavaPackage {
//	在Java中，为了组织代码的方便，可以将功能相似的类放到一个文件夹内，这个文件夹，就叫做包。
//	
//	包不但可以包含类，还可以包含接口和其他的包
	
//	实现包：
//		package demo;
//		public test() {
//			System.out.println("我是Test类的构造方法");
//		}
//		表明Test类位于demo包中
	
//	包的调用
//	1）..在每一个类名前加上完整的包名
		public static void main(String[] args) {
			java.util.Date today = new java.util.Date();
			System.out.println(today);
		}
		
//	2)..通过import语句引入包的类
//		import java.util.Date;
//			也可以引入java.util中的所有包
//			import java.util.*;
//		public static void main(String[] args) {
//			Date today = new Date();
//			System.out.println(today);
//		}
		
//		实际编程中，没有必要把要引入的类写的那么详细，可以直接引入特定包中所有的类，例如 import java.util.*;。
}	
