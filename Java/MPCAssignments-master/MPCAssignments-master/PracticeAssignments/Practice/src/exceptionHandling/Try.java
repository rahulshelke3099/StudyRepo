package exceptionHandling;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class TurkeyGate implements AutoCloseable{

	@Override
	public void close(){
		System.out.println("In turkey Gate");	
	}
	
}

class TurkeyDoor implements AutoCloseable{

	@Override
	public void close() throws Exception{
		System.out.println("In turkey Door");	
	}
	
}

class TurkeyWindow implements AutoCloseable
{

	@Override
	public void close() throws IllegalStateException
	{
		System.out.println("In turkey window");
	}
	
}
class MyException extends Exception
{
	String message;
	public MyException(String message) {
		super(message);
		this.message=message;
	}
	public String getMessage()
	{
		return this.message;
		
	}
}
public class Try {

	public static void main(String[] args) throws MyException{
		
//		try(TurkeyGate turkeyGate = new TurkeyGate())
//		{
//			System.out.println("main gate");
////			throw new RuntimeException();
//			throw new IllegalStateException();
//
//		}
////		try(TurkeyDoor turkeyDoor = new TurkeyDoor())
//		{
//			System.out.println("main door");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		try(TurkeyWindow turkeyWindow = new TurkeyWindow())
//		{
//			System.out.println("main window");
//		}
//		throw new IllegalStateException();
		
//		try{
//		
//		int age = 100;
//		if(!(age<18))
//		{
//			throw new AssertionError("Age is greater than 18", null);
//		}
//		
//		//assert age<18 : "Age is greater than 18";
//		System.out.println(age);
//		}catch(AssertionError e)
//		{
//			System.err.println(e.getMessage());
//		}
//		
//		System.out.println("hello");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try(Scanner scanner= new Scanner(System.in)){
			LocalDate.parse(scanner.nextLine(),formatter);
		}catch (DateTimeException e) {
			try{
				throw new MyException("Not Parsed");
			}catch(MyException e1)
			{
				System.out.println(e1.getMessage());
			}
		}
	}
}
