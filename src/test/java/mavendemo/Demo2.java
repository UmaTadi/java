package mavendemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	@Test
	public void setup() throws InterruptedException {
		WebDriver wd = WebDriverManager.chromedriver().create();
		wd.get("https:\\amazon.com");
		wd.manage().window().maximize();
		Thread.sleep(5000);
	}

}
