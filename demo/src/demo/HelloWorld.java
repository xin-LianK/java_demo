// ��������������															λ��
//
//		�ֽ���                  		byte      	1�ֽ�			3��127					8λ
//		������			short		2�ֽ�			3��12767					16λ
//		����				int			4�ֽ�			3��127674648				32λ
//		������			long		8�ֽ�			3L��984556897889L		64λ			L������
		
// ����������������
//		�����ȸ�����			float		4�ֽ�			1.2F��226.356F		32λ			F������
//		˫���ȸ�����			double		8�ֽ�			1.2D��2.22323.23D	64λ			D���п���
		
// �ַ���		char	2�ֽ�													16λ
// ������		boolean		1bit

//       explem: 
//				float 32 λ������ IEEE754  32λ ��׼��
//						��λ����λ������ 8λָ��λ������23λ��С��λ
//				double 64 λ������ IEEE754 64λ ��׼��
//						��λ����λ������11λָ��λ������52λ��С��λ


//λ�� �� ���������͵�λ�� �� ����������ת��
//       ��              ====================================    ��
//     byte, short, char -> int -> long -> float -> double
//
//
//		��ѧ�����		+	-	*	/	%	++	--
//		��ϵ�����		>	>=	<	<=	==	!=	&&	||	!
//		λ�������
//			&  		��		1 & 4
//			|  		��		1 | 4
//			^  		���		1 ^ 4
//			~  		��		~5
//			<<  	����		5 << 3
//			>>  	����		6 >> 1
//
//			^ �����Щλ���㶼����Զ����Ƶġ�
//				i�Ķ�����Ϊ110010.
//				j�Ķ�����Ϊ111100.
//				110010
//				111100
//				001110=>����ǽ���ˡ����ת��Ϊʮ���� 14
//				һλһλ�Ŀ����������ͬΪ0 ��ͬΪ1
//
//			& | ���  ��Щλ���㶼����Զ����Ƶġ�
//				8�Ķ�����Ϊ1001.
//				9�Ķ�����Ϊ1000.
//				1001
//				1000
//				�������һ��1��ʾ�棬0��ʾ�١������һλ 1&1=1�����ұ�һλ 1&0 = 0.
//
//		�����������
//			condition ? x1 : x2;
//			conditionΪһ��booleanֵ������condition��ȡx1��x2��ֵ��

package demo;
import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Hellow World");

		char webName1 = '��';
		char webName2 = '��';
		char webName3 = '��';
		System.out.println("�������������" + webName1 + webName2 + webName3);
		
		short x = 22;
		int y = 022;
		long z = 0x22L;
		System.out.println("ת��Ϊʮ���ƣ�x = " + x + " y = " + y + " z = " + z);
		
		float m = 22.45F;
		double n = 10;
		System.out.println("����˻�" + m + " * " + n + " = " + m*n);
		
		boolean a = 100 > 10;
		boolean b = 100 < 10;
		System.out.println("100 > 10 = " + a);
		System.out.println("100 < 10 = " + b);
		
		if(a) {
			System.out.println("100 > 10 �ǶԵ�");
		}else {
			System.out.println("100 < 10�Ǵ���");
		}
		
		
		// ǿ��ת����������
		int c;
		double d;
		c = (int)34.56 + (int)11.2;			//	��ʧ����
		d = (double)c + (double)10 + 1;		//	��߾���
		System.out.println("c = " + c);
		System.out.println("d = " + d);	
		
		
		//	��ϵ�����
		int e = 10;
		int f = 10;
		
		int g = 10;
		int h = 21;
		int k = 10;
		
		System.out.println("���Լ� e = " + ( e++ ));
		System.out.println("e��ֵ e = " + e);
		System.out.println("ǰ�Լ� f = " + ( ++f ));
		
		System.out.println("----------------0--------------");
		System.out.println("˵ g > h, ���� " + ( g > h ));
		System.out.println("��Ϊ g > h ���� g < h ����" + ( ( g > h) && ( g < h) ));
		System.out.println("��Ϊ g >= h ���� g == h ����" + ( ( g >= h) || ( g == h) ));
		System.out.println("��Ϊ g < h ���� h == i ����" + ( ( g < h) || ( h == k) ));
		
		System.out.println("----------------0--------------");
		System.out.println(" e & g �Ľ���ǣ�" + ( e & g ));
		System.out.println(" e | g �Ľ���ǣ�" + ( e | g ));
		System.out.println(" h ^ i �Ľ���ǣ�" + ( h ^ k ));
		
		System.out.println("----------------0--------------");
		System.out.println("a ����2λ�Ľ���ǣ�" + ( e << 2 ));
        System.out.println("y ����3λ�Ľ���ǣ�" + ( h >> 3 ));
		
        System.out.print("\n"); 
        
        //�žų˷���
        int i, j;
        for(i=1; i<=9; i++){
            for(j=1; j<=9; j++){
                if(j<i){
                    //��ӡ�˸��ո�ȥ���ո��������������
                    System.out.print("        ");
                }else{
                    System.out.printf("%d*%d=%2d  ", i, j, i*j);
                }
            }
            System.out.print("\n"); 
        }
		//  println() ������ݺ��У�print() �����С�
		
        
        
        //	��ĳһ���ĳһ���ж����죺
        int days = 0;
        // ��ȡ�û�����
        Scanner sc = new Scanner(System.in);
        System.out.print("������ݣ�");
        int year = sc.nextInt();
        System.out.print("�����·ݣ�");
        int month = sc.nextInt();
       
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                // �ж�����
                if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    days=29;
                else
                    days=28;
                break;
            default:
                System.out.println("�·��������");
                System.exit(0);  // ǿ�ƽ�������
        }
        System.out.printf("������%d\n", days);
		
		// 		����
//		int demoArray[];
//		int[] demoArray;
//		demoArray = new int[3];
		int demoArray[] = new int[3];
		
		//��̬��ʼ��
		int intArray[] = {1, 2, 3, 4};
		String stringArray[] = {"PHP","��","��������õ�����"};
		
		//��̬��ʼ��
		float floatArray[] = new float[3];
		floatArray[0] = 1.0f;
		floatArray[1] = 132.63f;
		floatArray[2] = 100F;
		
		
//		��������5��������������ǵĺ�
		int testArray[] = new int[5];
		long total = 0;
		int len = testArray.length;
		
		//������Ԫ�ظ�ֵ
		System.out.print("������" + len + "���������Կո�Ϊ�ָ���");
		Scanner sc1 = new Scanner(System.in);
		for(int i1=0; i1<len; i1++) {
			testArray[i1] = sc1.nextInt();
		}
		
		//�����Ԫ��֮��
		for(int i1=0;i1<len;i1++) {
			total += testArray[i1];
		}
		
		System.out.println("��������Ԫ��֮��Ϊ��" + total);
		
		//����ı���
		
		for(int i1=0,len1 = testArray.length;i1 < len;i1++) {
			System.out.print(testArray[i1] + "��");
		}
		
		int test1Array[] = {1, 2, 4, 44, 80, 90};
		for (int v: test1Array) {
			System.out.println(v + ",");
		}
		
		//��ά����
		int twoArray[][] = {{1, 2},{5, 6, 6},{89, 4, 5},{12, 15, 56}};
		int threeArray[][] = new int[2][3];
		threeArray[0][0] = 12;
		threeArray[0][1] = 34;
		//````````
		threeArray[1][2] = 99;
		
		int fourArray[ ][ ] = { {1,2}, {2,3}, {3,4,5} };
		int fiveArray[ ][ ] = new int[2][ ];
		fiveArray[0] = new int[3];
		fiveArray[1] = new int[5];
		
		String url = "www.baidu.com";
//		String url = new String("www.baidu.com");
		
		//�ַ����ĳ���
		System.out.println(url.length());
		
//		��������ֵ����ַ����е�ָ���ַ�
		System.out.println(url.charAt(0) + "   " + url.charAt(6) + "   " + url.charAt(11));
		
		//����ַ����Ƿ����ĳ���Ӵ�
		System.out.println(url.contains("baidu"));
		
//		�ַ����滻�������滻�ַ���������ָ�����Ӵ�
		System.out.println(url.replace("baidu", "�ٶ�"));
//		ע�⣺replace() ��������ı�ԭ�����ַ�������������һ���µ��ַ�����
		
//		��ָ���ַ�����Ϊ�ָ������Ե�ǰ�ַ������зָ�ָ�Ľ����һ������
		String strArr[] = url.split(".");
		System.out.println(Arrays.toString(strArr));
		
		
//		------------------------0---------------------
//		StringBuffer�����Ҫ����
		StringBuffer str1 = new StringBuffer();  						// ����16���ֽڳ��ȵĻ�����
		StringBuffer str2 = new StringBuffer(512);  					// ����512���ֽڳ��ȵĻ�����
		StringBuffer str3 = new StringBuffer("www.weixueyuan.net");		// �ڻ������д�����ַ��������ں���Ԥ����16���ֽڳ��ȵĿջ�����
		
		StringBuffer str4 = new StringBuffer("www.google.com");
		
//		����������ǰ�ַ�����ĩβ׷�����ݣ��������ַ��������ӡ�
		str4.append(true);
		
//		����ɾ��ָ��λ�õ��ַ�������ʣ����ַ��γ��µ��ַ���.
		str4.deleteCharAt(3);
		str4.delete(1, 4);
//		�ô����ɾ������ֵΪ1~4֮����ַ�����������ֵ1����������4��
		
//		������ָ��λ�ò����ַ�����������Ϊ��append()��������
		str4.insert(3, "haha");
		
//		 ���������޸�ָ��λ�õ��ַ�
		str4.setCharAt(3, '-');
//		str4.setCharAt(3, "-");
//		������������ʾchar��ͨ�׵�Ҳ����һ���ַ���
//		˫����������ʾstring��ͨ�׵�Ҳ���Ǻܶ��ַ���
		
//		--------------------------0-----------------------------
		
//		�̰߳�ȫ��
		
//			StringBuffer���̰߳�ȫ
//			StringBuilder���̲߳���ȫ
//
//		�ٶȣ�
//			һ������£��ٶȴӿ쵽��Ϊ StringBuilder > StringBuffer > String����Ȼ������Եģ����Ǿ��Եġ�
//
//		ʹ�û�����
//			��������������ʹ�� String��
		
//			���̲߳�����������ʹ�� StringBuilder��
//			���̲߳�����������ʹ�� StringBuffer��
		

		
		
		
		
	}
}