package HeroAppTest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestCase {

	public static void main(String args[]) {

		// public class class1 implement WebDriver{}
Scanner scan = new Scanner (System.in);
String browser = scan.next();
WebDriver driver = null;
System.out.println("enter a browser");
if(browser.equals ("Chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\gagan\\eclipse-workspace\\chromedriver.exe");
	
	WebDriver chromedriver =new ChromeDriver();
	chromedriver.navigate().to("https://the-internet.herokuapp.com/");
} else if(browser.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\gagan\\eclipse-workspace\\geckodriver.exe");
	
	WebDriver chromedriver =new ChromeDriver();
	chromedriver.navigate().to("https://the-internet.herokuapp.com/");
}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gagan\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver chromedriver =new ChromeDriver();
		chromedriver.navigate().to("https://the-internet.herokuapp.com/");
		
		
		
		// chromedriver.get("https://the-internet.herokuapp.com/");
		 //chromedriver.navigate().refresh();
		// chromedriver.navigate().back();
		// chromedriver.navigate().forward();
		// System.out.println("Page Title:" + chromedriver.getTitle());
		
		 //verify if webpage launch is successful
	/*	 if(chromedriver.getTitle().equals("The Internet")) {
			 System.out.println("application launched successfully");
		 }else {
		 System.out.println("application not launched");
		 }
		 */
		// chromedriver.getCurrentUrl();
		// System.out.println("Page URL:" + chromedriver.getCurrentUrl());
		// System.out.println("Page Source:" + chromedriver.getPageSource());
		 
		 chromedriver.findElement(By.linkText("Form Authentication")).click();
		 
		 //verify if form authentication is launched 
		/* if(chromedriver.findElement(By.className("radius")).isDisplayed()){
			 System.out.println("if login page is displayed navigation is dispalyed");
		 } else {
			 System.out.println("navigation is failed ");
		 }*/
		 
		 chromedriver.findElement(By.id("username")).sendKeys("tomsmith");
		 chromedriver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		 chromedriver.findElement(By.className("radius")).click();
		 
		 //verify secondary radius logout button 
	/*	 if(chromedriver.findElement(By.id("flash")).isDisplayed()){
			 System.out.println("login was successful");
		 } else {
			 System.out.println("login failed ");
		 }*/
		// chromedriver.quit();
		// chromedriver.close();
	}

}
