// Accept number from user and display that number of * on screen.
// Input : 4
// Output : *   *   *   *  
import java.util.*;

class Program4
{
	public static void main(String arg[])
	{
		int iNo;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number");
		iNo=sobj.nextInt();

		Display(iNo);
	}

	public static void Display(int iValue)
	{
		for(int iCnt=0;iCnt<iValue;iCnt++)
		{
			System.out.println("*");
		}
	}

}