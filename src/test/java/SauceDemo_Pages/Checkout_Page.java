package SauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Checkout_Page {
	WebDriver driver;
	@FindBy(xpath="//span[@class='title']")WebElement AssetChkot;
	@FindBy(xpath="//input[@id='first-name']")WebElement name;
	@FindBy(xpath="//input[@id='last-name']")WebElement lName;
	@FindBy(xpath="//input[@id='postal-code']")WebElement zipCode;
	@FindBy(xpath="//input[@id='continue']")WebElement conti;
	@FindBy(xpath="//span[@class='title']")WebElement checkoverview;
	@FindBy(xpath="//button[@id='cancel']")WebElement cancel;
	@FindBy(xpath="//span[@class='title']")WebElement AssertCart;
	@FindBy(xpath="//button[@id='finish']")WebElement finish;
	@FindBy(xpath="//span[@class='title']")WebElement CheckComp;
	@FindBy(xpath="//h2[@class='complete-header']")WebElement thankUAssert;
	@FindBy(xpath="//button[@id='back-to-products']")WebElement BackToHome;
	public Checkout_Page(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void AssertCheckout()
	{
		String c=AssetChkot.getText();
		Assert.assertEquals(c,"Checkout: Your Information");
	}
	public void details()
	{
		name.sendKeys("shivani");
		lName.sendKeys("ped");
		zipCode.sendKeys("ffg");
	}
	public void cont()
	{
		conti.click();
	}
	public void AssOverview()
	{
		String a=checkoverview.getText();
		System.out.println(a);
		Assert.assertEquals(a, "Checkout: Overview");
	}
	public void finish()
	{
		finish.click();
	}
	public void AsseCh()
	{
		String g=CheckComp.getText();
		Assert.assertEquals(g, "Checkout: Complete!");
	}
	public void thank()
	{
		String d=thankUAssert.getText();
		Assert.assertEquals(d,"Thank you for your order!");
	}
	public void Back()
	{
		BackToHome.click();
	}

}
