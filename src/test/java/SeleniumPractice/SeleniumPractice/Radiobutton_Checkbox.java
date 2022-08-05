package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton_Checkbox extends Commons {

	public static void main(String[] args)  {
		
setpath();
String baseUrl1 = "http://demo.guru99.com/test/radio.html";
String baseURL2 = "http://demo.guru99.com/test/facebook.html";

driver.get(baseUrl1);
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
radio1.click();
String radiotext =radio1.getAttribute("value");
System.out.println(radiotext);

try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement check = driver.findElement(By.id("vfb-6-0"));
check.click();
if (check.isSelected())

{
	System.out.println(check.getAttribute("value"));
}

driver.get(baseURL2);
WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
for (int i=0; i<2; i++) {											
    chkFBPersist.click (); 			
    System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
}	




driver.get("http://jsbin.com/osebed/2");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Select fruits = new Select(driver.findElement(By.id("fruits")));

List<WebElement> fruit1 =fruits.getOptions();
for(WebElement options : fruit1)
{
	System.out.println("Options " +options.getText());
	
	}
System.out.println("Select the Option by Text Orange");

fruits.selectByVisibleText("Orange");

System.out.println("Select value is:"+fruits.getFirstSelectedOption());




driver.quit();
	}

}
