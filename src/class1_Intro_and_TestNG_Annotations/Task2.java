package class1_Intro_and_TestNG_Annotations;

import org.testng.annotations.*;

public class Task2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after Class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This is before Class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Class");
	}

	@Test
	public void test1() {
		System.out.println("This is test1");
	}

	@Test
	public void test2() {
		System.out.println("This is test 2");
	}

	@Test
	public void test3() {
		System.out.println("This is test 2");
	}
}
