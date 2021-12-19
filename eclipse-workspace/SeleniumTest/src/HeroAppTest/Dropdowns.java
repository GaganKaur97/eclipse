package HeroAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	private WebDriver driver ;
		// TODO Auto-generated constructor stub
	private By dropdown = By.id("Dropdown");
	
	public Dropdowns(WebDriver driver) {
		this.driver = driver;
	}
	private Select findDropElement() {
		return new Select(driver.findElement(dropdown));
		
	}
	
	public void selectFromDropdown(String option) {
		findDropElement().selectByVisibleText(option);
		
	}

}
