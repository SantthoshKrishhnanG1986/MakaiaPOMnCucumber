package pageObjectModelTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLeadPage extends WebDriverServiceImpl{

	public DuplicateLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	@FindBy(xpath="//input[@value='Create Lead']")
	WebElement eleCreateLead;
	
	@FindBy(id ="createLeadForm_firstName")
	WebElement eleFirstName;

	public DuplicateLeadPage typeFirstName(String varFirstName) {
		type(eleFirstName,varFirstName);
		return this;
	}
	public void clickCreateLead() {
		click(eleCreateLead);
		//return new ViewLeadPage(driver,test);
	}	
}
