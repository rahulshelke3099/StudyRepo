import java.util.Date;
import java.util.Scanner;


public class java {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int start= sc.nextInt()+1111;
	int end = sc.nextInt()+1111;
	if(end<start)
		end=end+2400;
	
	int min = (end%100)-(start%100);
	int hours = (end/100)-(start/100);
	
	if(min<0)
	{
		min+=60;
		hours--;
	}
	
//	int rem1=0;
//		rem1 = start %100;
//		start =  start/100;
//	
//	
//	int rem2= end%100;
//	end= end/100;
//	
//	end-=start;
//	rem2-=rem1;
//	if(rem2<0)
//	{
//		rem2+=60;
//		end--;
//	}
	
	System.out.println(hours+"   "+min);
	sc.close();

}
}

