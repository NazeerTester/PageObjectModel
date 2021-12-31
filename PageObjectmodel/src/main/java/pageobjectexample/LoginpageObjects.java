package pageobjectexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageObjects {
	
	//Username,password and login elements
	
	
		
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")
	public static WebElement username;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id=\'cookie_stop\']")
	public static WebElement gotit;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement loginbutton;
	
	
	/*
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")); }
	 * 
	 * public static WebElement loginbutton(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")); }
	 */
}
