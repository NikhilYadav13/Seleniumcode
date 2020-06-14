package first1;

public class Grandparent {
	public Grandparent ()
	{
		System.out.println("This is grandparent constructor");
	}
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(" Sum of intergers "+c);
		return c;
	}

}
