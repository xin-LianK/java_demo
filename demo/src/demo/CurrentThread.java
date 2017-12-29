package demo;

public class CurrentThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		
		t.setName("My Thread");
		System.out.println("After name change:" + t);
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}

//�ڱ������У���ǰ�̣߳���Ȼ�����̣߳�������ͨ������currentThread()��ã������ñ����ھֲ�����t�С�
//Ȼ�󣬳�����ʾ���̵߳���Ϣ�����ų������setName()�ı��̵߳��ڲ����ơ��߳���Ϣ�ֱ���ʾ��
//Ȼ��һ��ѭ������5��ʼ�ݼ���ÿ��һ����ͣһ�롣��ͣ����sleep()��������ɵġ�
//Sleep()�����ȷ�涨�ӳ�ʱ����1���롣ע��ѭ�����try/catch�顣


//ע��t��Ϊ���println()�в�������ʱ����Ĳ���������ʾ˳���߳����ƣ����ȼ��Լ�������ơ�
//Ĭ������£����̵߳�������main���������ȼ���5����Ҳ��Ĭ��ֵ��mainҲ�������߳�������ơ�
//һ���߳��飨thread group����һ�ֽ��߳���Ϊһ�����弯�ϵ�״̬���Ƶ����ݽṹ��
//	���������ר�е�����ʱ�������������ڴ˾Ͳ�׸���ˡ��߳����ı��t�ֱ��������Σ���ʾ���µ��߳�����
//
//�����Ǹ���ϸ���о�������Thread�ඨ��ķ�����sleep()�������պ��뼶��ʱ��ָʾʹ�̴߳ӱ����õ���������ͨ����ʽ���£�
//    static void sleep(long milliseconds) throws InterruptedException
//�����ʱ�䱻��ȷ����Ϊ���롣�÷�����������InterruptedException�쳣��
//
//sleep()�������еڶ�����ʽ����ʾ���£��÷���������ָ��ʱ�����Ժ��뻹��������Ϊ���ڡ�
//    static void sleep(long milliseconds, int nanoseconds) throws InterruptedException
//
//�ڶ�����ʽ��������������Ϊʱ������ʱ���á�������������ʾ���������setName()�����߳����ƣ���getName()������߳����ƣ��ù����ڳ�����û�����֣�����Щ��������Thread ��ĳ�Ա���������£�
//    final void setName(String threadName)
//    final String getName( )
//���threadName ��ָ�߳����ơ�