import java.util.*;

class isalpha
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		char character = sc.next().charAt(0);
		boolean testChar = Character.isLetter(character);
		if (testChar)
		{
			System.out.println(character+" is a character");
		}
		else
		{
			System.out.println(character+" is not a character");
		}
	}
}