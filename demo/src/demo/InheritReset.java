package demo;

public class InheritReset {
	public static void main(String[] args) {
		Pig myPig = new Pig("mary");
		myPig.say();
		
		Animals myAnimals = new Animals("kaka");
		myAnimals.say();
	}
}
class Animals{
	String name;
	public Animals(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println("������һֻС����������ֽУ�" + name + ",���ᳪ��Ŷ��");
	}
}

class Pig extends Animals{
	//���췽�����ܱ��̳У�ͨ��Super���ã�
	public Pig(String name) {
		super(name);
	}
	
	//����say����
	public void say() {
		System.out.println("������һ����˿ȸ���������ֽ���" + name + "�����ᳪ�����ĸ���");
	}
}

//�������ǵ�ԭ��
//	���Ƿ����ķ������͡��������ơ������б�������ԭ��������ͬ��
//	���Ƿ������ܱ�ԭ���������Բ������Ȩ�޲�������С����
//	���Ƿ������ܱ�ԭ�����׳�������쳣��
//	�����ǵķ���������final���ͣ���Ϊfinal���εķ������޷����ǵġ�
//	�����ǵķ�������Ϊprivate����������������ֻ���¶�����һ����������û�ж�����и��ǡ�
//	�����ǵķ�������Ϊstatic����������еķ���Ϊ��̬�ģ��������еķ������Ǿ�̬�ģ�������������������һ�������������㸲����������ô�ᷢ���������
//	��֮��Ȼ����ʹ����������еķ������Ǿ�̬�ģ��������㸲��������������Ȼ���ᷢ�����ǣ���Ϊ��̬�������ڱ����ʱ��Ѿ�̬����������������ͽ���ƥ�䡣

//���������أ�
//	ǰ���Ѿ���Java�������ؽ�����˵����������ǿ��һ�£�Java����������еķ�������������أ�
//	���磬��������һ�������� func(){ ... }����������һ�������� func(int i){ ... }���͹����˷��������ء�

//���Ǻ����صĲ�ͬ��
//	��������Ҫ������б�����һ�£�����������Ҫ������б����벻һ�¡�
//	��������Ҫ�󷵻����ͱ���һ�£��������ضԴ�û��Ҫ��
//	��������ֻ���������า�Ǹ���ķ�����������������ͬһ�����е����з����������Ӹ����м̳ж����ķ�������
//	�������ǶԷ����ķ���Ȩ�޺��׳����쳣�������Ҫ�󣬶������������ⷽ��û���κ����ơ�
//	�����һ������ֻ�ܱ����า��һ�Σ���һ���������������е����п��Ա����ض�Ρ�



