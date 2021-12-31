package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectexample.LoginpageObjects;
import pageobjectexample.Updateprofilepageobject;

public class Updateprofile {


	@Test
	public void updateprofiles() throws InterruptedException
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
		LoginpageObjects.loginbutton.click();

		PageFactory.initElements(driver,Updateprofilepageobject.class);

		Updateprofilepageobject.myprofile.click();
		Updateprofilepageobject.postal.sendKeys("60000");
		Updateprofilepageobject.submit.click();


		/*
		 * Updateprofilepageobject.myprofile(driver).click();
		 * Updateprofilepageobject.postal(driver).sendKeys("600001");
		 * Updateprofilepageobject.submit(driver).click();
		 */







		/*
		 * 
		 * WebElement myprofile=driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[3]/ul/li[4]/a")); myprofile.click();
		 * 
		 * WebElement postal=driver.findElement(By.xpath(
		 * "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[10]/td[3]/div/input"
		 * )); postal.sendKeys("600001");
		 * 
		 * WebElement submit=driver.findElement(By.xpath(
		 * "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"
		 * )); submit.click();
		 */
	}
}
