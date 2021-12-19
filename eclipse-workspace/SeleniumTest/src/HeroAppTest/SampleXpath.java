package HeroAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {
	public static void main (String args[]) {
	WebDriver driver = null;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\gagan\\eclipse-workspace\\chromedriver.exe");
	
	WebDriver chromedriver =new ChromeDriver();
	chromedriver.navigate().to("https://the-internet.herokuapp.com/");
	 chromedriver.findElement(By.linkText("Form Authentication")).click();
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();
	if(driver.findElement(By.xpath("//*[@id='flash'")).getText().contains("Your username is invalid!")){
		System.out.println("login is successful");
	}else {
		System.out.println("login not successful");
	}
}
}