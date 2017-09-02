import java.util.*;


class Factorial {

	int fact(int num)
	{
		if(num==0)
		{
			return 1;
		}
		
		else
		{
		return (num * fact(num-1));
		}
	}
	@SuppressWarnings("resource")
	public static void main (String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :=");
		num=sc.nextInt();
		Factorial f = new Factorial();
		int ans=f.fact(num);
		System.out.println("Factorial := "+ans);
			
	}
}
