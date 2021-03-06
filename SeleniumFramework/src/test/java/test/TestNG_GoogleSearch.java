package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_GoogleSearch {

	//	*******MAin method is Not required for TestNG ********
	//	public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	//		googleSearch();
	//	}

	WebDriver driver=null;

	@BeforeTest
	public void setUpTest(){
		WebDriverManager.chromedriver().version("2.36").setup();
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch(){
		driver.get("http://www.google.com");
		//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("A B C D");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("In Test...");
		}

	@AfterTest
	public void tearDownTest(){
		driver.close();
		driver.quit();
		System.out.println("Test is successful...");
	}
}
