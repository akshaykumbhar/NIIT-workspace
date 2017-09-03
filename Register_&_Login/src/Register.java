
import java.util.*;
import java.io.*;

public class Register {
	String fname,lname,uname,pass;
	String age;
	
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Register Form \n---------------------------");
		System.out.println("Enter First name");
		this.fname = sc.nextLine();
		System.out.println("Enter last name");
		this.lname = sc.nextLine();
		System.out.println("Enter age");
		this.age= sc.nextLine();
		System.out.println("Enter username");
		this.uname=sc.nextLine();
		System.out.println("Enter Password");
		this.pass=sc.nextLine();
	}
	
	void Display()
	{
		System.out.println("Fist name: "+this.fname);
		System.out.println("last name: "+this.lname);
		System.out.println("Age: "+this.age);
		System.out.println("Username: "+this.uname);
		System.out.println("Password: "+this.pass);
	}
	
}
