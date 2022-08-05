package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Accessingforms extends Commons{

	public static void main(String[] args) {
		String tie = null;
		setpath();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/login.html";
		
		
		//WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement email =driver.findElement(By.name("email"));
		WebElement password =driver.findElement(By.name("passwd"));
	    email.sendKeys("abcd@gmail.com");
	    password.sendKeys("abcdefghlkjl");
	 WebElement login =   driver.findElement(By.id("SubmitLogin"));
	login.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
String title=	driver.findElement(By.xpath("/html/body/div[4]/div/div/h3")).getText();
	System.out.println(title);
	driver.quit();
	
	
	}

}

