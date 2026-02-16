package seleniumCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("C:\\Automation\\welcome to java.txt");
	
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='File Uploaded!']")).getText());
		
		driver.quit();
	}

}
