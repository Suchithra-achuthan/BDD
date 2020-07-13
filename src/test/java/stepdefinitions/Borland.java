package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.BorlandHomepage;
import pom.CatalogPage;
import pom.PlaceOrderPage;

public class Borland {
	WebDriver driver;
	@Given ("^I launched the Borland Home Page$")
	public void OpenHomepage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbalasub\\Desktop\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
		
	}
	@When ("^I clicked on Enter GMO button$")
	public void ClickGMO()
	{
		BorlandHomepage obj1 = new BorlandHomepage(driver);
		obj1.btnEnterGMO.click();
		
	}
	@And ("^I enter Quanties as \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void EnterQty(String Tent, String BP, String Glasses, String Socks, String Boots, String Shorts)
	{
		CatalogPage obj2 = new CatalogPage(driver);
		obj2.TentQty.sendKeys(Tent);
		obj2.BackpackQty.sendKeys(BP);
		obj2.GlassesQty.sendKeys(Glasses);
		obj2.SocksQty.sendKeys(Socks);
		obj2.BootsQty.sendKeys(Boots);
		obj2.ShortsQty.sendKeys(Shorts);	
	}
	@And ("^I click on Place an Order button$")
	public void ClickPlaceOrder()
	{
		CatalogPage obj2 = new CatalogPage(driver);
		obj2.btnPlaceOrder.click();
	}
	@Then ("^I verify Place Order page is open$")
	public void Verifyheader()
	{
		PlaceOrderPage obj3 = new PlaceOrderPage(driver);
		if (obj3.PageHeading.getText().equals("Place Order"))
		{
			System.out.println("Verification Pass");
		}
		else
		{
			Assert.fail("Verification Fail");
		}
	}

}
