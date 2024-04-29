package pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

public class InventoryPage extends BaseClass {

	By Inventory_link = By.linkText("Inventory");

	By Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");
	
	By Manufacturing_link = By.linkText("Manufacturing");

	public InventoryPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnInventoryLink() {
		driver.findElement(Inventory_link).click();
	}

	public void validateTransactionsList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays.asList("Receive Purchase Orders"
					+ "Inventory Transfer - Item Dispatch" + "Bulk Inventory Transfer - Dispatch"
					+ "Bulk Inventory Transfer - Receive" + "Inventory Adjustments" + "Reverse Goods Received"
					+ "Enter Stock Counts" + "Create a New Internal Stock Request" + "Authorise Internal Stock Requests"
					+ "Fulfill Internal Stock Requests");

			List<String> actualTransactions = Arrays.asList("Receive Purchase Orders"
					+ "Inventory Transfer - Item Dispatch" + "Bulk Inventory Transfer - Dispatch"
					+ "Bulk Inventory Transfer - Receive" + "Inventory Adjustments" + "Reverse Goods Received"
					+ "Enter Stock Counts" + "Create a New Internal Stock Request" + "Authorise Internal Stock Requests"
					+ "Fulfill Internal Stock Requests");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void validateInquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("Serial Item Research Tool" + "Print Price Labels"
					+ "Reprint GRN" + "Inventory Item Movements" + "Inventory Item Status" + "Inventory Item Usage"
					+ "Inventory Quantities" + "Reorder Level" + "Stock Dispatch" + "Inventory Valuation Report"
					+ "Mail Inventory Valuation Report" + "Inventory Planning Report"
					+ "Inventory Planning Based On Preferred Supplier Data" + "Inventory Stock Check Sheets"
					+ "Make Inventory Quantities CSV" + "Compare Counts Vs Stock Check Data"
					+ "All Inventory Movements By Location/Date" + "List Inventory Status By Location/Category"
					+ "Historical Stock Quantity By Location/Category" + "List Negative Stocks"
					+ "Period Stock Transaction Listing" + "Stock Transfer Note" + "Aged Controlled Stock Report"
					+ "Internal stock request inquiry");

			List<String> actualReports = Arrays.asList("Serial Item Research Tool" + "Print Price Labels"
					+ "Reprint GRN" + "Inventory Item Movements" + "Inventory Item Status" + "Inventory Item Usage"
					+ "Inventory Quantities" + "Reorder Level" + "Stock Dispatch" + "Inventory Valuation Report"
					+ "Mail Inventory Valuation Report" + "Inventory Planning Report"
					+ "Inventory Planning Based On Preferred Supplier Data" + "Inventory Stock Check Sheets"
					+ "Make Inventory Quantities CSV" + "Compare Counts Vs Stock Check Data"
					+ "All Inventory Movements By Location/Date" + "List Inventory Status By Location/Category"
					+ "Historical Stock Quantity By Location/Category" + "List Negative Stocks"
					+ "Period Stock Transaction Listing" + "Stock Transfer Note" + "Aged Controlled Stock Report"
					+ "Internal stock request inquiry");

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
			List<String> expectedmaintenance = Arrays.asList(" Add A New Item"
					+ " Select An Item"
					+ " Review Translated Descriptions"
					+ " Sales Category Maintenance"
					+ " Brands Maintenance"
					+ " Add or Update Prices Based On Costs"
					+ " View or Update Prices Based On Costs"
					+ " Reorder Level By Category/Location");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays.asList(" Add A New Item"
					+ " Select An Item"
					+ " Review Translated Descriptions"
					+ " Sales Category Maintenance"
					+ " Brands Maintenance"
					+ " Add or Update Prices Based On Costs"
					+ " View or Update Prices Based On Costs"
					+ " Reorder Level By Category/Location");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);
			
		}
	}
			
			public void clickOnManufacturingLink() {

				driver.findElement(Manufacturing_link).click();

		
	}
}