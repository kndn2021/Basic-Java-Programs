package javaThread;

public class ThreadClass extends Thread {

	public void run()
	{
		System.out.println("Picture to be shown");
	}
	
	public static void main(String[] args) {

		ThreadClass th = new ThreadClass();
		th.start();
		
		MutliThread1 m1 = new MutliThread1();
		m1.start();
		
		MutliThread2 m2 = new MutliThread2();
		m2.start();
	}

}
