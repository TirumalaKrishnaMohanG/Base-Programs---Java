import java.util.*;

class prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= n/2; i++)
		{
			if (n % i == 0)
			{
				flag = true;
				break;
			}

		}

		if(!flag)
		{
			System.out.println(n+" is a prime");
		}
		else
		{
			System.out.println(n+" is not a prime");
		}
	}
}