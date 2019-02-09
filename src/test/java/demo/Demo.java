package demo;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void testCase() {
		System.out.println("TestNG === Maven === Jenkins");
		for (int i = 1; i <= 10; i++) {
			System.out.println("I ==== " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title ====>"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		System.out.println("Title has Facebook in it..");
		driver.quit();
		
	}
}
