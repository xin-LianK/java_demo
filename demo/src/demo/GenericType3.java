package demo;
//		���ͷ���------���Ͳ����ķ�Χ
public class GenericType3 {
//	�ڷ����У�����������Ͳ����������ƣ����Ϳ��Խ���������������ͣ�ֻҪ���Ǳ�������ġ�
	public <T extends Number> T getMax(T array[]) {
		T max = null;
		for(T element : array) {
			max = element.doubleValue() > max.doubleValue() ? element : max;
		}
		return max;
	}
}
//<T extends Number> ��ʾ T ֻ���� Number �������࣬�����������͵����ݻᱨ��
//������޶�ʹ�ùؼ��� extends�������������Ҳ�����ǽӿڡ�
//������ֻ࣬����һ�������ǽӿڿ����ж�������ԡ�&���ָ���
//	���� <T extends Interface1 & Interface2>��