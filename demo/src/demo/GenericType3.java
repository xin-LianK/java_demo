package demo;
//		泛型方法------类型参数的范围
public class GenericType3 {
//	在泛型中，如果不对类型参数加以限制，它就可以接受任意的数据类型，只要它是被定义过的。
	public <T extends Number> T getMax(T array[]) {
		T max = null;
		for(T element : array) {
			max = element.doubleValue() > max.doubleValue() ? element : max;
		}
		return max;
	}
}
//<T extends Number> 表示 T 只接受 Number 及其子类，传入其他类型的数据会报错。
//这里的限定使用关键字 extends，后面可以是类也可以是接口。
//如果是类，只能有一个；但是接口可以有多个，并以“&”分隔，
//	例如 <T extends Interface1 & Interface2>。