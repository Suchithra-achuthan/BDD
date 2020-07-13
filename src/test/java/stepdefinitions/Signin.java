package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.HomePage;
import pom.SignInDetails;

public class Signin {
	WebDriver driver;
	@Given("^I launched the Home page$")
	public void lunchhomepage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
	}
	@When("^I clicked on Sign-in button$")
	public void ClickSignIn()
	{
//		driver.findElement(By.id("btn1")).click();
		HomePage obj1 = new HomePage(driver);
		obj1.btnSignIn.click();
	}
	@And ("^I enter Email as \"(.*)\"$")
	public void EnterEmail(String Email)
	{
//		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(Email);
		SignInDetails obj2 = new SignInDetails(driver);
		obj2.txtEmail.sendKeys(Email);
	
	}
	@And ("^I enter Password as \"(.*)\"$")
	public void EnterPassword(String Password)
	{
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		SignInDetails obj2 = new SignInDetails(driver);
		obj2.txtPassword.sendKeys(Password);
	}
	@And ("^I click on Enter button$")
	public void ClickEnter()
	{
//		driver.findElement(By.id("enterbtn")).click();
		SignInDetails obj2 = new SignInDetails(driver);
		obj2.btnEnter.click();
	}
	@Then ("^I verify error message is displayed as \"(.*)\"$")
	public void CheckError(String Error)
	{
		SignInDetails obj2 = new SignInDetails(driver);
		if(obj2.msgerror.getText().equals(Error))
		{
			System.out.println("Verification pass");
		}
		else
		{
			Assert.fail("Verification Fail");
		}
		
	}
}