import java.util.*;

class Command
{
	public static void main(String arg[])
	{
		System.out.println("Toatal number of arguments are :"+arg.length);

		System.out.println("Command line arguments are :");
		
		for(int i=0;i<arg.length;i++)
		{
			System.out.println(arg[i]);
		}
		
	}
}

//compile -> javac Command.java

//Run -> java Command.java Tanmay 21 Demo 10

//output -> Toatal number of arguments are:4
//	    Command line arguments are :
//	    Tanmay 
//	    21 
//          Demo 
//          10
