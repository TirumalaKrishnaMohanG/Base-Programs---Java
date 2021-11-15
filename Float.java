import java.util.*;

class Float
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value: ");
		float a = sc.nextFloat();
		System.out.println("Enter the B value: ");
		float b = sc.nextFloat();
		float finVal = a + b;
		System.out.println("Total is "+finVal);
	}
}