package homework_15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_navigate_to_back_forward_refresh_methods {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","/Users/shanjidaroshni/eclipse-workspace/LearningSelinium/driver/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.buybuybaby.com");
	Thread.sleep(4000);

	}



	@Test(enabled=true,priority=1)

	public void TestField() throws InterruptedException {
		driver.navigate().to("http://www.collin.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		
	}
	
	

	    @AfterTest
	   
	    public void tearUp() {
	driver.quit();

	}

	}



