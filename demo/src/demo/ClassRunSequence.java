package demo;

public class ClassRunSequence {
	private String name;											//	4.......
	private int age;												//	5.......
	
	public ClassRunSequence() {										//	3..可能很多人觉得接下来就应该运行第 6 行了，错！初始化一个类，必须先初始化它的属性。
		
		name = "keay";												//	6..属性初始化完过后，才回到构造方法，执行里面的代码
		age = 14;													//	7..
	}																//	8..表示 new 一个ClassRunSequence实例完成
	
	public static void main(String[] args) {						//	1..程序的入口
		ClassRunSequence obj = new ClassRunSequence();				//	2..new一个对象，调用ClassRunSequence的构造方法
		
		System.out.println(obj.name + "的年龄是" + obj.age);			//	11..
	}																//	12..
}
