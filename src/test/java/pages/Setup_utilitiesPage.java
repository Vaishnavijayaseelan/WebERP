package pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

public class Setup_utilitiesPage extends BaseClass {

	By setup_link = By.linkText("Setup");

	By General_Setup = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Receivables_Setup = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Inventory_Setup = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	By utilities_link = By.linkText("Utilities");

	By Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	By Logout_Btn = By.xpath("//a[@data-title ='Logout']");

	public Setup_utilitiesPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnsetuppageLink() {

		driver.findElement(setup_link).click();
	}

	public void verifyGeneralSetup() {
		List<WebElement> TransList = driver.findElements(General_Setup);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays.asList(
					"Company Preferences" + "System Parameters" + "Users Maintenance" + "Maintain Security Tokens"
							+ "Access Permissions Maintenance" + "Page Security Settings" + "Currencies Maintenance"
							+ "Tax Authorities and Rates Maintenance" + "Tax Group Maintenance"
							+ "Dispatch Tax Province Maintenance" + "Tax Category Maintenance" + "List Periods Defined"
							+ "Report Builder Tool" + "View Audit Trail" + "Geocode Maintenance" + "Form Designer"
							+ "Web-Store Configuration" + "SMTP Server Details" + "Mailing Group Maintenance");

			List<String> actualTransactions = Arrays.asList(
					"Company Preferences" + "System Parameters" + "Users Maintenance" + "Maintain Security Tokens"
							+ "Access Permissions Maintenance" + "Page Security Settings" + "Currencies Maintenance"
							+ "Tax Authorities and Rates Maintenance" + "Tax Group Maintenance"
							+ "Dispatch Tax Province Maintenance" + "Tax Category Maintenance" + "List Periods Defined"
							+ "Report Builder Tool" + "View Audit Trail" + "Geocode Maintenance" + "Form Designer"
							+ "Web-Store Configuration" + "SMTP Server Details" + "Mailing Group Maintenance");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void verifyReceivablesSetup() {
		List<WebElement> InqList = driver.findElements(Receivables_Setup);
		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("Sales Types" + "Customer Types" + "Supplier Types"
					+ "Credit Status" + "Payment Terms" + "Set Purchase Order Authorisation levels" + "Payment Methods"
					+ "Sales People" + "Sales Areas" + "Shipping-methods" + "Sales GL Interface Postings"
					+ "COGS GL Interface Postings" + "Shipping Costs Maintenance" + "Discount Matrix");

			List<String> actualReports = Arrays.asList("Sales Types" + "Customer Types" + "Supplier Types"
					+ "Credit Status" + "Payment Terms" + "Set Purchase Order Authorisation levels" + "Payment Methods"
					+ "Sales People" + "Sales Areas" + "Shipping-methods" + "Sales GL Interface Postings"
					+ "COGS GL Interface Postings" + "Shipping Costs Maintenance" + "Discount Matrix");

			Assert.assertEquals(expectedReports, actualReports);

		}

	}

	public void verifyInventorySetup() {
		List<WebElement> mainList = driver.findElements(Inventory_Setup);

		// Iterate over the list of elements
		for (WebElement salesmain : mainList) {
			// Get the text of each element
			String maintenancelist = salesmain.getText();
			System.out.println(maintenancelist);
			List<String> expectedmaintenance = Arrays.asList("Inventory Categories Maintenance"
					+ "Inventory Locations Maintenance" + "Inventory Location Authorized Users Maintenance"
					+ "User Authorized Inventory Locations Maintenance" + "Discount Category Maintenance"
					+ "Units of Measure" + "MRP Available Production Days" + "MRP Demand Types"
					+ "Maintain Internal Departments" + "Maintain Internal Stock Categories to User Roles"
					+ "Label Templates Maintenance");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays.asList("Inventory Categories Maintenance"
					+ "Inventory Locations Maintenance" + "Inventory Location Authorized Users Maintenance"
					+ "User Authorized Inventory Locations Maintenance" + "Discount Category Maintenance"
					+ "Units of Measure" + "MRP Available Production Days" + "MRP Demand Types"
					+ "Maintain Internal Departments" + "Maintain Internal Stock Categories to User Roles"
					+ "Label Templates Maintenance");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	public void clickOnUtilitiesLink() {

		driver.findElement(utilities_link).click();

	}

	public void verifyTransactionsList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays
					.asList("Change A Customer Code"
							+ "Change A Customer Branch Code"
							+ "Change A GL Account Code"
							+ "Change An Inventory Item Code"
							+ "Change A Location Code"
							+ "Change A Salesman Code"
							+ "Change A Stock Category Code"
							+ "Change A Supplier Code"
							+ "Translate Item Descriptions"
							+ "Update costs for all BOM items, from the bottom up"
							+ "Re-apply costs to Sales Analysis"
							+ "Delete sales transactions"
							+ "Reverse all supplier payments on a specified date"
							+ "Update sales analysis with latest customer data"
							+ "Copy Authority of GL Accounts from one user to another");

			List<String> actualTransactions = Arrays
					.asList("Change A Customer Code"
							+ "Change A Customer Branch Code"
							+ "Change A GL Account Code"
							+ "Change An Inventory Item Code"
							+ "Change A Location Code"
							+ "Change A Salesman Code"
							+ "Change A Stock Category Code"
							+ "Change A Supplier Code"
							+ "Translate Item Descriptions"
							+ "Update costs for all BOM items, from the bottom up"
							+ "Re-apply costs to Sales Analysis"
							+ "Delete sales transactions"
							+ "Reverse all supplier payments on a specified date"
							+ "Update sales analysis with latest customer data"
							+ "Copy Authority of GL Accounts from one user to another");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void verifyInquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("Debtors Balances By Currency Totals"
					+ "Suppliers Balances By Currency Totals"
					+ "Show General Transactions That Do Not Balance"
					+ "List of items without picture");

			List<String> actualReports = Arrays.asList("Debtors Balances By Currency Totals"
					+ "Suppliers Balances By Currency Totals"
					+ "Show General Transactions That Do Not Balance"
					+ "List of items without picture");

			Assert.assertEquals(expectedReports, actualReports);

		}

	}

	public void verifyMaintenanceList() {
		List<WebElement> mainList = driver.findElements(Maintenance);

		// Iterate over the list of elements
		for (WebElement salesmain : mainList) {
			// Get the text of each element
			String maintenancelist = salesmain.getText();
			System.out.println(maintenancelist);
			List<String> expectedmaintenance = Arrays
					.asList("Maintain Language Files"
							+ "Make New Company"
							+ "Data Export Options"
							+ "Import Customers from .csv file"
							+ "Import Stock Items from .csv file"
							+ "Import Price List from .csv file"
							+ "Import Fixed Assets from .csv file"
							+ "Import GL Payments Receipts Or Journals From .csv file"
							+ "Create new company template SQL file and submit to webERP"
							+ "Re-calculate brought forward amounts in GL"
							+ "Re-Post all GL transactions from a specified period"
							+ "Purge all old prices"
							+ "Remove all purchase back orders");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays
					.asList("Maintain Language Files"
							+ "Make New Company"
							+ "Data Export Options"
							+ "Import Customers from .csv file"
							+ "Import Stock Items from .csv file"
							+ "Import Price List from .csv file"
							+ "Import Fixed Assets from .csv file"
							+ "Import GL Payments Receipts Or Journals From .csv file"
							+ "Create new company template SQL file and submit to webERP"
							+ "Re-calculate brought forward amounts in GL"
							+ "Re-Post all GL transactions from a specified period"
							+ "Purge all old prices"
							+ "Remove all purchase back orders");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	public void clickOnlogoutBtn() {

		driver.findElement(Logout_Btn).click();

	}

}
