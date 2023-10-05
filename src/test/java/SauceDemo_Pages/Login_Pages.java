package SauceDemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login_Pages {
	@FindBy(xpath="//input[@id='user-name']")WebElement Uname;
	@FindBy(xpath="//input[@id='password']")WebElement pswd;
	@FindBy(xpath="//input[@id='login-button']")WebElement btn;
	
	@FindBy(xpath="//h3[@data-test='error']")WebElement error;
	WebDriver driver;
	public Login_Pages(WebDriver wd)
	{
		driver =wd;
		PageFactory.initElements(driver, this);
	}
	public void UNameAndPass()
	{
		Uname.sendKeys("standard_user");
		pswd.sendKeys("secret_sauce");
	}
	public void loginbtn()
	{
		btn.click();
	}
	public void AssertError()
	{
		String b=error.getText();
		Assert.assertEquals(b,"Epic sadface: Username is required");
	}

}
