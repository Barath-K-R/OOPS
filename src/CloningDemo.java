
class Department implements Cloneable {
	int deptid;
	String name;
	public Department(int deptid, String name) {
		
		this.deptid = deptid;
		this.name = name;
	}
	
	void display() {
		System.out.println("deptid-"+deptid);
		System.out.println("deptname-"+name);
	}
	
	//have to override the clone method for cloning	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Professor implements Cloneable{
	int id;
	String name;
	Department dept;
	
	Professor(int id,String name,Department d) {
		this.id=id;
		this.name=name;
		this.dept=d;
	}
	
	void display() {
		System.out.println("Professor id="+id);
		System.out.println("Professor name="+name);
		dept.display();
	}
	
	protected Object clone() throws CloneNotSupportedException {
		//if we leave only with below line shallow copy will happen
		Professor p=(Professor)super.clone();
		//clone department for deep copys
		p.dept=(Department)dept.clone();
		return p;
	}
	
	
	
}
public class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Department d=new Department(1,"mechatronics");
		Professor p1=new Professor(1,"barath",d);
		Professor p2=(Professor)p1.clone();
		p1.dept.name="Mechanical";
		p1.display();
		System.out.println();
		p2.display();
		
		

	}

}
