import java.util.*;

class Factorial
{
	public static void main(String[] args)
	{
		int nummber = 1;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		nummber = sc.nextInt();
		for (int i = 1; i < nummber; ++i)
		{
			count = count * i;
		}
		System.out.println(count);
	}
}