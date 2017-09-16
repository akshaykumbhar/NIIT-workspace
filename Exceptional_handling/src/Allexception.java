import java.util.*;
import java.lang.*;
import java.io.*;

class Myexception extends Exception
{
	void exception()
	{
		System.out.println("Enter valid age");
	}
}
class Allexception
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int num=sc.nextInt();
		try{
			if(num<=0)
			{
				throw new Myexception();
			}
		System.out.println("Your age is "+num);
		}
		catch(Myexception e)
		{
			e.exception();
		}
		finally{
			System.out.println("I am alway here");
		}
	}
}