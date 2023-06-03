package erpProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ItemGroup {
	//WebDriver driver;
		public static void main(String[] args) throws InterruptedException, IOException{
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
			
			WebDriverManager.chromedriver().driverVersion("111.0.5563.64").setup();


			WebDriver driver= new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			
			
			driver.get("https://erpqa.chitalegroup.co.in/login");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			driver.findElement(By.name("j_username")).sendKeys("supervisor");
			driver.findElement(By.name("j_password")).sendKeys("Sangli1");
		
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.xpath("//p[normalize-space()='Production']")).click();
			
			driver.findElement(By.xpath("//span[normalize-space()='Item Group']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Create new']")).click();
			
		
			 Select selectcatgr = new Select(driver.findElement(By.name("cat")));
			 selectcatgr.selectByVisibleText("Store Item");  
			
			 
			 Select selectdept = new Select (driver.findElement(By.name("dept_id")));
			 selectdept.selectByVisibleText("Store");
			 
			 
			 Select Selectsection = new Select (driver.findElement(By.name("sec_id")));
			 Selectsection.selectByVisibleText("Store section");
			 
			driver.findElement(By.name("itg_name")).sendKeys("rohan1");
			driver.findElement(By.xpath("//button[normalize-space()='Send For Approval']")).click();
			
			Thread.sleep(3000);
			driver.quit();
		
			
		}
}
			


