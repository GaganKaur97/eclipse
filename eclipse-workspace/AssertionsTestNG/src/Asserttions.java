


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	public class Asserttions {
		WebDriver driver;
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		@BeforeTest
		public void browserLaunch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gagan\\eclipse-workspace\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/");
			String actualTitle = driver.getTitle();
			String expectedTitle = "The Internet";
			Assert.assertEquals(actualTitle, expectedTitle);
		}

		@Test
		public void TestLogin() {
			driver.findElement(By.linkText("Form Authentication")).click();
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.className("radius")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed());

		}

		@AfterTest
		public void Close() {
			driver.close();
		}
	
}
}
