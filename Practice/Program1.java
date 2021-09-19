import java.util.*;

class Program1
{
	public static int Addition(int no1,int no2)
   {
   		//System.out.println("inside addition");
   		return no1+no2;
   }
	
	public static void main(String arg[])
	{
		int iValue1=0,iValue2=0,iRet=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter First numbere");
		iValue1=sobj.nextInt();

		System.out.println("Enter second number");
		iValue2=sobj.nextInt();


		iRet=Addition(iValue1,iValue2);
		System.out.println("addition "+iRet);
	}

}