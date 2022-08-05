package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> ele = driver.findElements(By.name("name"));
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++)
		{
			System.out.println(ele.get(i).getAttribute("value"));
		}
	
        driver.quit();
	}

}
