package class1_Intro_and_TestNG_Annotations;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public static void aTestOne() {//harplaryn gelisine gora run etyar
		System.out.println("Test 1");
	}
	@Test
	public static void cTestTwo() {
		System.out.println("Test 2");
	}
	@Test
	public static void bTestThree() {
		System.out.println("Test 3");
	}
}
