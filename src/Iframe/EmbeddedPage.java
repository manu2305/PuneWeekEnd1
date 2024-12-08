package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmbeddedPage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.dream11.com/");
	WebElement iframe = driver.findElement(By.id("send-sms-iframe"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.id("regEmail")).sendKeys("7358001111");
}
}
