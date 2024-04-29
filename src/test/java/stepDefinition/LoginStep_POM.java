package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;



public class LoginStep_POM extends BaseClass{

	LoginPage loginpage;
	
	
	@Before
    public void beforeScenario() {
		initialization(); // Call setup method from the base class
		 loginpage =new LoginPage();
		
    }
 
   
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("Im inside the loginDemo_POM");
		
	
	}

	
	

	@When("^user title of login page is webERP$")
	public void user_title_of_login_page_is_web_erp() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("webERP Login screen", title);



	}

	@Then("user enters {string} and user enters {string}")
	public void user_enters_and_user_enters(String username, String password) {
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		
		//driver.findElement(By.name("UserNameEntryField")).sendKeys("Admin");;
		//driver.findElement(By.name("Password")).sendKeys("weberp");

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginpage.clickLogin();
		
		//driver.findElement(By.xpath("//input[@name='SubmitUser']")).click();

   Thread.sleep(3000);
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Home page title::"+title);
		Assert.assertEquals("webERP - Main Menu", title);
		Thread.sleep(3000);
		
	}
	 @After
	    public void afterScenario() {
		 driver.quit(); // Call teardown method from the base class
	    }

}


