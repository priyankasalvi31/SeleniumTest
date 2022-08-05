package SeleniumPractice.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions extends Commons {

	public static void main(String[] args) {
	setpath();
String baseUrL = "https://demoqa.com/menu/";
driver.manage().window().maximize();
driver.get(baseUrL);
System.out.println("Demo webpage displayed");
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
Actions actions = new Actions(driver);

WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
//Mouse hover menuOption 'Music'
actions.moveToElement(menuOption).perform();
System.out.println("Done Mouse hover on 'Music' from Menu");
driver.quit(); 	


	}

}
