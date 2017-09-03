import java.util.*;
public class Login extends Register
{	
	Scanner sc =new Scanner(System.in);
	void login()
	{	
		
		System.out.println("\nLogin \n-----------------------------");
		System.out.println("Enter username:");
		String input1 = sc.nextLine();
		System.out.println("Enter password");
		String input2=sc.nextLine();
		if((input1.equals(uname)) && (input2.equals(pass)))
		{
			System.out.println("Login is successfull");
			this.Display();
		}
		else
		{
			System.out.println("Incorrect username or password");
		}
		
	}
	public static void main (String args[] )
	{	
		Scanner sc =new Scanner(System.in);
		Login l = new Login(); 
		char x='y';
		do
		{	
			l.getdata();
			l.login();
			System.out.println("Do you want to contiune?(y/n)");
			x= sc.nextLine().charAt(0);
		}while(x =='y');
	}

}
