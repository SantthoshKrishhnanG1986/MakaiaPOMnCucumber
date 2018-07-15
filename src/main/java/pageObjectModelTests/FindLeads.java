package pageObjectModelTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class FindLeads extends WebDriverServiceImpl{

	public FindLeads(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver= driver;
		this.test= test;*/
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement eleEmailTab;
	
	@FindBy(name="emailAddress")
	WebElement eleEmailAddtext;
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstResult;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeadButton;
	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleFname;

	public FindLeads clickEmailRab() {
		click(eleEmailTab);
		return this;
	}
	public FindLeads typeFirstame(String fName) {
		type(eleFname,fName);
		return this;
	}
	public FindLeads typeEmailAdd(String email) {
		type(eleEmailAddtext,email);
		return this;
	}
	
	public FindLeads clickFindLeads() {
		click(eleFindLeadButton);
		return this;
	}
	public ViewLeadPage clickFirstLink() {
		click(eleFirstResult);
		return new ViewLeadPage(driver,test);
	}
}
