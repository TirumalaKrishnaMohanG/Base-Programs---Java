import java.util.*;

class Add
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value: ");
		int a = sc.nextInt();
		System.out.println("Enter the B value: ");
		int b = sc.nextInt();
		int finVal = a + b;
		System.out.println("Total is "+finVal);
	}
}