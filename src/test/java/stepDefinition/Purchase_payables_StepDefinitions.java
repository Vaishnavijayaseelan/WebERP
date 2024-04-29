package stepDefinition;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.Purchasepage_PayablesPage;
import pages.ReceivablesPage;
import pages.SalesPage;

public class Purchase_payables_StepDefinitions extends BaseClass{

	LoginPage loginpage;
	SalesPage salespage;
	ReceivablesPage receivablespage;
	Purchasepage_PayablesPage purchasepage_payablespage;

	@Before
	public void beforeScenario() {
		initialization(); // Call setup method from the base class

		loginpage = new LoginPage();
		salespage = new SalesPage();
		receivablespage = new ReceivablesPage();
		purchasepage_payablespage = new Purchasepage_PayablesPage();
		
	}

	@Given("user already clicked on the Purchase link")
	public void user_already_clicked_on_the_purchase_link() {
		purchasepage_payablespage.clickOnPurchasesLink();

	}

	@Then("user validate the Transactions list under Purchase")
	public void user_validate_the_transactions_list_under_purchase() {
		purchasepage_payablespage.validateTransactionsList();

	}

	@Then("user validate the Inquiries and Reports list under Purchase")
	public void user_validate_the_inquiries_and_reports_list_under_purchase() {
		purchasepage_payablespage.validateInquiriesandReportsList();
	}

	@Then("user validate the Maintenance list under Purchase")
	public void user_validate_the_maintenance_list_under_purchase() {
		purchasepage_payablespage.validateMaintenanceList();

	}

	@Then("user clicks on Payables")
	public void user_clicks_on_payables() {
		purchasepage_payablespage.clickOnPayablesLink();
	}

	@Then("user validate the Transactions list under Payables")
	public void user_validate_the_transactions_list_under_payables() {
		purchasepage_payablespage.validateTransList();

	}

	@Then("user validate the Inquiries and Reports list under Payables")
	public void user_validate_the_inquiries_and_reports_list_under_payables() {
		purchasepage_payablespage.validateInquiriesList();
	}

	@Then("user validate the Maintenance list under Payables")
	public void user_validate_the_maintenance_list_under_payables() {
		purchasepage_payablespage.validateMainList();
		
	}
	@After
    public void afterScenario() {
	 driver.quit(); // Call teardown method from the base class
    }

}
