package demo;

public class Modifier {
	//body of class  ���η�
	
	// �������η�
//			���ʿ��Ʒ�		�ܹ������࣬��Ա������������ʹ��Ȩ�޵Ĺؼ���
	
//				public					���еģ������е���ɼ�
					public static void main(String[] args) {
//						��������໥���ʵ�public��ֲ��ڲ��õİ��У�����Ҫ������Ӧpublic�����ڵİ���
//						������ļ̳��ԣ������еĹ��з����ͱ������ܱ�������̳�
					}
					
//				protected				�ܱ����ģ���ͬһ���ڵ������������ɼ�
					protected static final int BOXWIDTH = 45;
					public class Dog{
						protected void bark() {
							System.out.println("��������Ҫ����");
						}
					}
					class Teddy extends Dog{
//						void bark() {
//							System.out.println("�������Һ��£���Ҫ������");
//						}
					}
//						������Ϊprotected�ı����������͹��췽���ܱ�ͬһ�����е��κ���������ʣ�Ҳ�ܹ�����ͬ���е�������ʡ�
//						protected�������η�����������ͽӿڣ������ͳ�Ա����
//						�ܹ�����Ϊprotected�����ǽӿڵĳ�Ա�����ͳ�Ա������������Ϊprotected�� 
					
//				private					˽�еģ���ͬһ���ڿɼ�
					
					public class Dogs{
						private String name;
						private int age;
						public String getName() {
							return name;
						}
						public void setName(String name) {
							this.name = name;
						}
						public int getAge() {
							return age;
						}
						public void setAge(int age) {
							this.age = age;
						}
					}
					
//				Ĭ�ϵ�					��ͬһ���ڿɼ���Ĭ�ϲ�ѡ���κ����η�
					static final double weeks = 9.5;
					
					
//					��ע�����·����̳У����˽�̳и���Ķ��߿�������������ߵ�� Java�̳кͶ�̬ Ԥ�����Ĺ���
//						����������Ϊpublic�ķ�����������Ҳ����Ϊpublic��
//						����������Ϊprotected�ķ�����������Ҫô����Ϊprotected��Ҫô����Ϊpublic����������Ϊprivate��
//						������Ĭ�����η������ķ������ܹ�������������Ϊprivate��
//						����������Ϊprivate�ķ��������ܹ����̳С�
					
//					���ʿ��Ʒ����������Ǻܷ���Ŀ��ƴ����Ȩ�ޣ�
//						����Ҫ���Լ���д���౻���е����������ʱ���Ϳ��Խ���ķ��ʿ��Ʒ�����Ϊ public��
//						����Ҫ���Լ�����ֻ�ܱ��Լ��İ��е������ʱ���Ϳ���ʡ�Է��ʿ��Ʒ���
//						����Ҫ����һ�����еĳ�Ա����ʱ�����Խ�������еĳ�Ա���ݷ��ʿ��Ʒ�����Ϊ public��protected������ʡ�ԡ�
					
//	 		�Ƿ������η�
	
}


