import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();
        
        Alert alert=driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
        Thread.sleep(3000);
        alert.sendKeys("Hello pune");
        Thread.sleep(3000);
        alert.accept();
        
        
        
	}

}
