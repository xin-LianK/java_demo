package demo;

public class TypeConversionOfPolymorphicObjects {
	public static void main(String[] args) {
		SuperClass superObj = new SuperClass();
		SonClass sonObj = new SonClass();
		
		// ����Ĵ�������ʱ���׳��쳣�����ܽ��������ֱ��ת��Ϊ��������
//         SonClass sonObj2 = (SonClass)superObj;
		
		// ������ת�ͣ�������ת��
//        superObj = sonObj;
//        SonClass sonObj1 = (SonClass)superObj;
        
//        ��Ϊ����ת�ʹ��ڷ��գ������ڽ��յ������һ������ʱ�������ʹ�� instanceof ��������жϸö����Ƿ�������Ҫ������
		
		// superObj ���� SonClass ���ʵ��
		if (superObj instanceof SonClass) {
			SonClass sonObj1 = (SonClass)superObj;
		}else {
			System.out.println("Dont, One is no");
		}
		
		superObj = sonObj;
		 // superObj �� SonClass ���ʵ��
		if (superObj instanceof SonClass) {
			SonClass sonObj2 = (SonClass)superObj;
		}else {
			System.out.println("Dont, Two is no");
		}
	}
}
class SuperClass{ }
class SonClass extends SuperClass{}


//���������ת���ڳ�������ʱ��飬����ת�ͻ��Զ����У�����ת�͵Ķ�������ǵ�ǰ�������͵�����