package demo;

//public ��������η������������ǹ����࣬���Ա���������ʡ����η������½ڽ��⡣
//class �Ƕ�����Ĺؼ��֡�
//Dog �������ơ�
//name��age ����ĳ�Ա������Ҳ�����ԣ�bark()��hungry() �����еĺ�����Ҳ�з�����

public class Dog {
	String name;
	int age;
//	��Ա��������Ա�����Ƕ��������С�������֮��ı��������ֱ����ڴ��������ʱ��ʵ�����������ڴ棩����Ա�������Ա����еķ������ض���������ʡ�
	
//	������������Ҳ���������У�������֮�⣬����������Ϊstatic���͡�static Ҳ�����η���һ��
	
	
	// ���췽����û�з���ֵ
	Dog(String name1, int age1){
		name = name1;
		age = age1;
		System.out.println("��л������������.....");
	}
//		���췽�����ܱ���ʾ���á�
//		���췽�������з���ֵ����Ϊû�б��������շ���ֵ��
	
	
	// ��ͨ�����������з���ֵ
	void bark() {
		String in;
//		�ֲ��������ڷ������������ж���ı�������Ϊ�ֲ����������������ͳ�ʼ�������ڷ����У����������󣬱����ͻ��Զ����١�
		System.out.println("��������Ҫ����....");
	}
	
	void hungry() {
		System.out.println("���ˣ�" + name + "����......");
	}
	
	public static void main(String[] args) {
	//	Dog myDog;							//����һ������
	//	myDog = new Dog("huahua", 3);		//ʵ����
	
		Dog myDog = new Dog("����", 3);   //������ͬʱ���г�ʼ��
		
		//���ʳ�Ա����
		String name = myDog.name;
		int age = myDog.age;
		System.out.println("�����ҵ�С�����������ֽ�" + name + "������������" + age + "��");
		
		//���ʷ���
		myDog.bark();
		myDog.hungry();
	}
}
