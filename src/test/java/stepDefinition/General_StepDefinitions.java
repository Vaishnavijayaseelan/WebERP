package stepDefinition;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GeneralPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.ManufacturingPages;
import pages.Purchasepage_PayablesPage;
import pages.ReceivablesPage;
import pages.SalesPage;

public class General_StepDefinitions extends BaseClass {

	LoginPage loginpage;
	SalesPage salespage;
	ReceivablesPage receivablespage;
	Purchasepage_PayablesPage purchasepage_payablespage;
	InventoryPage inventorypage;
	ManufacturingPages manufacturingpages;
	GeneralPage generalpage;

	@Before
	public void beforeScenario() {
		initialization(); // Call setup method from the base class

		loginpage = new LoginPage();
		salespage = new SalesPage();
		receivablespage = new ReceivablesPage();
		purchasepage_payablespage = new Purchasepage_PayablesPage();
		manufacturingpages = new ManufacturingPages();
		generalpage = new GeneralPage();
	}

	@Given("user already clicked on General Ledger link")
	public void user_already_clicked_on_general_ledger_link() {
		generalpage.clickOnGeneralpageLink();
	}

	@When("user verify the Transactions list under General Ledger")
	public void user_verify_the_transactions_list_under_general_ledger() {
		generalpage.verifyTransactionsList();
	}

	@Then("user verify the Inquiries and Reports list under General Ledger")
	public void user_verify_the_inquiries_and_reports_list_under_general_ledger() {
		generalpage.verifyInquiriesandReportsList();

	}

	@Then("user verify the Maintenance list under General Ledger")
	public void user_verify_the_maintenance_list_under_general_ledger() {
		generalpage.verifyMaintenanceList();

	}

	@Then("user clicks on Asset Manager")
	public void user_clicks_on_asset_manager() {
		generalpage.clickOnManagerLink();

	}

	@After
	public void afterScenario() {
		driver.quit(); // Call teardown method from the base class
	}

}
