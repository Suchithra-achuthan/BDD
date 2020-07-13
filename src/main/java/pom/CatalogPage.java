package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage {
	WebDriver driver;
	@FindBy(name= "QTY_TENTS")
	public WebElement TentQty;
	@FindBy(name= "QTY_BACKPACKS")
	public WebElement BackpackQty;
	@FindBy(name= "QTY_GLASSES")
	public WebElement GlassesQty;
	@FindBy(name= "QTY_SOCKS")
	public WebElement SocksQty;
	@FindBy(name= "QTY_BOOTS")
	public WebElement BootsQty;
	@FindBy(name= "QTY_SHORTS")
	public WebElement ShortsQty;
	@FindBy(name= "bSubmit")
	public WebElement btnPlaceOrder;
	
	public CatalogPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

}
