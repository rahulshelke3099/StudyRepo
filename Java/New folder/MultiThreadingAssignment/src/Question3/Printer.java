package Question3;

public class Printer implements Runnable{

	Storage s;
	public Printer(Storage s)
	{
		this.s=s;
	}
	@Override
	public void run() {
		for(int i = 0; i< 100; i++)
		{
			System.out.println(s.arr[i]);
		}
	}

}
