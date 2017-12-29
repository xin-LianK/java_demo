package demo;

public class DynamicTwo {
	public static void main(String[] args) {
		//������̬�����˿��Ը��ܶද��ιʳ
		Master master = new Master();
		master.feed(new Dongwu(), new Food());
		master.feed(new Gou(), new Gutou());
		master.feed(new Mao(), new Yu());
	}
}

//Animal�༰������
class Dongwu{
	public void eat(Food f) {
		System.out.println("�Ҽҵ�С�������ڳ�" + f.getFood());
	}
}
class Mao extends Dongwu{
	public void eat(Food f) {
		System.out.println("�Ҽҵ�Сè�����ڳ�" + f.getFood());
	}
}
class Gou extends Dongwu{
	public void eat(Food f) {
		System.out.println("�Ҽҵ�С�����ڳ�" + f.getFood());
	}
}

//Food��������
class Food{
	public String getFood() {
		return "ʳ��";
	}
}
class Yu extends Food{
	public String getFood() {
		return "��";
	}
}
class Gutou extends Food{
	public String getFood() {
		return "��ͷ";
	}
}

//Master��
class Master{
	public void feed(Dongwu an,Food f) {
		an.eat(f);
	}
}

//Master ��� feed �����������������ֱ��� Animal ���ͺ� Food ���ͣ���Ϊ�Ǹ��࣬���Կ��Խ������ʵ�����ݸ��������� Master ��Ͳ���Ҫ�������������ͬ�Ķ���ιʳ��


//	��̬��
//		Ϊ������̬�ı��ʣ����潲һ��Java���÷�������ϸ���̡�
//
//		1) �������鿴������������ͺͷ�������
//
//			������� obj.func(param)��obj Ϊ Cat ��Ķ�����Ҫע����ǣ��п��ܴ��ڶ������Ϊfunc������ǩ����һ���ķ��������磬���ܴ��ڷ��� func(int) �� func(String)������������һһ�о����� Cat ������Ϊfunc�ķ������丸�� Animal �з�������Ϊ public ����Ϊfunc�ķ�����
//
//			�������������ͻ�������п��ܱ����õĺ�ѡ�����б�
//
//		2) ���������������������÷���ʱ�ṩ�Ĳ���ǩ����
//
//			�����������Ϊfunc�ķ����д���һ�����ṩ�Ĳ���ǩ����ȫƥ��ķ�������ô��ѡ�����������������̱���Ϊ���ؽ���(overloading resolution)�����磬������� func("hello")����������ѡ�� func(String)�������� func(int)�������Զ�����ת���Ĵ��ڣ����� int ����ת��Ϊ double�����û���ҵ�����÷�������ǩ����ͬ�ķ������ͽ�������ת�����ټ������ң��������û��ƥ������ͻ����ж��������֮ƥ�䣬��ô�������
//
//			�������������ͻ������Ҫ���õķ������ֺͲ���ǩ����
//
//		3) ������������η���private��static��final��static��final���ں������⣩�������ǹ��췽������ô������������׼ȷ��֪��Ӧ�õ����ĸ����������ǽ����ֵ��÷�ʽ ��Ϊ��̬��(static binding)��
//
//			��˶�Ӧ���ǣ����õķ��������ڶ����ʵ�����ͣ� ��������ʱʵ�ֶ�̬��������� func("hello")�������������ö�̬�󶨵ķ�ʽ����һ������ func(String) ��ָ�
//
//		4)���������У�������ö�̬�󶨵��÷���ʱ��JVMһ��������� obj �����ö����ʵ����������ʵ��Ǹ���ķ����������Ѿ����� obj ��ʵ�������� Cat������ Animal �����࣬��� Cat �ж����� func(String)���͵������������� Animal �༰�丸����Ѱ�ҡ�
//
//			ÿ�ε��÷�����Ҫ����������ʱ�俪���൱����ˣ�JVMԤ��Ϊÿ���ഴ����һ��������(method lable)�������г������з��������ơ�����ǩ�����������ࡣ����һ�������������÷�����ʱ����������������������ˡ�������������У�JVM ���� Cat ��ķ������Ա�Ѱ������� func("hello") ��ƥ��ķ���������������п����� Cat.func(String)��Ҳ�п����� Animal.func(String)��ע�⣬�������super.func("hello")�����������Ը���ķ��������������
//
//	���� Animal �����cry()��getName()��getAge() ������������ô���ķ��������£�
//		cry() -> Animal.cry()
//		getName() -> Animal.getName()
//		getAge() -> Animal.getAge()
//
//	ʵ���ϣ�Animal Ҳ��Ĭ�ϵĸ��� Object�������ὲ�⣩����̳� Object �ķ��������������оٵķ�������������
//
//	���� Cat �า���� Animal ���е� cry() ����������������һ������ climbTree()����ô���Ĳ����б�Ϊ��
//		cry() -> Cat.cry()
//		getName() -> Animal.getName()
//		getAge() -> Animal.getAge()
//		climbTree() -> Cat.climbTree()
//
//	�����е�ʱ�򣬵��� obj.cry() �����Ĺ������£�
//		JVM ���ȷ��� obj ��ʵ�����͵ķ����������� Animal ��ķ�����Ҳ������ Cat �༰������ķ�����
//		JVM �ڷ������������� cry() ƥ��ķ������ҵ��󣬾�֪���������ĸ����ˡ�
//		JVM ���ø÷���













