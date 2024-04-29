package stepDefinition;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.InventoryPage;
import pages.LoginPage;
import pages.Purchasepage_PayablesPage;
import pages.ReceivablesPage;
import pages.SalesPage;

public class Inventory_stepDefinitions extends BaseClass {
	LoginPage loginpage;
	SalesPage salespage;
	ReceivablesPage receivablespage;
	Purchasepage_PayablesPage purchasepage_payablespage;
	InventoryPage inventorypage;

	@Before
	public void beforeScenario() {
		initialization(); // Call setup method from the base class

		loginpage = new LoginPage();
		salespage = new SalesPage();
		receivablespage = new ReceivablesPage();
		purchasepage_payablespage = new Purchasepage_PayablesPage();
		inventorypage = new InventoryPage();
	}

	@Given("user clicks on the Inventory link")
	public void user_clicks_on_the_inventory_link() {
		inventorypage.clickOnInventoryLink();
	}

	@Then("user validate the Transactions list under Inventory")
	public void user_validate_the_transactions_list_under_inventory() {
		inventorypage.validateTransactionsList();
	}

	@Then("user validate the Inquiries and Reports list under Inventory")
	public void user_validate_the_inquiries_and_reports_list_under_inventory() {
		inventorypage.validateInquiriesandReportsList();
	}

	@Then("user validate the Maintenance list under Inventory")
	public void user_validate_the_maintenance_list_under_inventory() {
		inventorypage.validateMaintenanceList();
	}

	@Then("user clicks on Manufacturing")
	public void user_clicks_on_manufacturing() {
		inventorypage.clickOnManufacturingLink();
	}

	@After
	public void afterScenario() {
		driver.quit(); // Call teardown method from the base class
	}

}
