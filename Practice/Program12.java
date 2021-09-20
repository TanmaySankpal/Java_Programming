//Accept number Print that number of times "Marvellous"
import java.util.*;
class Program12
{
	public static void main(String arg[])
	{
		int iNo=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number");
		iNo=sobj.nextInt();

		Display(iNo);
	}

	public static void Display(int iValue)
	{
		for(int iCnt=0;iCnt<iValue;iCnt++)
		{
			System.out.println("Marvellous");
		}
	}

}