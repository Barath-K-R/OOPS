import java.util.Arrays;

class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void raisesalary(double percent) {
		salary=salary+salary*(percent/100);
	}

	
	//overiding the compareto method in comparable interface to sort the objects
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.salary==o.salary)
		return 0;
		else if(this.salary<o.salary) {
			return -1;
		}
		else
			return 1;
	}
}

class Manager extends Employee {
	private double bonus;
	
	public Manager(String n,double s,double b) {
		super(n,s);
		bonus=b;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//method overriding
	public double getSalary() {
		return super.getSalary()+bonus;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		 
		Employee e1=new Employee("ram",35000);
		e1.raisesalary(10);
		System.out.println(e1.getSalary());
		
		Manager m1=new Manager("deepak",40000,0.0);
		m1.setBonus(20000);
		System.out.println(m1.getSalary());
		
		Employee e2=new Manager("farish",80000,2000);//polymorphism
		
		
		
		Employee []e=new Employee[4];
		e[0]=new Employee("barath",30000);
		e[1]=new Employee("arun",35000);
		e[2]=new Manager("dinesh",40000,2000.0);
		e[3]=new Manager("Bhuvi",35000,3000);
		
		Manager m2=null,m3=null;
		if(e[2] instanceof Manager)
			m2=(Manager)e[2];
		
		//sorting the array of employee objects based on salary by implementing the comparable interface
		Arrays.sort(e);
		
		for(Employee emp:e)                     //dynamic binding
			System.out.println(emp.getName()+" "+emp.getSalary());
		
		System.out.println(m2.getSalary());

	}

}
