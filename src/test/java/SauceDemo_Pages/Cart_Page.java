package SauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart_Page {
	WebDriver driver;
	@FindBy(xpath="//a[@class='shopping_cart_link']")WebElement cart;
	@FindBy(xpath="//span[@class='title']")WebElement assCart;
	@FindBy(xpath="//div[@class='cart_quantity']")WebElement qty;
	@FindBy(xpath="//button[@id='checkout']")WebElement checkout;
	@FindBy(xpath="//button[@id='continue-shopping']")WebElement contShop;
	public Cart_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void cart()
	{
		cart.click();
	}
	public void AssertCart()
	{
		String s=assCart.getText();
		Assert.assertEquals(s, "Your Cart");
	}
	public void AssertQty()
	{
		String a=qty.getText();
		Assert.assertEquals(a, "1");
	}
	public void checkout()
	{
		checkout.click();
	}
	public void con()
	{
		contShop.click();
	}
}
