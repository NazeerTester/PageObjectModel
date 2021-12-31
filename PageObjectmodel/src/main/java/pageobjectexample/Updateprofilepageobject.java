package pageobjectexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Updateprofilepageobject {
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[4]/a")
	public static WebElement myprofile;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[10]/td[3]/div/input")
	public static WebElement postal;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	public static WebElement submit;
	
	
	
	
	
	/*
	 * public static WebElement myprofile(WebDriver driver) {
	 * 
	 * return
	 * driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"));
	 * 
	 * 
	 * }
	 * 
	 * public static WebElement postal(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[10]/td[3]/div/input"
	 * ));
	 * 
	 * }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"
	 * )); }
	 */

}
