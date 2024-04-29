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
import pages.Manager_CashPage;
import pages.ManufacturingPages;
import pages.Purchasepage_PayablesPage;
import pages.ReceivablesPage;
import pages.SalesPage;

public class Manager_Cash_StepDefinitions extends BaseClass {

	LoginPage loginpage;
	SalesPage salespage;
	ReceivablesPage receivablespage;
	Purchasepage_PayablesPage purchasepage_payablespage;
	InventoryPage inventorypage;
	ManufacturingPages manufacturingpages;
	GeneralPage generalpage;
	Manager_CashPage managerpage;

	@Before
	public void beforeScenario() {
		initialization(); // Call setup method from the base class

		loginpage = new LoginPage();
		salespage = new SalesPage();
		receivablespage = new ReceivablesPage();
		purchasepage_payablespage = new Purchasepage_PayablesPage();
		manufacturingpages = new ManufacturingPages();
		generalpage = new GeneralPage();
		managerpage = new Manager_CashPage();
	}

	@Given("user already clicked on Asset Manager link")
	public void user_already_clicked_on_asset_manager_link() {
		managerpage.clickOnManagerpageLink();
	}

	@When("user verify the Transactions list under Asset Manager")
	public void user_verify_the_transactions_list_under_asset_manager() {
		managerpage.verifyTransactionsList();

	}

	@Then("user verify the Inquiries and Reports list under Asset Manager")
	public void user_verify_the_inquiries_and_reports_list_under_asset_manager() {
		managerpage.verifyInquiriesandReportsList();

	}

	@Then("user verify the Maintenance list under Asset Manager")
	public void user_verify_the_maintenance_list_under_asset_manager() {
		managerpage.verifyMaintenanceList();
	}

	@Then("user clicks on Petty Cash")
	public void user_clicks_on_petty_cash() {
		managerpage.clickOnpettyCashLink();

	}

	@Then("user verify the Transactions list under Petty Cash")
	public void user_verify_the_transactions_list_under_petty_cash() {
		managerpage.verifypetty_TransactionsList();

	}

	@Then("user verify the Inquiries and Reports list under Petty Cash")
	public void user_verify_the_inquiries_and_reports_list_under_petty_cash() {
		managerpage.verifypetty_InquiriesandReportsList();

	}

	@Then("user verify the Maintenance list under Petty Cash")
	public void user_verify_the_maintenance_list_under_petty_cash() {
		managerpage.verifypetty_MaintenanceList();

	}

	@Then("user clicks on Setup")
	public void user_clicks_on_setup() {
		managerpage.clickOnsetupLink();

	}

	@After
	public void afterScenario() {
		driver.quit(); // Call teardown method from the base class
	}

}
