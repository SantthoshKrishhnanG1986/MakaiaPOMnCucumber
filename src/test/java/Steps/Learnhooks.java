package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class Learnhooks extends WebDriverServiceImpl{
	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println("Start Before");
		startReport();
		startTestCase(sc.getName(), sc.getId());
		startTestModule("test node");

//		test.assignCategory("Smoke");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		test.assignAuthor("Santthosh and Madhan");
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		type(locateElement("id", "username"), "DemoSalesManager");	
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
		System.out.println("End of before scenario");

	}
	@After
	public void afterScenario(Scenario sc) {
		System.out.println("Start after scenario");
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
		System.out.println("End of after scenario");
		driver.close();
		endResult();
	}
}
