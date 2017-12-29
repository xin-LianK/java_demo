package demo;
//	�ڲ�������Ǿ�̬(static)�ģ�����ʹ�� public��protected �� private ���ʿ��Ʒ������ⲿ��ֻ��ʹ�� public������Ĭ�ϡ�
public class InClassBreakdown {
//	���ⲿ���ڲ�ֱ�Ӷ��壨���ڷ����ڲ��������ڲ���������ǳ�Աʽ�ڲ��࣬������ֱ��ʹ���ⲿ������б����ͷ�������ʹ�� private �ġ�
//	�ⲿ��Ҫ������ڲ���ĳ�Ա�����ͷ���������Ҫͨ���ڲ���Ķ�������ȡ��
//	------------------��Աʽ�ڲ���-----------------
	private int size;
//	��Աʽ�ڲ������ʹ�ø������η������� public��protected��private��static��final �� abstract��Ҳ���Բ�д��
	class Inner{
		public void dostuff(){
			size ++;
		}
	}
	public void testTheInner(){
		Inner inner =new Inner();
		inner.dostuff();
	}
//	��Աʽ�ڲ�����ͬ�ⲿ���һ����ͨ��Ա
//	���� static ���η�����Ϊ�༶������Ϊ����
	
//	
	public static void main(String[] args) {
		
//		1) 		ʹ���ڲ����ж���ķǾ�̬�����ͷ���ʱ��Ҫ�ȴ����ⲿ��Ķ������ɡ�outObjectName.new�������������ڲ���Ķ����ٵ����ڲ���ķ���
		InClassBreakdown outer = new InClassBreakdown();
		InClassBreakdown.Inner inner = outer.new Inner();
		
//		2)		static �ڲ����൱�����ⲿ��� static ��Ա�����Ķ������ⲿ�����䲻����������ϵ����˿�ֱ�Ӵ�����
		InClassBreakdown.Inner inner = new InClassBreakdown().Inner();
		
//		3)		�����ڲ������ֱ�ӷ������ⲿ��ĳɷ֣���˵��ڲ��������ⲿ���д���ͬ�����Ի򷽷�ʱ��Ҳ������������ͻ�������ڶ�����ʱҪָ��
//		public class Outer{
//		    private int size;
//		    public class Inner{
//		        private int size;
//		        public void dostuff(int size){
//		            size++;  // �ֲ����� size;
//		            this.size;  // �ڲ���� size
//		            Outer.this.size++;  // �ⲿ��� size
//		        }
//		    }
//		}
		inner.dostuff();
	}
//	-------------------�ֲ��ڲ���---------------------
//	�ֲ��ڲ���(Local class)�Ƕ����ڴ�����е��ࡣ����ֻ�ڶ������ǵĴ�������ǿɼ��ġ�
//		�ֲ����м�����Ҫ���ԣ�
//			���ڶ��������ǵĴ�������ǿɼ��ģ�
//			����ʹ�ö������ǵĴ�����е��κξֲ� final ������
//			�ֲ��಻������ static �ģ����Ҳ���ܶ��� static ��Ա��
//			�ֲ��಻������ public��private��protected ���Σ�ֻ��ʹ��ȱʡ�ģ�
//			�ֲ�������� abstract �ġ�
//	public class Outer {
//	    public static final int TOTAL_NUMBER = 5;
//	    public int id = 123;
//	    public void func() {
//	        final int age = 15;
//	        String str = "http://www.weixueyuan.net";
//	        class Inner {
//	            public void innerTest() {
//	                System.out.println(TOTAL_NUMBER);
//	                System.out.println(id);
//	                // System.out.println(str);���Ϸ���ֻ�ܷ��ʱ��ط�����final����
//	                System.out.println(age);
//	            }
//	        }
//	        new Inner().innerTest();
//	    }
//	    public static void main(String[] args) {
//	        Outer outer = new Outer();
//	        outer.func();
//	    }
//	}
//	---------------------�����ڲ���-------------------
//	�����ڲ����Ǿֲ��ڲ����һ��������ʽ��Ҳ����û�б�����ָ��������ʵ�������Ҿ������ʵ�ֻ�д������ڲ������档
//	abstract class Person {
//	    public abstract void eat();
//	}
//	class Child extends Person {
//	    public void eat() {
//	        System.out.println("eat something");
//	    }
//	}
//	public class Demo {
//	    public static void main(String[] args) {
//	        Person p = new Child();
//	        p.eat();
//	    }
//	}
}
