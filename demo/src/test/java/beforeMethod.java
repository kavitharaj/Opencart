import org.testng.annotations.Test;

public class beforeMethod{
	@Test
void sum()
{
	int a=10;
	int b=20;
	System.out.println("sum"+ (a+b));
}
	@Test
	void sub()
	{
		int a=10;
		int b=20;
		System.out.println("sub"+(b-a));
	}
	
}