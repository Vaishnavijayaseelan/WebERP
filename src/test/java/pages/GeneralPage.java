package pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.WebERPFramework.qa.base.BaseClass;

public class GeneralPage extends BaseClass {

	By General_link = By.linkText("General Ledger");

	By Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	By Manager_link = By.linkText("Asset Manager");

	public GeneralPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnGeneralpageLink() {

		driver.findElement(General_link).click();
	}

	public void verifyTransactionsList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays
					.asList("Bank Account Payments Entry" + "Bank Account Receipts Entry" + "Import Bank Transactions"
							+ "Bank Account Payments Matching" + "Bank Account Receipts Matching" + "Journal Entry");

			List<String> actualTransactions = Arrays.asList(
					"Bank Account Payments Entry" + "Bank Account Receipts Entry" + "Import Bank Transactions"
							+ "Bank Account Payments Matching" + "Bank Account Receipts Matching" + "Journal Entry");

			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void verifyInquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("Bank Account Balances"
					+ "Bank Account Reconciliation Statement" + "Check Payments Listing" + "Daily Bank Transactions"
					+ "Account Inquiry" + "Graph of Account Transactions" + "Account Listing"
					+ "Account Listing to CSV File" + "General Ledger Journal Inquiry" + "Trial Balance"
					+ "Balance Sheet" + "Profit and Loss Statement" + "Statement of Cash Flows"
					+ "Financial Statements" + "Horizontal Analysis of Statement of Financial Position"
					+ "Horizontal Analysis of Statement of Comprehensive Income" + "Tag Reports" + "Tax Reports");

			List<String> actualReports = Arrays.asList("Bank Account Balances"
					+ "Bank Account Reconciliation Statement" + "Check Payments Listing" + "Daily Bank Transactions"
					+ "Account Inquiry" + "Graph of Account Transactions" + "Account Listing"
					+ "Account Listing to CSV File" + "General Ledger Journal Inquiry" + "Trial Balance"
					+ "Balance Sheet" + "Profit and Loss Statement" + "Statement of Cash Flows"
					+ "Financial Statements" + "Horizontal Analysis of Statement of Financial Position"
					+ "Horizontal Analysis of Statement of Comprehensive Income" + "Tag Reports" + "Tax Reports");

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
			List<String> expectedmaintenance = Arrays.asList("Account Sections" + "Account Groups" + "GL Accounts"
					+ "GL Account Authorized Users" + "User Authorized GL Accounts" + "GL Budgets" + "GL Tags"
					+ "Bank Accounts" + "Bank Account Authorized Users" + "User Authorized Bank Accounts"
					+ "Maintain Journal Templates");

			// Obtain the actual list of maintenance tasks from your application
			List<String> actualmaintenance = Arrays.asList("Account Sections" + "Account Groups" + "GL Accounts"
					+ "GL Account Authorized Users" + "User Authorized GL Accounts" + "GL Budgets" + "GL Tags"
					+ "Bank Accounts" + "Bank Account Authorized Users" + "User Authorized Bank Accounts"
					+ "Maintain Journal Templates");

			// Assert that the actual list matches the expected list
			Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	public void clickOnManagerLink() {

		driver.findElement(Manager_link).click();

	}

}
