import java.util.Scanner;


public class Jie{
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum=0,t;
		for(int i=1;i<=number;i++)
		{
			t=1;
			for(int j=1;j<=i;j++)
			{
				t*=j;
			}
			sum +=t;
		}
		System.out.println(sum);
	}
	
}
