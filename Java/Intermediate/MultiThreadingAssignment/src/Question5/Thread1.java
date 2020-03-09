package Question5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Thread1 implements Runnable {

	String name;
	public Thread1(String name)
	{
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("Current Thread = "+Thread.currentThread().getName());
		try (Scanner scanner = new Scanner( new File("poem.txt"), "UTF-8" )) {
		    String text = scanner.useDelimiter("\\A").next();
		    if(text.contains(name)){
		    	System.out.println("String "+name+" found by : "+Thread.currentThread().getName());		    	
		    }
		    else
		    {
		    	System.out.println("String "+name+" not found by : "+Thread.currentThread().getName());
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
