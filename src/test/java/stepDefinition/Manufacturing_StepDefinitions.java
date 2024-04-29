package stepDefinition;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import pages.LoginPage;
import pages.ManufacturingPages;
import pages.Purchasepage_PayablesPage;
import pages.ReceivablesPage;
import pages.SalesPage;

public class Manufacturing_StepDefinitions extends BaseClass {

	LoginPage loginpage;
	SalesPage salespage;
	ReceivablesPage receivablespage;
	Purchasepage_PayablesPage purchasepage_payablespage;
	InventoryPage inventorypage;
	ManufacturingPages manufacturingpages;

	@Before
	public void beforeScenario() {
		initialization(); // Call setup method from the base class

		loginpage = new LoginPage();
		salespage = new SalesPage();
		receivablespage = new ReceivablesPage();
		purchasepage_payablespage = new Purchasepage_PayablesPage();
		manufacturingpages = new ManufacturingPages();
	}

	@Given("user already clicked on Manufacturing link")
	public void user_already_clicked_on_manufacturing_link() {
		manufacturingpages.clickOnManufacturingLink();
	}

	@Then("user verify the Transactions list under Manufacturing")
	public void user_verify_the_transactions_list_under_manufacturing() {
		manufacturingpages.verifyTransactionsList();
	}

	@Then("user verify the Inquiries and Reports list under Manufacturing")
	public void user_verify_the_inquiries_and_reports_list_under_manufacturing() {
		manufacturingpages.verifyInquiriesandReportsList();

	}

	@Then("user verify the Maintenance list under Manufacturing")
	public void user_verify_the_maintenance_list_under_manufacturing() {
		manufacturingpages.verifyMaintenanceList();
	}

	@Then("user clicks on General Ledger")
	public void user_clicks_on_general_ledger() {
		manufacturingpages.clickOnGeneralLink();
	}

	@After
	public void afterScenario() {
		driver.quit(); // Call teardown method from the base class
	}

}
