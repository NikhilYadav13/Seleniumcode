package first1;

public class Constrt {
		
	public Constrt()
	{
		this(41,43,44);
		System.out.println("This is default constructor");
	}
	public Constrt(int a)
	
	{
		this();
		System.out.println("This is one parameterized constructor");
	}
	public Constrt(int a, int b)
	{
		this(31);
		System.out.println("This is two parameterized constructor");
	}
	public Constrt(int a, int b,int c)
	{
		System.out.println("This is Three parameterized constructor");
	}

	public static void main(String[] args) {
		Constrt c =new Constrt(22,12);
		
		
		

	}

}
