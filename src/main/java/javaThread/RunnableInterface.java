package javaThread;

public class RunnableInterface implements Runnable {

	public void run() 
	{
		System.out.println("Application to be launched");
	}

	public static void main(String[] args) 
	{
		RunnableInterface ri = new RunnableInterface();

		Thread th = new Thread(ri);
		th.start();
	}

}
