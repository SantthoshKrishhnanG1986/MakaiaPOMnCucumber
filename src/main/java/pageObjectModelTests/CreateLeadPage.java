package pageObjectModelTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeadPage extends WebDriverServiceImpl{

	
	public CreateLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver= driver;
		this.test= test;*/
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="createLeadForm_companyName")
	WebElement eleCompanyName;
	@FindBy(id ="createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id ="createLeadForm_lastName")
	WebElement eleLastName;
	@FindBy(xpath="//input[@value='Create Lead']")
	WebElement eleCreateLead;

	@And ("Enter Company name (.*)")
	public CreateLeadPage typeCompanyName(String varCompName) {
		type(eleCompanyName,varCompName);
		return this;
	}
	@And ("Enter First name (.*)")
	public CreateLeadPage typeFirstName(String varFirstName) {
		type(eleFirstName,varFirstName);
	
		return this;
	}
	@And ("Enter Last name (.*)")
	public CreateLeadPage typeLastName(String varLastName) {
		type(eleLastName,varLastName);
		return this;
	}
	@When ("Click CreateLead")
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage(/*driver,test*/);
	}
}
