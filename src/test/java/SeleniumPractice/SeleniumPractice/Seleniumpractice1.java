package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanka\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		String ExpectedTitle = "Google";
		if(actualtitle.contentEquals(ExpectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
