package test;

public class ThreadTest2{

	public static void main(String[] args){
		C c = new C();
		Thread t1 = new Thread(new A(c));
		t1.setName("t1");
		Thread t2 = new Thread(new B(c));
		t2.setName("t2");
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
	}
	
	
}

class C{
	public synchronized void ood(){
		while(true){
			try {
				System.out.println(Thread.currentThread().getName() + " ----> A" );
				this.notifyAll();
				Thread.sleep(1000);
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void even(){
		while(true){
			try {
				System.out.println(Thread.currentThread().getName() + " ----> B");
				this.notifyAll();
				Thread.sleep(1000);
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class A implements Runnable{
	C c = new C();
	A(C c){
		this.c = c;
	}
	public void run(){
		c.ood();
	}
}

class B implements Runnable{
	C c = new C();
	B(C c){
		this.c = c;
	}
	public void run(){
		c.even();
	}
}


