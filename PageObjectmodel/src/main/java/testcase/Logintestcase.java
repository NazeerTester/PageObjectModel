package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectexample.LoginpageObjects;

public class Logintestcase {
	
@Test
public void loginda() throws InterruptedException

{

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.phptravels.net/login");
	Thread.sleep(3000);
	
	PageFactory.initElements(driver, LoginpageObjects.class);
	

	LoginpageObjects.username.sendKeys("user@phptravels.com");
	LoginpageObjects.password.sendKeys("demouser");
	LoginpageObjects.gotit.click();
	LoginpageObjects.password.click();
	
	
	/*
	 * LoginpageObjects.username(driver).sendKeys("user@phptravels.com"); //username
	 * will take the webdriver driver = new chrome driver by passing as "driver"
	 * parameter LoginpageObjects.password(driver).sendKeys("demouser");
	 * LoginpageObjects.loginbutton(driver).click();
	 */
	/*
	 * WebElement username =driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")); WebElement
	 * password =driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
	 * WebElement loginbutton=driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
	 * 
	 * WebElement gotit=driver.findElement(By.xpath("//*[@id=\'cookie_stop\']"));
	 * gotit.click(); username.sendKeys("tester123@gmail.com");
	 * password.sendKeys("tester123"); loginbutton.click();
	 */
}
}

