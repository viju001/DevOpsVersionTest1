import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UserValidationTest {
	@BeforeClass
	public void m1()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void m2()
	{
		System.out.println("After Class");
	}
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.userValidation("",""));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.userValidation("Srinu", "Srinu@12345"));
	}
	@Test
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.userValidation("srinu", "srinu@12345"));
	}
	@Test
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.userValidation("SRINU", "SRINU@12345"));
	}
	@Test
	public void testCase5()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.userValidation("vamc", "1234"));
	}
}
