package demo;
import java.util.*;
public class Date {
	public static void main(String args[]){
        Date da=new Date();
        System.out.println(da);
        SimpleDateFormat ma1=new SimpleDateFormat("yyyy �� MM �� dd �� E ����ʱ��");
        System.out.println(ma1.format(da));
        SimpleDateFormat ma2=new SimpleDateFormat("����ʱ�䣺yyyy �� MM �� dd �� HH ʱ mm �� ss ��");
        System.out.println(ma2.format(-1000));
    }
}
