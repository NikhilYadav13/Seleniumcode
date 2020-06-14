package first1;

public class Arith {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is "+c);
		return c;
	
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub is "+z);
		return z;
	
	}
	public int mul(int a1,int b1)
	{
		int c1;
		c1=a1*b1;
		System.out.println("Sum is "+c1);
		return c1;
	
	}
	public void div(int m,int n)
	{
		int o;
		o=m/n;
		System.out.println("final result is "+o);
		
	
	}

	public static void main(String[] args) {
		Arith a = new Arith();
		int sum1=a.sum(10,2);
		int sub1 =a.sub(sum1, 2);
		int sum2 =a.sum(sub1, 2);
		int mul1 =a.mul(sum2, 2);
		a.div(mul1, 2);
		

	}

}
