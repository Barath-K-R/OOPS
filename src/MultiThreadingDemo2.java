 
class Table{
	synchronized void print(int n) {
		for(int i=0;i<5;++i)
		{
			System.out.println(i*n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadingDemo2 {

	public static void main(String[] args) {
		Table t=new Table();
		
		
		Thread t1=new Thread() {
			public void run() {
			for(int i=0;i<5;++i)
				t.print(5);
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				t.print(4);
			}
		};
		
		t1.start();
		t2.start();
	}
}
