import java.util.*;

class Largestnumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value ");
		float firstValue = scanner.nextFloat();
		System.out.println("Enter the second value ");
		float secondValue = scanner.nextFloat();
		System.out.println("Enter the third value ");
		float thirdValue = scanner.nextFloat();
		if (firstValue>secondValue && firstValue>thirdValue)
		{
			System.out.println("The largest values is "+firstValue);
		}
		else if (secondValue>thirdValue && secondValue>firstValue)
		{
			System.out.println("The largest values is "+secondValue);	
		}
		else
		{
			System.out.println("The largest values is "+thirdValue);
		}
	}
}