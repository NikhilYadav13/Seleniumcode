package first1;

public class Parent1 {
	public Parent1()
	{
		this(22,31);
		System.out.println("Parent default constructor");
	}
	public Parent1(int a)
	{
		this(1,2,3);
		System.out.println("Parent One Parametrized constructor");
	}
	public Parent1(int a, int b)
	{
		this(1);
		System.out.println("Parent two parameterized constructor");
	}
	public Parent1(int a, int b,int c)
	{
		System.out.println("Parent three parameterized constructor");
	}

}
