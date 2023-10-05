package Calling_Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import SauceDemo_Pages.Cart_Page;
import SauceDemo_Pages.Checkout_Page;
import SauceDemo_Pages.Login_Pages;
import SauceDemo_Pages.Products_Page;
import SauceDemo_Pages.ThreeLines;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calling_Page {
	WebDriver driver;
	Login_Pages l;
	Products_Page p;
	Cart_Page c;
	Checkout_Page ch;
	ThreeLines lg;
	
	@BeforeSuite
	public void browser() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void methods() throws InterruptedException, AWTException
	{
		l=new Login_Pages(driver);
		p=new Products_Page(driver);
		c=new Cart_Page(driver);
		ch=new Checkout_Page(driver);
		lg=new ThreeLines(driver);
		l.loginbtn();
		l.AssertError();
		l.UNameAndPass();
		l.loginbtn();
		p.AssertProd();
		p.prod1();
		p.AddToCart();
		p.QtyAsse();
		c.cart();
		c.AssertCart();
		c.AssertQty();
		c.checkout();
		ch.AssertCheckout();
		ch.details();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_SUBTRACT);
	    robo.keyRelease(KeyEvent.VK_CONTROL);
	    robo.keyRelease(KeyEvent.VK_SUBTRACT);
	    ch.cont();
	    ch.AssOverview();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_SUBTRACT);
	    robo.keyRelease(KeyEvent.VK_CONTROL);
	    robo.keyRelease(KeyEvent.VK_SUBTRACT);
	    ch.finish();
	    ch.AsseCh();
	    ch.Back();
	    p.AssertProd();
	    p.prod2();
	    p.addToCa();
	    p.remove();
	    p.backTo();
	    lg.ThreeLines();
	    lg.Reset();
	    p.prod3();
	    p.addToCa3();
	    p.car();
	    c.con();
	    p.AssertProd();
	    p.asc();
	    p.desc();
	    p.PLToH();
	    p.PHToL();
	    lg.ThreeLines();
	    lg.about();
	    driver.navigate().back();
	    lg.ThreeLines();
	    Thread.sleep(3000);
	    lg.logout();
	}
}