import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
       String title= driver.getTitle();
       System.out.println(title);
       
       driver.findElement(By.linkText("Selenium Easy")).click();
       System.out.println(driver.getCurrentUrl());
       System.out.println(title);
       
	}

}
