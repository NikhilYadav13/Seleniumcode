package first1;

public class Asn3 {
	public void m1()
	{
		this.m4(12, 34, 44);
		System.out.println("default method");
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("one parameterized method");
	}
	public void m3(int a,int b)
	{
		this.m5(2,12, 31, 21);
		System.out.println("two parameterized method");
	}
	public void m4(int a,int b,int c)
	{
		System.out.println("three parameterized method");
	}
	public void m5(int a,int b,int c,int d)
	{
		this.m2(8);
		System.out.println("four parameterized method");
	}

	public static void main(String[] args) {
		
		Asn3 obj=new Asn3();
		obj.m3(22,12);

	}

}
