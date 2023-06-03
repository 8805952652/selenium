package testng;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Itemmaster {
	WebDriver driver;
	
	
	@Test
	public void f() {
	}

	@BeforeSuite
	public void beforeSuite() {

		 WebDriverManager.chromedriver().driverVersion("112.0.5615.49 ").setup();
		// WebDriverManager.firefoxdriver().driverVersion("112.0 ").setup();

		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://erpqa.chitalegroup.co.in/login");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.name("j_username")).sendKeys("supervisor");
		driver.findElement(By.name("j_password")).sendKeys("Sangli1");

		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Production']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Item Master']")).click();	
		
	    Select selectcat=new Select(driver.findElement(By.xpath("//select[@name='cat_id']")));
	    selectcat.selectByVisibleText("Manufacturing Item");
	    
	    Select selectgroup=new Select(driver.findElement(By.name("itg_id")));
	    selectgroup.selectByVisibleText("Full Cream Chakka");
	    
	    Select selectsubgroup=new Select(driver.findElement(By.name("itsg_id")));
	    selectsubgroup.selectByVisibleText("Full Cream Chakka");
	    
	    driver.findElement(By.id("dropdown-button-dark-example1")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Price Tax Master']")).click();
	    driver.findElement(By.className("dropdown-item")).click();
	    driver.findElement(By.className("btn btn-primary")).click();
	    

}
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
}
