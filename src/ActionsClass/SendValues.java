package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValues {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	WebElement search_field = driver.findElement(By.id("small-searchterms"));
	WebElement search_button = driver.findElement(By.xpath("//input[@value='Search']"));
	act.sendKeys(search_field, "book").moveToElement(search_button).click().perform();
	

}
}
