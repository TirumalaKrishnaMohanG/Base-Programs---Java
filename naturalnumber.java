import java.util.*;

class naturalnumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i < n; i++)
		{
			count = count+i;
		}
		System.out.println("The sum is "+count);
	}
}