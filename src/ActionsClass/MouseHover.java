package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
	act.moveToElement(men).perform();
	Thread.sleep(2000);
	WebElement jacket = driver.findElement(By.xpath("//a[text()='Jackets']"));
	act.click(jacket).perform();
}
}
