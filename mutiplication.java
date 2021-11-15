import java.util.*;

class multiplication
{
	public static void main(String[] args)
	{
		int n,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for (int i = 1; i < 13; i++)
		{
			result = i*n;
			System.out.println(n+"*"+i+"="+result);
		}
	}
}