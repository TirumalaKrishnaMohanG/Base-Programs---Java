import  java.util.*;

class Ascii
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = sc.next().charAt(0);
		int d = c;
		System.out.println("The ascii character "+c+" and ascii value "+d);
	}
}