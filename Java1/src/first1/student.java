package first1;

public class student {
	
	int roll_no;
	int age;
	public void m1() 
	{
		System.out.println("I am deepak");
	}
	public void m2() 
	{
		System.out.println("Automation is easy");
	}

	public static void main(String[] args) {
		student deepak = new student();
		deepak.m1();
		deepak.m2();
		deepak.age=28;
		System.out.println("AGE is 28");
		deepak.roll_no=20;
		System.out.println("roll number is 20");
		
		
		

	}

}
