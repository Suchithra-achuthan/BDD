package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInDetails {
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='E mail']")
	public WebElement txtEmail;
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement txtPassword;
	@FindBy(id="enterbtn")
	public WebElement btnEnter;
	@FindBy(id="errormsg")
	public WebElement msgerror;
public SignInDetails(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(this.driver, this);
}

}
