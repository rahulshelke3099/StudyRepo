
public class Operation {

	public String swap(int num1,int num2)
	{
		int temp = num1;
		num1 = num2;
		num2= temp;
		//System.out.println("num1 = "+num1);
		return ""+num1+""+num2;
	}
	public String swap(String str1, String str2)
	{
		String temp = null;
		temp=str1;
		str1=str2;
		str2=temp;
		return str1+str2;
	}
}
