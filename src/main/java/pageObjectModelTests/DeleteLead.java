package pageObjectModelTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class DeleteLead extends PreAndPost{

	@BeforeTest
	public void setValue() {
		testcase = "DeleteLead";
		testdesc= "Deleting a new lead"; 
		author= "Gopi";
		node = "Lead"; 
		fileName = "DeleteLeaddataExcel";
		category = "Deletes";
	}

	@Test(dataProvider="TEST")
	public void deleteLead(String fName) throws InterruptedException {		

		MyHome varMyHome = new MyHome(driver, test);
		varMyHome.clickLeads().clickFindLeadsLink().typeFirstame(fName).clickFindLeads().clickFirstLink().clickDelete();

	}



	@DataProvider(name="UAT1")
	public Object[][] getData1() {
		Object[][] data = new Object[1][5];
		data[0][0] = "man";
		return data;

	}
	/*
	@DataProvider(name="TST",indices= {1})
	public String[][] getData() {
		String[][] data = new String[2][5];
		data[0][0] = "TestLeaf";
		data[0][1] = "sarath";
		data[0][2] = "M";
		data[0][3] = "Sarath@testLeaf.com";
		data[0][4] = "1234567890";

		data[1][0] = "TCS";
		data[1][1] = "govarathan";
		data[1][2] = "s";
		data[1][3] = "govarathan@TCS.com";
		data[1][4] = "9009000122";
		return data;*/
}









