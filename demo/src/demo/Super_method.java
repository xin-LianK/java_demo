package demo;

public class Super_method {
	public static void main(String[] args) {
		Fish obj = new Fish("����", 14);
		obj.say();
	}
}

class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
}

class Fish extends Animal{
    int age;
    public Fish(String name, int age){
        super(name);
        this.age = age;
    }
    public void say(){
        System.out.println("������һ���ɰ��Ľ��㣬�������ֽ�" + name + "��������" + age + "����");
    }
}

//������ super() ���� this()����������ڹ��췽���ĵ�һ�С�

//ֵ��ע����ǣ�
//	�ڹ��췽���е�����һ�����췽�������ö���������������ʼ��λ�á�
//	�����ڹ��췽��������κη����ڵ��ù��췽����
//	��һ�����췽����ֻ�ܵ���һ�����췽����
//
//�����дһ�����췽������û�е��� super() Ҳû�е��� this()�����������Զ�����һ�����õ����๹�췽���У����Ҳ��������� 
//
//���ע�� super �� this ������super ����һ����������ã����ܽ� super ��ֵ����һ�������������ֻ��һ��ָʾ���������ø��෽��������ؼ��֡�