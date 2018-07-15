package pageObjectModelTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl{

	//private static final String xpathCreateLead = "//input[@value='Create Lead']";
	public ViewLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver= driver;
		this.test= test;*/
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="viewLead_companyName_sp")
	WebElement eleCName;

	@FindBy(linkText ="Edit")
	WebElement eleEditButton;
	
	@FindBy(linkText ="Delete")
	WebElement eleDeleteButton;
	
	@FindBy(linkText ="Duplicate Lead")
	WebElement eleDuplicateButton;
	
	//EditLeadPage
	
	
	public EditLeadPage clickEditLead() {
		click(eleEditButton);
		return new EditLeadPage(/*driver,test*/);
	}
	
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateButton);
		return new DuplicateLeadPage(/*driver,test*/);
	}
	public void clickDelete() {
		click(eleDeleteButton);
		//return new MyLeads(driver,test);
	}
	@Then ("verify company name (.*)")
	public void verifyCompanyName(String varCName) {
		verifyPartialText(eleCName, varCName);
		
	}

}
