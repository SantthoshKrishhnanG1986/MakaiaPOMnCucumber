package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadsClass {
/*	WebDriver driver;
	@Given ("Launch browser for URL (.*)")
	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And ("enter username (.*)")
	public void username(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@And ("enter password (.*)")
	public void password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@And ("click Login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@And ("click crmsfa")
	public void clickcrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And ("click Leads")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	//Create Lead
	@And ("click CreateLead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And ("Enter Company name (.*)")
	public void enterCname(String varCname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(varCname);
	}
	@And ("Enter First name (.*)")
	public void enterFname(String varFname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(varFname);
	}
	@And ("Enter Last name (.*)")
	public void enterLname(String varLname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(varLname);
	}
	
	@When ("Click CreateLead")
	public void clickCreateLeadButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
	////span[@id='viewLead_companyName_sp']
	
	@Then ("verify company name (.*)")
	public void verifyViewPage(String var) {
		String screenVal = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(screenVal.contains(var)) {
			System.out.println("Success");
		}
		else
			System.out.println("Failure");
	}*/
	
}
