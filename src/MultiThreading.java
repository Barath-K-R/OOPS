/*Instead of this we can also write anonymous class
 * 
 * 
class Book implements Runnable{
	public void run() {
		for(int i=0;i<5;++i)
		System.out.println("updating database");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
*/
class Num extends Thread{
	public void run() {
		for(int j=0;j<5;++j)
		{
			System.out.println(j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//we can also use lambda expression for 
		Num n=new Num();
		Runnable b=()->{
			for(int i=0;i<5;++i)
			{
				System.out.println("update");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1=new Thread(b);
		
		//setpriority
		t1.setPriority(Thread.MAX_PRIORITY);
		
		//getpriority
		System.out.println("priority="+t1.getPriority());
		
		//setname and getname
		t1.setName("book1");
		System.out.println(t1.getName());
		
		//start method
		n.start(); //thread 
		t1.start();
		
		//isalive() method
		if(n.isAlive())
			System.out.println("still exxecuting");
		else
			System.out.println("thread is dead");
		
		//join() method
		n.join();
		t1.join();
		
		System.out.println("bye");
		

	}

}
