package dataDrivenFramework;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.HerokuappLandingPage;
import Page.HerokuappLoginPage;

public class DataDriven extends TestBase {

	@Test
	public void init() throws Exception{
		HerokuappLandingPage landingpage = PageFactory.initElements(driver, HerokuappLandingPage.class);
		
		landingpage.clickFormAuthLink();
		HerokuappLoginPage loginpage =PageFactory.initElements(driver, HerokuappLoginPage.class);
		loginpage.setUsrName("testing");
		loginpage.setPassword("testing");
		loginpage.clickLoginButton();
	}
}
