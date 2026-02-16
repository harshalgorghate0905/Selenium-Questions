package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMPage {
	
	WebDriver driver;
	//constructor
	public POMPage(WebDriver driver){
		
		this.driver=driver;
		
	}	
	
	//locators

	By textbox_username_loc=By.xpath("//input[@placeholder='Username']");
	By textbox_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	By textbox = By.
	
	//Action methods
	
	public void set_Username(String user) {
		driver.findElement(textbox_username_loc).sendKeys(user);
		
	}
	public void set_Password(String pwd) {
		driver.findElement(textbox_password_loc).sendKeys(pwd);
	}
	public void click_login() {
		driver.findElement(btn_login_loc).click();
	}
}
