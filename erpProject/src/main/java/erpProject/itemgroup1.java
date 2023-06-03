package erpProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class itemgroup1 {
	
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
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[normalize-space()='Production']")).click();
				
				driver.findElement(By.xpath("//span[normalize-space()='Item Group']")).click();
				
				driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]")).click();
				
				
}
}
