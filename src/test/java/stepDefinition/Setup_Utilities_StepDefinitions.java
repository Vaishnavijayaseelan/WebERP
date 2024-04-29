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
import pages.Setup_utilitiesPage;

public class Setup_Utilities_StepDefinitions extends BaseClass {

	LoginPage loginpage;
	SalesPage salespage;
	ReceivablesPage receivablespage;
	Purchasepage_PayablesPage purchasepage_payablespage;
	InventoryPage inventorypage;
	ManufacturingPages manufacturingpages;
	GeneralPage generalpage;
	Manager_CashPage managerpage;
	Setup_utilitiesPage setup_utilitiespage;

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
		setup_utilitiespage = new Setup_utilitiesPage();
	}
	
	
	@Given("user already clicked on Setup link")
	public void user_already_clicked_on_setup_link() {
		setup_utilitiespage.clickOnsetuppageLink();
	    
	    
	}

	@When("user verify the General Setup Options")
	public void user_verify_the_general_setup_options() {
		setup_utilitiespage.verifyGeneralSetup();
	    
	}

	@Then("user verify the Receivables or Payables Setup")
	public void user_verify_the_receivables_payables_setup() {
		setup_utilitiespage.verifyReceivablesSetup();
	    
	}

	@Then("user verify the Inventory Setup")
	public void user_verify_the_inventory_setup() {
		setup_utilitiespage.verifyInventorySetup();
	    
	}

	@Then("user clicks on Utilities")
	public void user_clicks_on_utilities() {
		setup_utilitiespage.clickOnUtilitiesLink();
	    
	}

	@Then("user verify the Transactions list under Utilities")
	public void user_verify_the_transactions_list_under_utilities() {
		setup_utilitiespage.verifyTransactionsList();
	    
	}

	@Then("user verify the Inquiries and Reports list under Utilities")
	public void user_verify_the_inquiries_and_reports_list_under_utilities() {
		setup_utilitiespage.verifyInquiriesandReportsList();
	    
	}

	@Then("user verify the Maintenance list under Utilities")
	public void user_verify_the_maintenance_list_under_utilities() {
		setup_utilitiespage.verifyMaintenanceList();
	    
	}

	@Then("user logged Out the application")
	public void user_logged_out_the_application() {
		setup_utilitiespage.clickOnlogoutBtn();
	    
	}
	@After
	public void afterScenario() {
		driver.quit(); // Call teardown method from the base class
	}


}
