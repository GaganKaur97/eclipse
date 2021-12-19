package HeroAppTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String args[]) {
	WebDriver driver = null;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gagan\\eclipse-workspace\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		//driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
	//	driver.findElement(By.name("frame-bottom")).click();
		
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//	driver.switchTo().frame(driver.findElements("By.class(tox-throbber")).click();
			
		
	
	//driver.switchTo().frame("frame-bottom");
	/*
	 * driver.switchTo().frame(0); 
	 * driver.switchTo().frame("frame-right");
	 */
		
}

}