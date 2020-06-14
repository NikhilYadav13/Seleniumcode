package first1;

public class Parent extends Grandparent{
	public Parent()
	{
		System.out.println("This is parent constructor");
	}
	public int sum(int a,float b)
	{
		int c , s;
		c=(int) b;
		s=a+c;
		
		System.out.println("sum of interger and float  "  +s);
		return s;
	}

}
