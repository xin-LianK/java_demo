package demo;

public final class Instanceof{
    public static void main(String[] args) {
        // ���� People ���ʵ��
        People obj = new People();
        if(obj instanceof Object){
            System.out.println("����һ������");
        }
        if(obj instanceof People){
            System.out.println("��������");
        }
        if(obj instanceof Teacher){
            System.out.println("����һ����ʦ");
        }
        if(obj instanceof President){
            System.out.println("����У��");
        }

        System.out.println("-----------");  // �ֽ���
       
        // ���� Teacher ���ʵ��
        obj = new Teacher();
        if(obj instanceof Object){
            System.out.println("����һ������");
        }
        if(obj instanceof People){
            System.out.println("��������");
        }
        if(obj instanceof Teacher){
            System.out.println("����һ����ʦ");
        }
        if(obj instanceof President){
            System.out.println("����У��");
        }
    }
}

class People{ };
class Teacher extends People{ };
class President extends Teacher{ };