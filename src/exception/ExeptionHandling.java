package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import exception.InsufficientAmountException;

public class ExeptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4,b=0;
		int c=0;
		int []arr=null;
		try {
		    arr[0]=2;	
			c=a/b;
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("null pointer exception");
		}
		
        catch(Exception e) {
        	System.out.println("exception");
        }
		finally{
			System.out.println("print no matter what");
		}
		
		
//		//filehandling exceptions
//		File f=new File("abc.txt");
//		
//		try {
//			FileReader reader=new FileReader(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		int i=0;
		//TRY WITH RESOURCE
		//try block will automatically execute Scanner.close()
		try(Scanner sc=new Scanner(System.in);){	
			i=sc.nextInt();
		}
		
		
		//custom exception
		double balance=500,withdraw=2000;
		try {
			
		     if(balance<withdraw)
		     {
			     throw new InsufficientAmountException(withdraw-balance);
		     }
		}
		catch(InsufficientAmountException e) {
			System.out.println("insufficient amount of "+e.amount);
		}
		System.out.println("end of the program");
		
	}

}
