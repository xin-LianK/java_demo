package demo;

//import packageName.className;  // ����ĳ���ض�����
//import packageName.*;  // ������е�������
//import static packageName.className.methonName;  // ����ĳ���ض��ľ�̬����
//import static packageName.className.*;  // �������е����о�̬��Ա


//����󣬿����ڵ�ǰ����ֱ���÷��������þ�̬�������������� className.methodName �����ʡ�

import static java.lang.System.*;
import static java.lang.Math.random;

public class StaticMethod {
//	��̬������һ�ֲ��������ʵʩ�����ķ�����
//		���磬Math ��� pow() ��������һ����̬�������﷨Ϊ Math.pow(x, a)���������� x �� a ���ݣ���ʹ��ʱ���贴���κ� Math ����
	
//	��Ϊ��̬�������ܲ����������Բ����ھ�̬�����з���ʵ��������ֻ�ܷ���������ľ�̬����
	
//	�������ο���ʹ�þ�̬������
//		һ����������Ҫ���ʶ���״̬���������������ͨ����ʽ�����ṩ������ Math.pow()����
//		һ������ֻ��Ҫ������ľ�̬������
	
//	���ھ�̬�����;�̬�������ܽ᣺
//		һ����ľ�̬����ֻ�ܷ��ʾ�̬������
//		һ����ľ�̬�������ܹ�ֱ�ӵ��÷Ǿ�̬������
//		����ʿ���Ȩ����������̬�����;�̬����Ҳ����ͨ�����������ʣ����ǲ����Ƽ���
//		��̬�����в����ڵ�ǰ�����������ʹ�� this����ȻҲ����ʹ�� super��
//		��̬�������ܱ��Ǿ�̬�������ǣ�
//		���췽������������Ϊ static �ģ�
//		�ֲ���������ʹ��static���Ρ�
	public static int i;
	static int sum(int x, int y) {
		return x + y;
	}
	static {
		i = 20;
		System.out.println("Now in static block");
	}
	public void test() {
		System.out.println("test method��i= " + i);
	}
	
	public static void main(String[] args) {
		System.out.println("StaticMethod.i = " + StaticMethod.i);
		new StaticMethod().test();
		int sum = StaticMethod.sum(10,20);
		System.out.println("10 + 20 = " + sum);
		
		out.println("������һ���������" + random());
	}
}