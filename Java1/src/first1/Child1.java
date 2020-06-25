package first1;

public class Child1 extends Parent1 {
	public Child1()
	{
		super();
		System.out.println("Child default constructor");
	}
	public Child1(int a)
	{
		this(22,21,12);
		System.out.println("Child One parametrized constructor");
	}
	public Child1(int a,int b)
	{
		this(31);
		System.out.println("Child two parametrized constructor");
	}
	public Child1(int a,int b,int c)
	{
		this();
		System.out.println("Child three parametrized constructor");
	}
	public static void main(String[] args) {
		Child1 obj =new Child1(12,13);
	}

}
   
