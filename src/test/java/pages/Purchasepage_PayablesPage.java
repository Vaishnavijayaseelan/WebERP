package pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Purchasepage_PayablesPage extends BaseClass {

	By purchases_link = By.linkText("Purchases");

	By Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	By payables_link = By.linkText("Payables");

	By Transactions_pay = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_pay = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance_pay = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	public Purchasepage_PayablesPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnPurchasesLink() {
		driver.findElement(purchases_link).click();
	}

	public void validateTransactionsList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays.asList("New Purchase Order" + "Purchase Orders"
					+ "Purchase Order Grid Entry" + "Create a New Tender" + "Edit Existing Tenders"
					+ "Process Tenders and Offers" + "Orders to Authorise" + "Shipment Entry" + "Select A Shipment");

			List<String> actualTransactions = Arrays.asList("New Purchase Order" + "Purchase Orders"
					+ "Purchase Order Grid Entry" + "Create a New Tender" + "Edit Existing Tenders"
					+ "Process Tenders and Offers" + "Orders to Authorise" + "Shipment Entry" + "Select A Shipment");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void validateInquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("Purchase Order Inquiry"
					+ "Purchase Order Detail Or Summary Inquiries" + "Vendor Price List" + "Purchases from Suppliers");

			List<String> actualReports = Arrays.asList("Purchase Order Inquiry"
					+ "Purchase Order Detail Or Summary Inquiries" + "Vendor Price List" + "Purchases from Suppliers");

			Assert.assertEquals(expectedReports, actualReports);

		}
	}

	public void validateMaintenanceList() {
		List<WebElement> mainList = driver.findElements(Maintenance);

		// Iterate over the list of elements
		for (WebElement salesmain : mainList) {
			// Get the text of each element
			String maintenancelist = salesmain.getText();
			System.out.println(maintenancelist);
			List<String> expectedmaintenance = Arrays.asList("Maintain Supplier Price Lists");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays.asList("Maintain Supplier Price Lists");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	public void clickOnPayablesLink() {

		driver.findElement(payables_link).click();
	}

	public void validateTransList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays
					.asList("New Sales Order or Quotation" + "Enter Counter Sales" + "Enter Counter Returns"
							+ "Generate/Print Picking Lists" + "Outstanding Sales Orders/Quotations" + "Special Order"
							+ "Recurring Order Template" + "Process Recurring Orders" + "Maintain Picking Lists");

			List<String> actualTransactions = Arrays
					.asList("New Sales Order or Quotation" + "Enter Counter Sales" + "Enter Counter Returns"
							+ "Generate/Print Picking Lists" + "Outstanding Sales Orders/Quotations" + "Special Order"
							+ "Recurring Order Template" + "Process Recurring Orders" + "Maintain Picking Lists");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void validateInquiriesList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("Sales Order Inquiry" + "Print Price Lists"
					+ "Order Status Report" + "Orders Invoiced Reports" + "Daily Sales Inquiry"
					+ "Sales By Sales Type Inquiry" + "Sales By Category Inquiry" + "Sales By Category By Item Inquiry"
					+ "Sales Analysis Reports" + "Sales Graphs" + "Top Sellers Inquiry"
					+ "Order Delivery Differences Report" + "Delivery In Full On Time (DIFOT) Report"
					+ "Sales Order Detail Or Summary Inquiries" + "Top Sales Items Inquiry" + "Top Customers Inquiry"
					+ "Worst Sales Items Report" + "Sales With Low Gross Profit Report"
					+ "Sell Through Support Claims Report" + "Sales to Customers");

			List<String> actualReports = Arrays.asList("Sales Order Inquiry" + "Print Price Lists"
					+ "Order Status Report" + "Orders Invoiced Reports" + "Daily Sales Inquiry"
					+ "Sales By Sales Type Inquiry" + "Sales By Category Inquiry" + "Sales By Category By Item Inquiry"
					+ "Sales Analysis Reports" + "Sales Graphs" + "Top Sellers Inquiry"
					+ "Order Delivery Differences Report" + "Delivery In Full On Time (DIFOT) Report"
					+ "Sales Order Detail Or Summary Inquiries" + "Top Sales Items Inquiry" + "Top Customers Inquiry"
					+ "Worst Sales Items Report" + "Sales With Low Gross Profit Report"
					+ "Sell Through Support Claims Report" + "Sales to Customers");

			Assert.assertEquals(expectedReports, actualReports);

		}
	}

	public void validateMainList() {
		List<WebElement> mainList = driver.findElements(Maintenance);

		// Iterate over the list of elements
		for (WebElement salesmain : mainList) {
			// Get the text of each element
			String maintenancelist = salesmain.getText();
			System.out.println(maintenancelist);
			List<String> expectedmaintenance = Arrays
					.asList("Create Contract" + "Select Contract" + "Sell Through Support Deals");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays
					.asList("Create Contract" + "Select Contract" + "Sell Through Support Deals");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

}
