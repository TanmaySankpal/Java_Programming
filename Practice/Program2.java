import java.util.*;

class Program2
{
	public static void main(String arg[])
	{
		int x=0,y=0,z=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter first number");
		x=sobj.nextInt();

		System.out.println("Enter second number");
		y=sobj.nextInt();

		z=x+y;
		System.out.println("addition is "+z);

	}
}