package demo;

public class TypeConversionOfPolymorphicObjects {
	public static void main(String[] args) {
		SuperClass superObj = new SuperClass();
		SonClass sonObj = new SonClass();
		
		// 下面的代码运行时会抛出异常，不能将父类对象直接转换为子类类型
//         SonClass sonObj2 = (SonClass)superObj;
		
		// 先向上转型，再向下转型
//        superObj = sonObj;
//        SonClass sonObj1 = (SonClass)superObj;
        
//        因为向下转型存在风险，所以在接收到父类的一个引用时，请务必使用 instanceof 运算符来判断该对象是否是你所要的子类
		
		// superObj 不是 SonClass 类的实例
		if (superObj instanceof SonClass) {
			SonClass sonObj1 = (SonClass)superObj;
		}else {
			System.out.println("Dont, One is no");
		}
		
		superObj = sonObj;
		 // superObj 是 SonClass 类的实例
		if (superObj instanceof SonClass) {
			SonClass sonObj2 = (SonClass)superObj;
		}else {
			System.out.println("Dont, Two is no");
		}
	}
}
class SuperClass{ }
class SonClass extends SuperClass{}


//对象的类型转换在程序运行时检查，向上转型会自动进行，向下转型的对象必须是当前引用类型的子类