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

public class ReceivablesPage extends BaseClass{
	
	By receivables_link = By.linkText("Receivables");

	By Transactions = By.xpath("//body/section[1]/fieldset[1]/ul[1]/li");

	By Inquiries_and_Reports = By.xpath("//body/section[1]/fieldset[2]/ul/li");

	By Maintenance = By.xpath("//body/section[1]/fieldset[3]/ul/li");

	By purchase_link = By.xpath("//a[contains(text(),'Purchases')]");
	
	public ReceivablesPage () {

		PageFactory.initElements(driver, this);
	}

	public void clickOnReceivablesLink() {
		driver.findElement(receivables_link).click();
	}
	
	public void verifyTransactionsList() {
		List<WebElement> TransList = driver.findElements(Transactions);

		for (WebElement salestrans : TransList) {
			String TransactionsList = salestrans.getText();
			System.out.println(TransactionsList);
			List<String> expectedTransactions = Arrays.asList("Select Order to Invoice"
					+ "Create A Credit Note"
					+ "Enter Customer Payments"
					+ "Allocate Customer Payments or Credit Memos");

			List<String> actualTransactions = Arrays.asList("Select Order to Invoice"
					+ "Create A Credit Note"
					+ "Enter Customer Payments"
					+ "Allocate Customer Payments or Credit Memos");
			Assert.assertEquals(expectedTransactions, actualTransactions);
		}
	}

	public void verifyInquiriesandReportsList() {
		List<WebElement> InqList = driver.findElements(Inquiries_and_Reports);

		for (WebElement salesinq : InqList) {
			String InquiriesandReportsList = salesinq.getText();
			System.out.println(InquiriesandReportsList);
			List<String> expectedReports = Arrays.asList("Where Allocated Inquiry"
					+ "Print Invoices or Credit Notes"
					+ "Print Statements"
					+ "Aged Customer Balances/Overdues Report"
					+ "Re-Print A Deposit Listing"
					+ "Debtor Balances At A Prior Month End"
					+ "Customer Listing By Area/Salesperson"
					+ "List Daily Transactions"
					+ "Customer Transaction Inquiries"
					+ "Customer Activity and Balances");

		
			List<String> actualReports = Arrays.asList("Where Allocated Inquiry"
					+ "Print Invoices or Credit Notes"
					+ "Print Statements"
					+ "Aged Customer Balances/Overdues Report"
					+ "Re-Print A Deposit Listing"
					+ "Debtor Balances At A Prior Month End"
					+ "Customer Listing By Area/Salesperson"
					+ "List Daily Transactions"
					+ "Customer Transaction Inquiries"
					+ "Customer Activity and Balances");

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
			   List<String> expectedmaintenance = Arrays.asList("Add Customer"
			   		+ "Select Customer");
			            
			        

			        // Obtain the actual list of maintenance tasks from your application
			        List<String> actualmaintenance = Arrays.asList("Add Customer"
					   		+ "Select Customer");
			            

			        // Assert that the actual list matches the expected list
			        Assert.assertEquals(expectedmaintenance, actualmaintenance);

		}
	}

	

	public void clickOnPurchaseLink() {

		driver.findElement(purchase_link).click();
	}

		
	
	
	
}
	


