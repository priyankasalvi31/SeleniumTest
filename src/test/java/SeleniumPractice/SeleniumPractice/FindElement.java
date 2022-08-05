package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://demo.guru99.com/test/ajax.html");
        driver.findElement(By.id("no")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("buttoncheck")).click();
        driver.close();
        
	}

}
