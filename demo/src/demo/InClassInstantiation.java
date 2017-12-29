package demo;

import org.w3c.dom.css.Counter;

//	�� Java �У�������һ���ࣨ�򷽷������飩���ڲ�������һ���࣬��Ϊ�ڲ���(Inner Class)����ʱҲ��ΪǶ����(Nested Class)��
public class InClassInstantiation {
//	�ڲ��������װ������֮������߼��ϵ�������ϵ��һ��ֻ���ڶ��������������֮�ڣ�ʵ��һЩû��ͨ������Ĺ����߼������ⲿ������ʱ�����������������
//	ʹ���ڲ������Ҫԭ���У�
//		�ڲ�����Է����ⲿ���е����ݣ�����˽�е����ݡ�
//		�ڲ�����Զ�ͬһ�����е�����������������
//		����Ҫ����һ���ص������Ҳ����д��������ʱ��ʹ������(anonymous)�ڲ���Ƚϱ�ݡ�
//		�������������ͻ��
	
	private int size;
	public class Inner{
		private int counter = 10;
		public void doStuff() {
			size ++;
		}
	}
	public static void main(String[] args) {
		InClassInstantiation outer = new InClassInstantiation();
		Inner inner = outer.new Inner();
		inner.doStuff();
		System.out.println(outer.size);
		System.out.println(inner.counter);
		//��������ⲿ�಻�ܷ����ڲ���ı���
//		System.out.println(counter);
	}
}
//		ע�⣺���������ⲿ��Ķ�����������ڲ���Ķ�����Ϊ�ڲ�����Ҫ�����ⲿ���еĳ�Ա��������Ա��������ʵ�����������塣