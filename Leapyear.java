import java.util.*;

class Leapyear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if (number % 4 == 0)
		{
			if (number % 100 == 0)
			{
				if (number % 400 == 0)
				{
					System.out.println(number+" is leap year");
				}
				else
				{
					System.out.println(number+" is not leap year");
				}

			}
			else
			{
				System.out.println(number+" is leap year");
			}
		}
		else
		{
			System.out.println(number+" is not leap year");
		}
	}
}