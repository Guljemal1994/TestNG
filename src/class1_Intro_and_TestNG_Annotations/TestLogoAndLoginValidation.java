package class1_Intro_and_TestNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class TestLogoAndLoginValidation extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {
		setUp();
		
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void titleValidation() throws InterruptedException {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("titleValidation passed");
		} else {
			System.out.println("titleValidation failed");
		}

		Thread.sleep(3000);
	}

	@Test
	public void logoValidation() throws InterruptedException {
		String logoPath = "//div[@id='divLogo']/img";
		WebElement logo = driver.findElement(By.xpath(logoPath));
		boolean isDis = logo.isDisplayed();
		if (isDis) {
			System.out.println("logoValidation passed");
		} else {
			System.out.println("logoValidation faild");
		}
		Thread.sleep(3000);
	}

	@Test
	public void validLogin() throws InterruptedException {

		WebElement username = driver.findElement(By.id("txtUsername"));
		//sendText(username, "Admin");oneway
		sendText(username, ConfigsReader.getProperty("username"));//2nd way
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		click(driver.findElement(By.id("btnLogin")));
		Thread.sleep(3000);
	}
	
}
