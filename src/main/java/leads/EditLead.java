package leads;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost {

	
	@BeforeTest
	public void setValue() {
		testcase = "EditLead";
		testdesc= "Editing a new lead"; 
		author= "Gopi";
		node = "Lead"; 
		fileName = "EditLeaddataExcel";
		category = "Editing";
	}
	@Test(dataProvider="TEST")
	public void editLead(String fName, String cName) throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));				
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), fName);
		click(locateElement("xpath", "//button[text()='Find Leads']"));		
		String leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("link", "Edit"));		
		type(locateElement("id", "updateLeadForm_companyName"), cName);
		click(locateElement("class", "smallSubmit"));
		/*click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), leadID);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), cName);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
