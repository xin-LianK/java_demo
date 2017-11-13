// 整型有四种类型															位宽
//
//		字节型                  		byte      	1字节			3，127					8位
//		短整型			short		2字节			3，12767					16位
//		整形				int			4字节			3，127674648				32位
//		长整型			long		8字节			3L，984556897889L		64位			L必须有
		
// 浮点型有两种类型
//		单精度浮点型			float		4字节			1.2F，226.356F		32位			F必须有
//		双精度浮点型			double		8字节			1.2D，2.22323.23D	64位			D可有可无
		
// 字符型		char	2字节													16位
// 布尔型		boolean		1bit

//       explem: 
//				float 32 位，根据 IEEE754  32位 标准，
//						首位正负位，后面 8位指数位，余下23位是小数位
//				double 64 位，根据 IEEE754 64位 标准，
//						首位正负位，后面11位指数位，余下52位是小数位


//位数 低 的数据类型到位数 高 的数据类型转换
//       低              ====================================    高
//     byte, short, char -> int -> long -> float -> double
//
//
//		数学运算符		+	-	*	/	%	++	--
//		关系运算符		>	>=	<	<=	==	!=	&&	||	!
//		位运算符：
//			&  		与		1 & 4
//			|  		或		1 | 4
//			^  		异或		1 ^ 4
//			~  		非		~5
//			<<  	左移		5 << 3
//			>>  	右移		6 >> 1
//
//			^ 异或这些位运算都是针对二进制的。
//				i的二进制为110010.
//				j的二进制为111100.
//				110010
//				111100
//				001110=>这就是结果了。最后转换为十进制 14
//				一位一位的看，异或是相同为0 不同为1
//
//			& | 与非  这些位运算都是针对二进制的。
//				8的二进制为1001.
//				9的二进制为1000.
//				1001
//				1000
//				计算机中一般1表示真，0表示假。最左边一位 1&1=1，最右边一位 1&0 = 0.
//
//		条件运算符：
//			condition ? x1 : x2;
//			condition为一个boolean值。根据condition，取x1或x2的值。

package demo;
import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Hellow World");

		char webName1 = '计';
		char webName2 = '算';
		char webName3 = '机';
		System.out.println("这个东西叫做：" + webName1 + webName2 + webName3);
		
		short x = 22;
		int y = 022;
		long z = 0x22L;
		System.out.println("转换为十进制：x = " + x + " y = " + y + " z = " + z);
		
		float m = 22.45F;
		double n = 10;
		System.out.println("计算乘积" + m + " * " + n + " = " + m*n);
		
		boolean a = 100 > 10;
		boolean b = 100 < 10;
		System.out.println("100 > 10 = " + a);
		System.out.println("100 < 10 = " + b);
		
		if(a) {
			System.out.println("100 > 10 是对的");
		}else {
			System.out.println("100 < 10是错的");
		}
		
		
		// 强制转换数据类型
		int c;
		double d;
		c = (int)34.56 + (int)11.2;			//	丢失精度
		d = (double)c + (double)10 + 1;		//	提高精度
		System.out.println("c = " + c);
		System.out.println("d = " + d);	
		
		
		//	关系运算符
		int e = 10;
		int f = 10;
		
		int g = 10;
		int h = 21;
		int k = 10;
		
		System.out.println("后自加 e = " + ( e++ ));
		System.out.println("e的值 e = " + e);
		System.out.println("前自加 f = " + ( ++f ));
		
		System.out.println("----------------0--------------");
		System.out.println("说 g > h, 对吗？ " + ( g > h ));
		System.out.println("认为 g > h 并且 g < h 对吗？" + ( ( g > h) && ( g < h) ));
		System.out.println("认为 g >= h 或者 g == h 对吗？" + ( ( g >= h) || ( g == h) ));
		System.out.println("认为 g < h 或者 h == i 对吗？" + ( ( g < h) || ( h == k) ));
		
		System.out.println("----------------0--------------");
		System.out.println(" e & g 的结果是：" + ( e & g ));
		System.out.println(" e | g 的结果是：" + ( e | g ));
		System.out.println(" h ^ i 的结果是：" + ( h ^ k ));
		
		System.out.println("----------------0--------------");
		System.out.println("a 左移2位的结果是：" + ( e << 2 ));
        System.out.println("y 右移3位的结果是：" + ( h >> 3 ));
		
        System.out.print("\n"); 
        
        //九九乘法表
        int i, j;
        for(i=1; i<=9; i++){
            for(j=1; j<=9; j++){
                if(j<i){
                    //打印八个空格，去掉空格就是左上三角形
                    System.out.print("        ");
                }else{
                    System.out.printf("%d*%d=%2d  ", i, j, i*j);
                }
            }
            System.out.print("\n"); 
        }
		//  println() 输出内容后换行，print() 不换行。
		
        
        
        //	求某一年的某一月有多少天：
        int days = 0;
        // 获取用户输入
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份：");
        int year = sc.nextInt();
        System.out.print("输入月份：");
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
                // 判断闰年
                if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    days=29;
                else
                    days=28;
                break;
            default:
                System.out.println("月份输入错误！");
                System.exit(0);  // 强制结束程序
        }
        System.out.printf("天数：%d\n", days);
		
		// 		数组
//		int demoArray[];
//		int[] demoArray;
//		demoArray = new int[3];
		int demoArray[] = new int[3];
		
		//静态初始化
		int intArray[] = {1, 2, 3, 4};
		String stringArray[] = {"PHP","是","世界上最好的语言"};
		
		//动态初始化
		float floatArray[] = new float[3];
		floatArray[0] = 1.0f;
		floatArray[1] = 132.63f;
		floatArray[2] = 100F;
		
		
//		输入任意5个整数，输出它们的和
		int testArray[] = new int[5];
		long total = 0;
		int len = testArray.length;
		
		//给数组元素赋值
		System.out.print("请输入" + len + "个整数，以空格为分隔：");
		Scanner sc1 = new Scanner(System.in);
		for(int i1=0; i1<len; i1++) {
			testArray[i1] = sc1.nextInt();
		}
		
		//计算各元素之和
		for(int i1=0;i1<len;i1++) {
			total += testArray[i1];
		}
		
		System.out.println("所有数组元素之和为：" + total);
		
		//数组的遍历
		
		for(int i1=0,len1 = testArray.length;i1 < len;i1++) {
			System.out.print(testArray[i1] + "，");
		}
		
		int test1Array[] = {1, 2, 4, 44, 80, 90};
		for (int v: test1Array) {
			System.out.println(v + ",");
		}
		
		//二维数组
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
		
		//字符串的长度
		System.out.println(url.length());
		
//		按照索引值获得字符串中的指定字符
		System.out.println(url.charAt(0) + "   " + url.charAt(6) + "   " + url.charAt(11));
		
		//检测字符串是否包含某个子串
		System.out.println(url.contains("baidu"));
		
//		字符串替换，用来替换字符串中所有指定的子串
		System.out.println(url.replace("baidu", "百度"));
//		注意：replace() 方法不会改变原来的字符串，而是生成一个新的字符串。
		
//		以指定字符串作为分隔符，对当前字符串进行分割，分割的结果是一个数组
		String strArr[] = url.split(".");
		System.out.println(Arrays.toString(strArr));
		
		
//		------------------------0---------------------
//		StringBuffer类的主要方法
		StringBuffer str1 = new StringBuffer();  						// 分配16个字节长度的缓冲区
		StringBuffer str2 = new StringBuffer(512);  					// 分配512个字节长度的缓冲区
		StringBuffer str3 = new StringBuffer("www.weixueyuan.net");		// 在缓冲区中存放了字符串，并在后面预留了16个字节长度的空缓冲区
		
		StringBuffer str4 = new StringBuffer("www.google.com");
		
//		方法用于向当前字符串的末尾追加内容，类似于字符串的连接。
		str4.append(true);
		
//		用来删除指定位置的字符，并将剩余的字符形成新的字符串.
		str4.deleteCharAt(3);
		str4.delete(1, 4);
//		该代码会删除索引值为1~4之间的字符，包括索引值1，但不包括4。
		
//		用来在指定位置插入字符串，可以认为是append()的升级版
		str4.insert(3, "haha");
		
//		 方法用来修改指定位置的字符
		str4.setCharAt(3, '-');
//		str4.setCharAt(3, "-");
//		单引号用来表示char，通俗点也就是一个字符串
//		双引号用来表示string，通俗点也就是很多字符串
		
//		--------------------------0-----------------------------
		
//		线程安全：
		
//			StringBuffer：线程安全
//			StringBuilder：线程不安全
//
//		速度：
//			一般情况下，速度从快到慢为 StringBuilder > StringBuffer > String，当然这是相对的，不是绝对的。
//
//		使用环境：
//			操作少量的数据使用 String；
		
//			单线程操作大量数据使用 StringBuilder；
//			多线程操作大量数据使用 StringBuffer。
		

		
		
		
		
	}
}