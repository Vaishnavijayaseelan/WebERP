package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	
	By txt_username = By.name("UserNameEntryField");
	By txt_password = By.name("Password");
	By btn_login = By.name("SubmitUser");

	
	public LoginPage() {
			
		PageFactory.initElements(driver, this);
		
		
		}
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(txt_password).sendKeys(pass);
		
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
}
