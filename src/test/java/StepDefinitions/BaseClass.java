package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class BaseClass {

public static WebDriver driver;
	@Before
	public void setup()
	{
		
		if(driver==null)
		{
			System.out.println("In Base const : ");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(driver);
		}
	}
	
}
