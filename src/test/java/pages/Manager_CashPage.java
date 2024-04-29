package pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

public class Manager_CashPage extends BaseClass {

	By Manager_link = By.linkText("Asset Manager");

	By Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	By pettycash_link = By.linkText("Petty Cash");
	
	By Petty_Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Petty_Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Petty_Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");
	
	By setup_link = By.linkText("Setup");

	public Manager_CashPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnManagerpageLink() {

		driver.findElement(Manager_link).click();
	}

	public void verifyTransactionsList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays
					.asList("Add a new Asset" + "Select an Asset" + "Change Asset Location" + "Depreciation Journal");

			List<String> actualTransactions = Arrays
					.asList("Add a new Asset" + "Select an Asset" + "Change Asset Location" + "Depreciation Journal");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void verifyInquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays
					.asList("Asset Register" + "My Maintenance Schedule" + "Maintenance Reminder Emails");

			List<String> actualReports = Arrays
					.asList("Asset Register" + "My Maintenance Schedule" + "Maintenance Reminder Emails");

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
			List<String> expectedmaintenance = Arrays.asList("Fixed Asset Category Maintenance"
					+ "Add or Maintain Asset Locations" + "Fixed Asset Maintenance Tasks");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays.asList("Fixed Asset Category Maintenance"
					+ "Add or Maintain Asset Locations" + "Fixed Asset Maintenance Tasks");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	public void clickOnpettyCashLink() {

		driver.findElement(pettycash_link).click();

	}

	public void verifypetty_TransactionsList() {
		List<WebElement> TransList = driver.findElements(Petty_Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays
					.asList("Assign Cash to PC Tab"
							+ "Transfer Assigned Cash Between PC Tabs"
							+ "Claim Expenses From PC Tab"
							+ "Authorise Expenses"
							+ "Authorise Assigned Cash");

			List<String> actualTransactions = Arrays.asList("Assign Cash to PC Tab"
					+ "Transfer Assigned Cash Between PC Tabs"
					+ "Claim Expenses From PC Tab"
					+ "Authorise Expenses"
					+ "Authorise Assigned Cash"
					);

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void verifypetty_InquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Petty_Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("PC Tab General Report"
					+ "PC Expense General Report"
					+ "PC Tab Expenses List"
					+ "PC Expenses Analysis");

			List<String> actualReports = Arrays.asList("PC Tab General Report"
					+ "PC Expense General Report"
					+ "PC Tab Expenses List"
					+ "PC Expenses Analysis");

			Assert.assertEquals(expectedReports, actualReports);

		}

	}

	public void verifypetty_MaintenanceList() {
		List<WebElement> mainList = driver.findElements(Petty_Maintenance); 

		// Iterate over the list of elements
		for (WebElement salesmain : mainList) {
			// Get the text of each element
			String maintenancelist = salesmain.getText();
			System.out.println(maintenancelist);
			List<String> expectedmaintenance = Arrays.asList("Types of PC Tabs"
					+ "PC Tabs"
					+ "PC Expenses"
					+ "Expenses for Type of PC Tab");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays.asList("Types of PC Tabs"
					+ "PC Tabs"
					+ "PC Expenses"
					+ "Expenses for Type of PC Tab");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	public void clickOnsetupLink() {

		driver.findElement(setup_link).click();

	}


}
