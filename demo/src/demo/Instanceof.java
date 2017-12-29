package demo;

public final class Instanceof{
    public static void main(String[] args) {
        // 引用 People 类的实例
        People obj = new People();
        if(obj instanceof Object){
            System.out.println("我是一个对象");
        }
        if(obj instanceof People){
            System.out.println("我是人类");
        }
        if(obj instanceof Teacher){
            System.out.println("我是一名教师");
        }
        if(obj instanceof President){
            System.out.println("我是校长");
        }

        System.out.println("-----------");  // 分界线
       
        // 引用 Teacher 类的实例
        obj = new Teacher();
        if(obj instanceof Object){
            System.out.println("我是一个对象");
        }
        if(obj instanceof People){
            System.out.println("我是人类");
        }
        if(obj instanceof Teacher){
            System.out.println("我是一名教师");
        }
        if(obj instanceof President){
            System.out.println("我是校长");
        }
    }
}

class People{ };
class Teacher extends People{ };
class President extends Teacher{ };