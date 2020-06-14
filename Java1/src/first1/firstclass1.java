package first1;

public class firstclass1 {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum is"+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub is"+z);
		return z;
	}
	public void mul(int a1,int b1)
	{
		int c1;
		c1=a1*b1;
		System.out.println("Final result is"+c1);
		
	}
	public static void main(String[] args)
	{
		firstclass1 a =new firstclass1();
		int sum1=a.sum(10, 2);
		int sub1=a.sub(10, 2);
		a.mul(sum1,sub1);
		
		
	}
	

}
