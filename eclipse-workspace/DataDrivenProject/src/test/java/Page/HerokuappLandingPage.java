package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HerokuappLandingPage {
WebDriver driver;

public  HerokuappLandingPage(WebDriver driver) {
	this.driver = driver;
}

//locatora
@FindBy(how= How.XPATH,using = "//*[@id=\"content\"]/ul/li[21]/a")WebElement formauth;
	public void clickFormAuthLink() {
		// TODO Auto-generated method stub
		formauth.click();
	}
	



}
