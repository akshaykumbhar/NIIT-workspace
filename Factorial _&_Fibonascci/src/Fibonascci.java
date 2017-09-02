import java.util.*;
public class Fibonascci {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :=");
		int num =sc.nextInt();
		int a=1,b=1;
		
		System.out.print(a);
		if(num>=2)
		{
		System.out.print(" "+b);
		
		int c;
		while(num>2)
		{
			num--;
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		}
	}

}