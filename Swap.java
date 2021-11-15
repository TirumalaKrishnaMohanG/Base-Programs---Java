import java.util.*;

class Swap
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int firstValue = scanner.nextInt();
		System.out.println("Enter the second value :");
		int secondValue = scanner.nextInt();
		// Swap two values & positions
		int temp = firstValue;
		firstValue = secondValue;
		secondValue = temp;
		System.out.println("Swaped the first value :"+firstValue);
		System.out.println("Swaped the second value :"+secondValue);
	}
}