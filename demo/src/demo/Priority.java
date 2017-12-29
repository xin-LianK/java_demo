package demo;

class clicker implements Runnable{
	int click = 0;
	Thread t;
	private volatile boolean running = true;
	public clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}

	public void run() {
		while (running) {
			click ++;
		}
	}
	public void stop() {
		running = false;
	}
	public void start() {
		t.start();
	}
}
public class Priority {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		clicker hi = new clicker(Thread.NORM_PRIORITY + 2);
		clicker lo = new clicker(Thread.NORM_PRIORITY - 2);
		lo.start();
		hi.start();
		
		try {
			hi.t.join();
			lo.t.join();
		}catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		System.out.println("Low Priority thread:" + lo.click);
		System.out.println("Low Priority thread:" + hi.click);
	}
}
