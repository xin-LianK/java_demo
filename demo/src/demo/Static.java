package demo;

public class Static {
//		static ���η��ܹ������������һ��ʹ�ã���ʾ�ǡ���̬���ġ�
//			��̬�����;�̬�����ܹ�ͨ�����������ʣ�����Ҫ����һ����Ķ��������ʸ���ľ�̬��Ա������static���εĳ�Ա�ֳ�����������෽����
//			��̬������ʵ��������ͬ��ʵ����������ͨ�����������ʣ���Ϊ���ǵ�ֵ�ڶ���Ͷ���֮��������ͬ��
	static int i = 10;
	static int a;
	int j;
	int b;
	
	Static(){
		this.j = 20;
	}
	
	public static void main(String[] args) {
		System.out.println("����� i = " + Static.i);
		Static obj = new Static();
		System.out.println("ʵ������ j = " + obj.j);
		
		Static obj1 = new Static();
		obj1.a = 20;
		obj1.b = 10;
		
		Static obj2 = new Static();
		
		System.out.println("obj1.a=" + obj1.a + ",obj1.b=" + obj1.b);
		System.out.println("obj2.a=" + obj2.a + ",obj2.b=" + obj2.b);
	}
	
//	ע�⣺static �ı���������װ�ص�ʱ��ͻᱻ��ʼ����Ҳ����˵��ֻҪ�౻װ�أ��������Ƿ�ʹ�������static �����������ᱻ��ʼ����
	
//	С�᣺�����(class variables)�ùؼ��� static ���Σ�������ص�ʱ�򣬷�����������ڴ棬�Ժ����������ʵ������ʱ������������ڴ棨����������κ�һ���������������޸ģ�����Ӱ����������
//		�ⲿ�����ַ��ʷ�ʽ��ͨ�����������ʻ�ͨ�����������ʡ�
}
