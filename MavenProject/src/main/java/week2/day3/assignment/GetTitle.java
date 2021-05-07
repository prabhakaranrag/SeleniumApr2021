package week2.day3.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementByCssSelector(".btn-primary").click();
		String Title = driver.findElementByPartialLinkText("ACME System 1").getText();
		System.out.println(Title);
		driver.findElementByPartialLinkText("Log Out").click();
	}

}
