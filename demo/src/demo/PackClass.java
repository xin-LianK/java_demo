package demo;

public class PackClass {
//	JavaΪÿ�ֻ����������ͷֱ�����˶�Ӧ���࣬��֮Ϊ��װ��(Wrapper Classes)��Ҳ�н̲ĳ�Ϊ�⸲�������������
//	
//			������������		��Ӧ�İ�װ��
//			byte			Byte
//			short			Short
//			int				Integer
//			long			Long
//			char			Character
//			float			Float
//			double			Double
//			boolean			Boolean
	
//	ÿ����װ��Ķ�����Է�װһ����Ӧ�Ļ������͵����ݣ����ṩ������һЩ���õķ�����
//	��װ�����һ�������������ݣ�����װ�Ļ�����������ֵ�����ɸı䡣
	
//	�������ͺͶ�Ӧ�İ�װ������໥װ����
//		�ɻ����������Ӧ�İ�װ��ת����Ϊ   װ�䣬	����� int ��װ�� Integer ��Ķ���
//		��װ�����Ӧ�Ļ�������ת����Ϊ       ���䣬	����� Integer ��Ķ������¼�Ϊ int��
	public static void main(String[] args) {
		int m = 200;
		
		Integer obj = new Integer(m);	//	�ֶ�װ��
		int n = obj.intValue();			//  �ֶ�����
		System.out.println( " n = " + n );
		
		Integer obj1 = new Integer(200);
		System.out.println("obj�ȼ���obj1��" + obj.equals(obj1));
		
		String str[] = {"123","123abc","abc123","abcxyz"};
		
		for(String str1:str) {
			try {
				int k = Integer.parseInt(str1, 10);
				System.out.println(str1 + "����ת��λ����" + k);
			}catch(Exception e){
				System.out.println(str1 + "�޷�ת��Ϊ����");
			}
		}
		
		String l = Integer.toString(m);
		System.out.println(" l = " + l);
		
		int a = 500;
		Integer obj2 = a;
		int b = obj2;
		System.out.println("b = " + b);
		
		Integer obj3 = 500;
		System.out.println("obj2�ȼ���obj3" + obj2.equals(obj3));

//		�Զ�����װ���ǳ��õ�һ�����ܣ�������Ҫ�ص�����
	}
}