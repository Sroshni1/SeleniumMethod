package com.collin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/shanjidaroshni/eclipse-workspace/JavaSeleniumMethods/browser/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.collin.edu/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("cougar Q");
	driver.findElement(By.xpath("//input[@id='search']")).clear();
	}

}
