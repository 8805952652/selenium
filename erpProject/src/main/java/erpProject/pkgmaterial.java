package erpProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pkgmaterial {

	public static void main(String[] args)  throws InterruptedException, IOException{
		
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
		driver.findElement(By.xpath("//span[normalize-space()='Production']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Item Master')]")).click();
		
		Select selectcategory = new Select(driver.findElement(By.name("cat_id")));
		 selectcategory.selectByVisibleText("Manufacturing Item");
		
		Select selectgroup= new Select (driver.findElement(By.xpath("//select[@name='itg_id']")));
		selectgroup.selectByVisibleText("Full Cream Chakka");
		
		
		Select selectsubgroup= new Select(driver.findElement(By.xpath("//select[@name='itsg_id']")));
		selectsubgroup.selectByVisibleText("Full Cream Chakka");
		
		
		driver.findElement(By.xpath("//button[@id='dropdown-button-dark-example1']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Packaging Material']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Create new']")).click();
		
		Select selectcat = new Select(driver.findElement(By.name("category")));
		 selectcat.selectByVisibleText("Store Item");
		 
		 Select selectgrp = new Select(driver.findElement(By.name("selected_item_group")));
		 selectgrp.selectByVisibleText("Raw Material Shrikhand");
		 
		Select selectpkgmaterialname = new Select(driver.findElement(By.name("itm_packaging_no")));
		selectpkgmaterialname.selectByVisibleText("itm_packaging_no");
	} 
}
	
		 
		