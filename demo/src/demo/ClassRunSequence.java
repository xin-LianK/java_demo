package demo;

public class ClassRunSequence {
	private String name;											//	4.......
	private int age;												//	5.......
	
	public ClassRunSequence() {										//	3..���ܺܶ��˾��ý�������Ӧ�����е� 6 ���ˣ�����ʼ��һ���࣬�����ȳ�ʼ���������ԡ�
		
		name = "keay";												//	6..���Գ�ʼ������󣬲Żص����췽����ִ������Ĵ���
		age = 14;													//	7..
	}																//	8..��ʾ new һ��ClassRunSequenceʵ�����
	
	public static void main(String[] args) {						//	1..��������
		ClassRunSequence obj = new ClassRunSequence();				//	2..newһ�����󣬵���ClassRunSequence�Ĺ��췽��
		
		System.out.println(obj.name + "��������" + obj.age);			//	11..
	}																//	12..
}
