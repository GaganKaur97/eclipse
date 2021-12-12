package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HerokuappLoginPage {
WebDriver driver;
public  HerokuappLoginPage(WebDriver driver) {
	this.driver = driver;
}
//locators
@FindBy(how = How.ID, id= "username")WebElement usrname;
@FindBy(how = How.ID, id= "password")WebElement pwd;
@FindBy(how = How.XPATH, using= "//*[@id=\"login\"]/button/i")WebElement login;

	public void setUsrName(String str) {
		// TODO Auto-generated method stub
		usrname.sendKeys(str);
	}

	public void setPassword(String str) {
		// TODO Auto-generated method stub
		pwd.sendKeys(str);
	}

	public void clickLoginButton() {
		// TODO Auto-generated method stub
		login.click();
	}

}
