import java.util.*;

class Vowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char value = sc.next().charAt(0);
		if ( value == 'a' || value == 'A' || value == 'e'  || value == 'E' || value == 'o' || value == 'O' || value == 'I' || value == 'i' || value == 'u' || value == 'U')
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Consonents");	
		}
	}
}