package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {

	private static WebDriver driver;
//	private static WebDriverManager driver1;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		googleSearchTest();
	}
	public static void googleSearchTest() throws Exception{
//		driver1 = WebDriverManager.chromedriver();
//		driver1.version("2.36").setup();
		WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		driver.get("http://www.google.com");
		searchPageObj.setTextInSearchBox("ABCD");
		Thread.sleep(1000);
		searchPageObj.clickSearchButton();
		Thread.sleep(1000);
		driver.close();
	}
}
