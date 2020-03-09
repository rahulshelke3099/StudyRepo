import java.util.Scanner;


public class QuesFive {

	public static void main(String[] args) 
	{
		System.out.println("Enter the no. of rows : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		char game[][]=new char[r][r];
		char ch;
		System.out.println("Enter the elements row wise : ");
		
		// Taking Input
		for(int i =0; i<r; i++)
		{
			for(int j =0; j<r; j++)
			{
				ch = sc.next().charAt(0);
				if(ch == 'X' || ch == 'O')
				{
					game[i][j]=ch;
				}
				else
				{
					System.out.println("Invalid Character");
					System.out.println("Characters allowed are : 'X' or 'O' ");
					break;
				}
				
			}
		}
		
		for(int i =0; i<r; i++)
		{
			for(int j =0; j<r; j++)
			{
				System.out.print(game[i][j]+" ");
			}
			System.out.println();
			
		}
		
		//Traversing Horizontally
		int count=0;
		for(int i =0; i<r; i++)
		{
			count=0;
			for(int j =0; j<r-1; j++)
			{
				if(game[i][j]==game[i][j+1])
				{
					count++;
				}
			}
			if(count==r-1)
			{
				System.out.println(game[i][r-1]+ " : Wins");
				System.out.println("Horizontally");
				break;
			}
		}
		
		
		//Traversing Vertically
		int temp=0;
		for(int i =0; i<r; i++)
		{
			count=0;
			for(int j =0; j<r-1; j++)
			{
				if(game[j][i]==game[j+1][i])
				{
					count++;
					temp=j;
				}
			}
			if(count==r-1)
			{
				System.out.println(game[temp][r-1]+ " : Wins");
				System.out.println("Vertically");
				break;
			}
				
		}
		
		//Traversing Diagonally from 0,0
		count=0;
		for(int i=0; i<r-1; i++)
		{
			if(game[i][i]==game[i+1][i+1])
			{
				count++;
			}
		}
		if(count==r-1)
		{
			System.out.println(game[0][0]+" : Wins ");
			System.out.println("Diagonally 0,0");
		}
			
		
		
		//Traversing diagonally from 0,r-1
		count=0;
		int min=r-1;
		for(int i=0; i<r-1; i++)
		{
			if(game[i][min]==game[i+1][min-1])
			{
				count++;
				if(min==0)
					break;
				min--;
			}
				
		}
		if(count==r-1)
		{
			System.out.println(game[0][0]+" : Wins ");
			System.out.println("Diagonally 0,r-1");
		}
			
		
		sc.close();
		
	}

	}
