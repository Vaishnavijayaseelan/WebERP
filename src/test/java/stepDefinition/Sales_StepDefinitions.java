package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.SalesPage;
import pages.LoginPage;

public class Sales_StepDefinitions extends BaseClass {

	SalesPage salespage;
	LoginPage loginpage;

	@Before
	public void beforeScenario() {
		initialization(); // Call setup method from the base class

		loginpage = new LoginPage();
		salespage = new SalesPage();

	}

	@Given("user has already logged into application")
	public void user_has_already_logged_into_application(DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		loginpage.enterUsername(userName);
		loginpage.enterPassword(password);
		loginpage.clickLogin();

	}

	@Given("user is already on home page")
	public void user_is_already_on_home_page() {

	}

	@When("user click on the sales link")
	public void user_click_on_the_sales_link() {
		salespage.clickOnSalesLink();

	}

	@Then("user validate the Transactions list")
	public void user_validate_the_transactions_list() throws InterruptedException {
		salespage.checkTransactionsList();
		Thread.sleep(3000);

	}

	@Then("user validate the Inquiries and Reports list")
	public void user_validate_the_inquiries_and_reports_list() throws InterruptedException {
		salespage.checkInquiriesandReportsList();
		Thread.sleep(3000);
	}

	@Then("user validate the Maintenance list")
	public void user_validate_the_maintenance_list() throws InterruptedException {
		salespage.checkMaintenanceList();
		Thread.sleep(3000);
	}

	@Then("user click on Receivables")
	public void user_click_on_receivables() throws InterruptedException {
		salespage.clickOnReceivablesLink();
		Thread.sleep(3000);

	}

	@After
	public void afterScenario() {
		driver.quit(); // Call teardown method from the base class
	}
}
