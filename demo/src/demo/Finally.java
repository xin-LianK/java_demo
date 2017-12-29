package demo;

public class Finally {
	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo");
		}finally {
			System.out.println("procA`s finally");
		}
	}
	
	static void procB() {
		try {
			System.out.println("inside procB");
			return;
		}finally {
			System.out.println("procB`s finally");
		}
	}
	
	static void procC() {
		try {
			System.out.println("inside procC");
		}finally {
			System.out.println("procC`s finally");
		}
	}
	
	public static void main(String[] args) {
		try {
			procA();
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
		procB();
		procC();
	}
}

//		如果finally块与一个try联合使用，finally块将在try结束之前执行。
