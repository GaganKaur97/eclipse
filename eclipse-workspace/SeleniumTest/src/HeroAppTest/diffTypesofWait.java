package HeroAppTest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class diffTypesofWait {
	public static void main(String args[]) {
	WebDriver driver = null;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gagan\\eclipse-workspace\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();
		//Implicit wait 
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//Explicit wait 
		
		  WebDriverWait wait= new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText( "Dropdown"))); 
		  driver.findElement(By.linkText("Dropdown")).click(); 
		  Dropdowns dd= new Dropdowns(driver); 
		  dd.selectFromDropdown("Option 1");
		 
		
		
		//Fluent wait
		/*
		 * FluentWait fwait = new FluentWait(driver);
		 * fwait.withTimeout(Duration.ofSeconds(10));
		 */
		}}
