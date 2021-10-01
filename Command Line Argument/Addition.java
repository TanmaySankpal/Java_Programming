import java.util.*;

class Addition
{
	public static void main(String arg[])
	{
		if(arg.length==2)
		{
			int no1=Integer.parseInt(arg[0]);
			int no2=Integer.parseInt(arg[1]);
			int ans=no1+no2;
			System.out.println("Addition :"+ans);
		}
		
	}
}

//Integer.parseInt -> is a string to integer conversion
//compile -> javac Addition.java
//Run -> java Addition.java 21 10
//output -> Addition:31