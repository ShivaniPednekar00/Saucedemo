package SauceDemo_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Products_Page {
	WebDriver driver;
	@FindBy(xpath="//span[@class='title']")WebElement pro;
	@FindBy(xpath="//a[@id='item_4_title_link']")WebElement prods;
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement adTCart;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")WebElement count;
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")WebElement remove;
	@FindBy(xpath="//a[@id='item_0_title_link']")WebElement prod2;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")WebElement AddToCar2;
	@FindBy(xpath="//button[@id=\"remove-sauce-labs-bike-light\"]")WebElement remove2;
	@FindBy(xpath="//button[@id='back-to-products']")WebElement backtoProd;
	
	@FindBy(xpath="//a[@id='item_1_title_link']")WebElement prod3;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")WebElement addtoCart3;
	@FindBy(xpath="//a[@class='shopping_cart_link']")WebElement cart3;
	@FindBy(xpath="//select[@class='product_sort_container']")WebElement filter;
	public Products_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void AssertProd()
	{
		String a=pro.getText();
		Assert.assertEquals(a,"Products");
	}
	public void prod1()
	{
		prods.click();
	}
	public void AddToCart()
	{
		adTCart.click();
	}
	public void QtyAsse()
	{
		String b=count.getText();
		Assert.assertEquals(b,"1");
		
	}
	public void remoe()
	{
		remove.click();
	}
	public void prod2()
	{
		prod2.click();
	}
	public void addToCa()
	{
		AddToCar2.click();
	}
	public void remove()
	{
		remove2.click();
	}
	public void backTo()
	{
		backtoProd.click();
	}
	public void prod3()
	{
		prod3.click();
	}
	public void addToCa3()
	{
		addtoCart3.click();
	}
	public void car()
	{
		cart3.click();
	}
	public void asc()
	{
		filter.click();
		
		Select s=new Select(filter);
		s.selectByIndex(0);
	}
	public void desc()
	{
		Select s=new Select(filter);
		s.selectByIndex(1);
	}
	public void PLToH()
	{
		Select s=new Select(filter);
		s.selectByIndex(2);
	}
	public void PHToL()
	{
		Select s=new Select(filter);
		s.selectByIndex(3);
	}

}
