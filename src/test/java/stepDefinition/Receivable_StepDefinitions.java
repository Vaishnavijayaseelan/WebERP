package stepDefinition;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.ReceivablesPage;
import pages.SalesPage;

public class Receivable_StepDefinitions extends BaseClass{
	
	LoginPage loginpage;
	SalesPage salespage;
	ReceivablesPage receivablespage;
	
	

	@Before
	public void beforeScenario() {
		initialization(); // Call setup method from the base class

		loginpage = new LoginPage();
		salespage = new SalesPage();
		receivablespage = new ReceivablesPage();

		
	}

	
	@Given("user already clicked on the Receivables link")
	public void user_already_clicked_on_the_receivables_link() {
		receivablespage.clickOnReceivablesLink();
		
		
	    
	}

	@Then("user validate the Transactions list under Receivables")
	public void user_validate_the_transactions_list_under_receivables() {
		receivablespage.verifyTransactionsList();
	   
	}

	@Then("user validate the Inquiries and Reports list under Receivables")
	public void user_validate_the_inquiries_and_reports_list_under_receivables() {
		receivablespage.verifyInquiriesandReportsList();
	}

	@Then("user validate the Maintenance list under Receivables")
	public void user_validate_the_maintenance_list_under_receivables() {
		receivablespage.verifyMaintenanceList();
	}

	@Then("user clicks on Purchases")
	public void user_clicks_on_purchases() {
		receivablespage.clickOnPurchaseLink();
	}
	
	
	@After
    public void afterScenario() {
	 driver.quit(); // Call teardown method from the base class
    }
	
	
	
	
	
	
	
	
	
	
	

}
