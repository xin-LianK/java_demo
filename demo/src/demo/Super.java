package demo;
//super �������������У�ͨ�����(.)����ȡ����ĳ�Ա�����ͷ�����
//super Ҳ������������������У�Java ���Զ����ϲ���׷�ݡ�
//������Ϊ�����ã��ͺ������Ϊ�Ǳ������Ϊһ�������ҵ�����Ϊ���ط����ڸ����У������Զ����ϲ���׷��

//super �ؼ��ֵĹ��ܣ�
//	���ø���������Ϊ private �ı�����
//	��ȡ�Ѿ������˵ķ�����
//	��Ϊ��������ʾ���๹�췽����

//move() ����Ҳ���Զ�����ĳЩ�������У����縸��ĸ��࣬Java ����׷���ԣ���һֱ�����ң�ֱ���ҵ��÷���Ϊֹ��

//ͨ�� super ���ø�������ر���������Ҫ�ڸ��������� getter ��������Ϊ����Ϊ private �����ݳ�Ա�������ǲ��ɼ��ġ�
public class Super {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.move();
	}
}

class Aniaml{
	private String desc = "Animals are human`s good friends";
	//��������һ��getter����
	public String getDesc() {return desc;}
	
	public void move() {
		System.out.println("Animals can move");
	}
}

class Cat extends Aniaml{
	public void move() {
		super.move();//���ø���ķ���
		System.out.println("Cats can walk and run");
		// ͨ�� getter �������ø������ر���
		System.out.println("Please remember:" + super.getDesc());
	}
}