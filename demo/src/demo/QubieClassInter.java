package demo;

public class QubieClassInter {
//	���Ƕ����ģ�壬������ͽӿڿ��Կ����Ǿ�������ģ��
//	1) ���������Ϊ���ַ����ṩʵ�֣����������������ظ�ʵ����Щ����������˴���Ŀ������ԣ����ǳ���������ƣ����ӿ���ֻ�ܰ������󷽷������ܰ����κ�ʵ�֡�
	public abstract class A() {
		public abstract void method();
		public void method2() {
			//A.method2
		}
	}
	
	public class B extends A{
		public void method1() {
			//B.method1
		}
	}
	
	public class C extends A{
		public Void method1() {
			//C.method1
		}
	}
//	������A����������B��C������A���з���method2��ʵ�֣�����B��C�в���Ҫ��дmethod2���������Ǿ�˵AΪ�����ṩ�˹����Ĺ��ܣ���AԼ�����������Ϊ��
//	method2���Ǵ�������õ����ӡ�A ��û�ж��� method1��ʵ�֣�Ҳ����˵B��C ���Ը����Լ����ص�ʵ��method1������������������ɢ��ϵ����ԡ�
	
	public interface A{
		public void method1();
		public void method2();
	}
	
	public class B implements A{
		public void method1() {
			//B.method1
		}
	}
	public class C implements A{
	    public void method1(){
	        //C method1
	    }
	    public void method2(){
	        //C method2
	    }
	}
//	�ӿ�A�޷�Ϊʵ����B��C�ṩ�����Ĺ��ܣ�Ҳ����˵A�޷�Լ��B��C����Ϊ��
//	B��C�������ɵط����Լ����ص���ʵ method1�� method2�������ӿ�A�����ƿ�������
	
//	2) һ����ֻ�ܼ̳�һ��ֱ�ӵĸ��ࣨ�����ǳ����ࣩ����һ�������ʵ�ֶ���ӿڣ�������ǽӿڵ����ơ�
	interface A {
		public void method2();
	}
	interface B {
		public void method1();
	}
	class C implements A,B{
		public void method1(){
			//C.method1
		}
		public void method2(){
			//C.method2
		}
	}
	//�����������ʹ��C������C���л��������չ��ʵ�������ӿ�
	A a = new C();
	B b = new C();
	abstract class A{
		public abstract void method1();
	}
	abstract class B extends A{
		public abstract void method2();
	}
	class C extends B{
		public void method1() {
			//C.method1
		}
		public void method2() {
			//C.method2
		}
	}
}
//����C�࣬��û�л���̳����������ˡ�
//
//�����������ӿںͳ����������ȱ�㣬�ڽӿںͳ������ѡ���ϣ�������������һ��ԭ��
//��Ϊģ��Ӧ������ͨ���ӿڶ����ǳ����ඨ�壬����ͨ��������ѡ�ýӿڣ��������ó����ࡣ
//ѡ��������ʱ��ͨ���������������Ҫ�����������Ϊ����ҪΪ�����ṩͨ�õĹ��ܡ�
