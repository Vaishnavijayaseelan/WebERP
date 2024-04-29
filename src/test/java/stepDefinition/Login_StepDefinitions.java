package stepDefinition;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

//public class LoginStepDefinitions {

//	WebDriver driver;

//	@Given("^user is on login page$")
//	public void user_is_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\vaishnavi\\WebERPFramework\\src\\test\\resources\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://etestingplatform.com/webERP/");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//
//	@When("^user title of login page is webERP$")
//	public void user_title_of_login_page_is_web_erp() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("webERP Login screen", title);
//
//
//
//	}
//
//	@Then("^user enters the username and user enters the password$")
//	public void user_enters_the_username_and_user_enters_the_password() {
//		driver.findElement(By.name("UserNameEntryField")).sendKeys("Admin");;
//		driver.findElement(By.name("Password")).sendKeys("weberp");
//
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//input[@name='SubmitUser']")).click();
//
//
//	}
//
//	@Then("^user is navigated to home page$")
//	public void user_is_navigated_to_home_page() {
//		String title = driver.getTitle();
//		System.out.println("Home page title::"+title);
//		Assert.assertEquals("webERP - Main Menu", title);
//		driver.close();
//		driver.quit();
//	}
//	
//
//}