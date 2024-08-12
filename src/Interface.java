//interface containing only one abstract method is called Functional Interface
//or Single Abstract Method Interface or SAM Interface
interface vehicle{
	int MAXSPEED=90;//in default all the variable are public static and final
	void ride();//in default all the methods are public abstract	
	
	//in latest java version we can define the methods by default
	default void display() {    
		System.out.println("displaying");
	}
}

class car implements vehicle{
	public void ride() {
		System.out.println("car riding");
	}
	
	//we can override the default method in interface
	public void display() {
		System.out.println("displaying car");
	}
}

class bike implements vehicle{
	public void ride() {
		System.out.println("bike riding");
	}
	
	//we can override the default method in interface
		public void display() {
			System.out.println("displaying bike");
		}
}

class mechanic{
	void check(vehicle v) {
		
		v.ride();
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		bike b=new bike();
		mechanic m1=new mechanic();
		
		m1.check(b);
		m1.check(c);
		vehicle v1=c;
        c.display();
        
        vehicle v2=new vehicle() {
        		   public void display() {
        			   System.out.println("displaying anonymous vechicle");
        		   }

				@Override
				 public void ride() {
					System.out.println("riding anonymous vehicle");
				}
	      };
	      v2.display();
	      v2.ride();
	      //if interface is functional interface then we can use lambda expression
	      vehicle v3=()->System.out.println("riding lambda vechicle");
	      
	     
		
		

	}

}
