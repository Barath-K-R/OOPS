	

abstract class Member{
	protected String name;//protected-subclasses can use the variable
	//private-it can only used in the same class
	abstract void welcomemessage();
	public Member(String name) {
		this.name=name;
	}
	
	public  String getname() {
		return this.name;
	}
}

class Student extends Member{
	public Student(String name) {
		super(name);
		
	}

	public void welcomemessage() {
		System.out.println("Hello student");
	}
	
	
}

class Teacher extends Member{
	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void welcomemessage() {
		System.out.println("Hello Teacher");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t=new Teacher("ramana");
		Student s=new Student("barath");
		
		//if we want to store all students,teachers in an array we can't because both are different 
		//objects. If we declare array as member object array we can store all class object that
		//inherits the member class. This is where polymorphism is used
		Member[] m=new Member[3];
		m[0]=new Student("barath");
		m[1]=new Teacher("ramana");
		m[2]=new Student("arun");
		
		
		for(Member mem:m)
			mem.welcomemessage();
		
		System.out.println(m[0].getname());
		

	}

}
