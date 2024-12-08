package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement jdk = driver.findElement(By.linkText("jdk-17.0.13_linux-x64_bin.rpm"));
	js.executeScript("arguments[0].scrollIntoView(false);", jdk);
	Thread.sleep(2000);
	jdk.click();
	Thread.sleep(2000);
	WebElement disableElement = driver.findElement(By.linkText("Download jdk-17.0.13_linux-x64_bin.rpm"));
	js.executeScript("arguments[0].click();", disableElement);
}
}
