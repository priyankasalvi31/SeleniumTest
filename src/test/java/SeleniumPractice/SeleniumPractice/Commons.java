package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commons {
    
    public static String path = "C:\\Users\\Priyanka\\eclipse-workspace\\chromedriver.exe";
    protected static WebDriver driver;
    public static void setpath()
    {
    System.setProperty("webdriver.chrome.driver", path);
    driver = new ChromeDriver();
    }
	

	public static void main(String[] args) {
		

	}

}
