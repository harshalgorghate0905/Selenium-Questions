package testngDemo;
/*
1)login
2)Give userid and password and click login
3)close the browser
*/

import java.time.Duration; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firstcode {
	
	WebDriver driver;	
	
	@BeforeClass
	void login() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test (priority=1, groups = {"sanity","regression"})
	void id() {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test (priority=2, groups = {"sanity","regression"})
	void title() {
		
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	void close() {
		
		driver.close();
	}
	

}
