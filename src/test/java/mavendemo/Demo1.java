package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	@Test
	public void teardown() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
	//WebDriver driver =WebDriverManager.chromedriver().create();
	WebDriver wd = WebDriverManager.chromedriver().create();
	//WebDriver driver = new ChromeDriver();
			wd.get("https://facebook.com");
	wd.manage().window().maximize();
	Thread.sleep(5000);
		
		
	}
}
	