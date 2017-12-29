package demo;

class NewThread implements Runnable{
	String name;
	Thread t;
	NewThread(String threadname){
		name = threadname;
		t = new Thread(this.name);
		System.out.println("New thread:" + t);
		t.start();
	}
}

public void run() {
	try {
		for(int i = 5; i > 0; i--) {
			System.out.println(name + ":" + i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e) {
		System.out.println(name + "interrupted");
	}
	System.out.println(name + "exiting");
}

public class IsAlive {
	public static void main(String[] args) {
		NewThread ob1 = new NewThread("one");
		NewThread ob2 = new NewThread("two");
		NewThread ob3 = new NewThread("three");
		
		System.out.println("Thread One is alive: " + ob1.t.isAlive());
		System.out.println("Thread Two is alive: " + ob2.t.isAlive());
		System.out.println("Thread Three is alive: " + ob3.t.isAlive());
		
		try {
			System.out.println("Wating for threads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Thread One is alive: "+ ob1.t.isAlive());
		System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
		System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
		System.out.println("Main thread exting");
	}
}