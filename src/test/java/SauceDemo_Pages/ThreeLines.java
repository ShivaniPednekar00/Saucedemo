package SauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ThreeLines {
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")WebElement threelines;
	@FindBy(xpath="//a[@id='logout_sidebar_link']")WebElement logout;
	@FindBy(xpath="//a[@id='reset_sidebar_link']")WebElement reset;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")WebElement count;
	@FindBy(xpath="//a[@id='about_sidebar_link']")WebElement about;
	@FindBy(xpath="//div[@class='MuiStack-root css-u4p24i']/child::div[1]/child::a")WebElement signup;
	WebDriver driver;
	public ThreeLines(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void ThreeLines()
	{
		threelines.click();
	}
	public void logout()
	{
		logout.click();
	}
	public void Reset()
	{
		reset.click();
	}
	public void assertn()
	{
		String h=count.getText();
		Assert.assertEquals(h, " ");
	}
	public void about()
	{
		
		about.click();
	}
	public void signup()
	{
		signup.click();
	}

}
