
class cycle{
	 void display() {
		System.out.println("i am a bicycle");
	}
}
/*
class tricycle extends cycle{
	void display() {
		System.out.println("i am a tricycle");
	}
}  
I want another class just to override the display method to display tricycle
for that we can use ANONYMOUS CLASS	
*/
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can just create cycle object and overide this method as anonymous class
		cycle b1=new cycle() {
			void display() {
				System.out.println("i am a tricycle");
			}
		};
		cycle b2=new cycle();
		b1.display();
		b2.display();
		

	}

}
