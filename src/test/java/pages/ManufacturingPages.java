package pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

public class ManufacturingPages extends BaseClass {
	
	By Manufacturing_link = By.linkText("Manufacturing");

	By Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	By General_link = By.linkText("General Ledger");

	public ManufacturingPages() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickOnManufacturingLink() {

		driver.findElement(Manufacturing_link).click();
	}

	public void verifyTransactionsList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays.asList(
					"Work Order Entry" + " Select A Work Order" + " QA Samples and Test Results" + " Timesheet Entry");

			List<String> actualTransactions = Arrays.asList(
					"Work Order Entry" + " Select A Work Order" + " QA Samples and Test Results" + " Timesheet Entry");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void verifyInquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList(" Select A Work Order" + " Costed Bill Of Material Inquiry"
					+ " Where Used Inquiry" + " Bill Of Material Listing" + " Indented Bill Of Material Listing"
					+ " List Components Required" + " List Materials Not Used Anywhere" + " Indented Where Used Listing"
					+ " WO Items ready to produce" + " MRP" + " MRP Shortages" + " MRP Suggested Purchase Orders"
					+ " MRP Suggested Work Orders" + " MRP Reschedules Required" + " Print Product Specification"
					+ " Print Certificate of Analysis" + " Historical QA Test Results"
					+ " Multiple Work Orders Total Cost Inquiry");

			List<String> actualReports = Arrays.asList(" Select A Work Order" + " Costed Bill Of Material Inquiry"
					+ " Where Used Inquiry" + " Bill Of Material Listing" + " Indented Bill Of Material Listing"
					+ " List Components Required" + " List Materials Not Used Anywhere" + " Indented Where Used Listing"
					+ " WO Items ready to produce" + " MRP" + " MRP Shortages" + " MRP Suggested Purchase Orders"
					+ " MRP Suggested Work Orders" + " MRP Reschedules Required" + " Print Product Specification"
					+ " Print Certificate of Analysis" + " Historical QA Test Results"
					+ " Multiple Work Orders Total Cost Inquiry");

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
			List<String> expectedmaintenance = Arrays.asList(" Work Centre" + " Bills Of Material"
					+ " Copy a Bill Of Materials Between Items" + " Master Schedule" + " Auto Create Master Schedule"
					+ " MRP Calculation" + " Quality Tests Maintenance" + " Product Specifications" + " Employees");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays.asList(" Work Centre" + " Bills Of Material"
					+ " Copy a Bill Of Materials Between Items" + " Master Schedule" + " Auto Create Master Schedule"
					+ " MRP Calculation" + " Quality Tests Maintenance" + " Product Specifications" + " Employees");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	public void clickOnGeneralLink() {

		driver.findElement(General_link).click();

	}

}
