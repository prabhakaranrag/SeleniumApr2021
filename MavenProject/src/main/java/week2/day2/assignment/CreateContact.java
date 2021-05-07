package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		  WebElement username = driver.findElementById("username"); WebElement password
		  = driver.findElementById("password"); WebElement login =
		  driver.findElementByClassName("decorativeSubmit");
		  username.sendKeys("Demosalesmanager"); password.sendKeys("crmsfa");
		  login.click(); driver.findElementByLinkText("CRM/SFA").click();
		  driver.findElement(By.linkText("Contacts")).click();
		  driver.findElement(By.linkText("Create Contact")).click();
		  driver.findElement(By.id("firstNameField")).sendKeys("Prabhakaran");
		  driver.findElement(By.id("lastNameField")).sendKeys("Raghavan");
		  driver.findElement(By.id("createContactForm_departmentName")).
		  sendKeys("Information Technology");
		  driver.findElement(By.id("createContactForm_description")).
		  sendKeys("Software Testing");
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(
		  "prabhakaranragavan@gmail.com"); WebElement generalSta =
		  driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")); new
		  Select(generalSta).selectByVisibleText("Michigan");
		  driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Novi");
		  driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys(
		  "48375"); driver.findElement(By.className("smallSubmit")).click();
		 
		  driver.findElement(By.linkText("Edit")).click();
		  driver.findElement(By.cssSelector("textarea#updateContactForm_description")).clear();
		  
		  driver.findElement(By.cssSelector("textarea#updateContactForm_importantNote")).sendKeys("Imp Info");
		  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		  driver.getTitle();
/*
		 
		
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
*/		
	}

}
