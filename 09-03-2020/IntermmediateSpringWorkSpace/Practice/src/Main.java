import javax.management.RuntimeErrorException;


public class Main {

	public static int hello()
	{
		
		String s = null;
		if(s == null)
		{
			try{
				throw new RuntimeErrorException(new Error());
			}catch(RuntimeErrorException e)
			{
				System.out.println(e.getMessage());
				//return 0;
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		hello();
	}
}