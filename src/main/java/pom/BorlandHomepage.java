package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BorlandHomepage {
	WebDriver driver;
	@FindBy(name="bSubmit")
	public WebElement btnEnterGMO;
	public BorlandHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
}
