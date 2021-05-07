package week2.day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchApplication  {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElementById("username");
		WebElement password = driver.findElementById("password");
		WebElement login = driver.findElementByClassName("decorativeSubmit");
		
		username.sendKeys("Demosalesmanager");
		password.sendKeys("crmsfa");
		
		login.click();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(1000);
		driver.findElementById("createLeadForm_companyName").sendKeys("Epitec Inc");
		driver.findElementById("createLeadForm_firstName").sendKeys("Prabhakaran");
		driver.findElementById("createLeadForm_lastName").sendKeys("Raghavan");
		driver.findElementByClassName("smallSubmit").click();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
