package demo;

public class This {
	public int x = 10;
	public int y = 15;
	
	public String name;
	public int age;
	
	public void sun() {
		//ͨ��this����ȡ��Ա����
		int z = this.x + this.y;
		
		System.out.println("x + y =" + z);
	}
	
//	public static void main(String[] args) {
//		This obj = new This();
//		obj.sun();
//	}
	public This() {
		this("Daye",14);
	}
	
	public This(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void say() {
		System.out.println("�ҵ������ǣ�" + name + ",�ҵ������ǣ�" + age);
	}
	
	public static void main(String[] args) {
		This obj = new This("Daye", 14);
		obj.say();
	}
	
//		ֵ��ע����ǣ�
//			�ڹ��췽���е�����һ�����췽�������ö���������������ʼ��λ�á�
//			�����ڹ��췽��������κη����ڵ��ù��췽����
//			��һ�����췽����ֻ�ܵ���һ�����췽����
}
