import java.util.*;

class fibonacci
{
	static int fib(int number)
	{
		if (number <= 1)
			return number;
		return fib(number-1)+fib(number-2);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number: ");	
		number =  sc.nextInt();
		System.out.println(fib(number));
	}
}