package demo;

public class Dynamic {
	public static void main(String[] args) {
		Animalss obj = new Animalss();
		obj.cry();
		
		obj = new Chicken();
		obj.cry();
		
		obj = new Cattle();
		obj.cry();
	}
}
class Animalss{
	//����Ľ���
	public void cry() {
		System.out.println("��֪����ô��");
	}
}

class Chicken extends Animalss{
	public void cry() {
		System.out.println("����������");
	}
}

class Cattle extends Animalss{
	public void cry() {
		System.out.println("���衤����");
	}
}

//��̬��ָһ�������в�ͬ�ı�����ʽ����̬��

//��̬���ڵ�������Ҫ������Ҫ�м̳С�Ҫ����д��������������������

//��ʹ�ö�̬��ʽ���÷���ʱ��
//	���ȼ�鸸�����Ƿ��и÷��������û�У���������
//	����У����������Ƿ񸲸��˸÷�����
//	������า���˸÷������͵�������ķ�����������ø��෽����

//����������ӿ��Կ�������̬��һ���ô��ǣ�
//		������Ƚ϶�ʱ��Ҳ����Ҫ����������������ֻ����һ���������͵ı��������ò�ͬ�����ʵ��






