package pageObjectModelTests;

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
		
		
		MyHome varMyHome = new MyHome(driver, test);
		varMyHome.clickLeads().clickFindLeadsLink().typeFirstame(fName).clickFindLeads().clickFirstLink().clickEditLead().typeCompanyName(cName).clickUpdate();
		
			
	}
}
