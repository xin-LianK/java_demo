package demo;

class People{
	String name;
	int age;
	int height;
	
	void say(){
		System.out.println("�ҵ������ǣ�" + name + "�������ǣ�" + age + "���ҵ�����ǣ�" + height);
	}
}

class Teacher extends People{
	String school;
	String subject;
	int seniority;
	
	 // ���� People ���е� say() ����
	void say() {
		System.out.println("�ҽ�" + name + "����" + school + "ѧУ��" + subject + "�γ̣��Ѿ���" + seniority + "�Ľ�����");
	}
	
	void lecturing() {
		System.out.println("���Ѿ�" + age + "���ˣ���Ȼ���ڽ�̨�Ͻ���");
	}
}

public class Inherit {
//	�̳п������Ϊһ�������һ�����ȡ���������ԵĹ��̡������B�̳�����A����ôB��ӵ��A�ķ��������ԡ�
//	�̳�ʹ�� extends �ؼ��֡�
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Jack";
		t.age = 50;
		t.school = "NiuJin unity";
		t.subject = "Math";
		t.seniority = 14;
		t.say();
		t.lecturing();
	}
}

	
//�Գ����˵��
//name �� age ������Ȼû���� Teacher �ж��壬�������� People �ж��壬����ֱ�������á�
//Teacher �� People �����࣬People ��Teacher ��ĸ��ࡣ
//������Ը��Ǹ���ķ�����
//������Լ̳и����private��Ϊ�����еĳ�Ա��
//���췽�����ܱ��̳�

//���̳��ԣ�Java ����һ������ܼ̳�һ�������࣬��һ����ֻ����һ�����࣬������Ʊ��������̳��ԡ�
//���潫��ѧ���ӿ�(interface)�ĸ���ӿ������̳С�