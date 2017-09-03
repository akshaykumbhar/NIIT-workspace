import java.util.*;
public class A {
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		str=str.trim();
		String newstr= "";
		char x;
		for(int i=0;i<str.length();i++)
		{
			x=str.charAt(i);
			if( x != ' ')
			{
				newstr= newstr + str.charAt(i);
			}
		}
		System.out.println("new String: "+newstr);
	}

}
