
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class QuesFour {

	public static void main(String[] args) {
	
		Set<Character> duplicate = new HashSet<Character>();
		System.out.println("Enter a String :: ");
		String str = null;
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
		{
			str = reader.readLine();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Duplicate characters in the string are as follows :: ");
		System.out.print("[ ");
		for(int i = 0; i<str.length(); i++)
		{
			if(!duplicate.add(str.charAt(i)))
			{
				if(i<str.length()-1)
					System.out.print(str.charAt(i)+" , ");
				else
					System.out.print(str.charAt(i)+" ");
			}
		}
		System.out.print("]");
	}
}
