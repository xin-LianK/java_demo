package demo;

import java.util.Date;

public class JavaPackage {
//	��Java�У�Ϊ����֯����ķ��㣬���Խ��������Ƶ���ŵ�һ���ļ����ڣ�����ļ��У��ͽ�������
//	
//	���������԰����࣬�����԰����ӿں������İ�
	
//	ʵ�ְ���
//		package demo;
//		public test() {
//			System.out.println("����Test��Ĺ��췽��");
//		}
//		����Test��λ��demo����
	
//	���ĵ���
//	1��..��ÿһ������ǰ���������İ���
		public static void main(String[] args) {
			java.util.Date today = new java.util.Date();
			System.out.println(today);
		}
		
//	2)..ͨ��import������������
//		import java.util.Date;
//			Ҳ��������java.util�е����а�
//			import java.util.*;
//		public static void main(String[] args) {
//			Date today = new Date();
//			System.out.println(today);
//		}
		
//		ʵ�ʱ���У�û�б�Ҫ��Ҫ�������д����ô��ϸ������ֱ�������ض��������е��࣬���� import java.util.*;��
}	