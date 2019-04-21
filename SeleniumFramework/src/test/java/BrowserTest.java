import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {

		//		----- Handling browser without Webdriver Manager
		//		System.setProperty("webdriver.gecko.driver", "C:/Java_Selenium/SeleniumFramework/drivers/geckodriver/geckodriver.exe");
		//		System.setProperty("webdriver.chrome.driver", "C:/Java_Selenium/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		//		System.setProperty("webdriver.ie.driver", "C:/Java_Selenium/SeleniumFramework/drivers/iedriver/IEDriverServer.exe");
		//		WebDriver driver = new FirefoxDriver();
		//		WebDriver driver = new ChromeDriver();
		//		WebDriver driver = new InternetExplorerDriver();
		//		WebDriver driver = new ChromeDriver();
		//		driver.get("https://www.seleniumhq.org/");

		//		----- Handling browser without Webdriver Manager
		//		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().version("2.36").setup();
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriverManager.operadriver().setup();
		//		WebDriverManager.phantomjs().setup();
		//		WebDriverManager.edgedriver().setup();
		//		WebDriverManager.iedriver().setup();
		WebDriver driver = new ChromeDriver();
		//		driver.get("https://www.seleniumhq.org/");
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("A B C D");

		//		WebElement textBox = driver.findElement(By.id("lst-ib"));
		//		textBox.sendKeys("Automation step by step");

		List<WebElement> listOfInputElements =driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("Count of input elements = "+count);
		//		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}
}
