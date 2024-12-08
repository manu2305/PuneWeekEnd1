package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
	act.contextClick(right_click).click(delete).perform();
}
}
