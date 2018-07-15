package pageObjectModelTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class EditLeadPage extends WebDriverServiceImpl{

	
	public EditLeadPage(/*EventFiringWebDriver driver, ExtentTest test*/) {
		this.driver= driver;
		this.test= test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="updateLeadForm_companyName")
	WebElement eleCompanyName;
	/*@FindBy(id ="createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id ="createLeadForm_lastName")
	WebElement eleLastName;*/
	@FindBy(xpath="//input[@value='Update']")
	WebElement eleUpdateButton;


	public EditLeadPage typeCompanyName(String varCompName) {
		type(eleCompanyName,varCompName);
		return this;
	}
	
	
	public void clickUpdate() {
		click(eleUpdateButton);
		//return new ViewLeadPage(driver,test);
	}
}
