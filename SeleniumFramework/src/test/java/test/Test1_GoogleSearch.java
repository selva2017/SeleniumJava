package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}

	public static void googleSearch(){
		WebDriverManager.chromedriver().version("2.36").setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("A B C D");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test is successful...");
	}
}
