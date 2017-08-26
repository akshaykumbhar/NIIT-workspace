
public class Manager {
	public static void main(String arg[])
	{
		System.out.println("-------Student Detail-------");
		Student st = new Student();
		st.Name();
		st.Address();
		st.Phone_no();
		System.out.println("-------Teacher Detail-------");
		Teacher t = new Teacher();
		t.Name();
		t.Address();
		t.Phone_no();
		System.out.println("-------School Detail-------");
		School sc = new School();
		sc.Name();
		sc.Address();
		sc.Phone_no();
	}

}
