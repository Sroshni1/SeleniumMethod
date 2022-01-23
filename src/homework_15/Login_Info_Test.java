package homework_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Info_Test {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver","/Users/shanjidaroshni/eclipse-workspace/LearningSelinium/driver/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.bestbuy.com/identity/signin?token=tid%3A00289f2e-6df5-11ec-99ea-0a6ebb948abf");
	}
	
	@Test(enabled=false,priority=2)
	public void logInInfoTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='fld-e']")).sendKeys("roshnihaque29@gmail.com");
		driver.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys("secret111000*#");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='fld-e']")).clear();
		driver.findElement(By.xpath("//input[@id='fld-p1']")).clear();
		
	}
	
	@Test(enabled=true,priority=1)
	public void logInInfoTest01() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='fld-e']")).sendKeys("roshnihaque29@gmail.com");	
		driver.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys("secret111000*#");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id=\"fld-e\"]")).click();
	    //driver.getElement(By.xpath("//input[@id=\"fld-e\"]")).clear_field();
	   // driver).get_element_by_id("//*[@id=\"fld-e\"]").clear_field();
	    //Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='fld-e']")).sendKeys("roshnihaque30@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"fld-p1\"]")
	   // Thread.sleep(5000);
	}
	  @AfterTest
	   
	    public void tearUp() {
	  driver.quit();


	  }
}
