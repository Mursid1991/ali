package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLunch {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Java Programs\\Orangehrm\\Driver\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
    driver.quit();
    
    
    
	}

}
