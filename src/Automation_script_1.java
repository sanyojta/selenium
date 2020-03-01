import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_script_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		WebElement textdata=driver.findElement(By.name("first_name"));
		textdata.sendKeys("sanyojita");
		WebElement textdata1=driver.findElement(By.name("last_name"));
		textdata1.sendKeys("Kadam");
		WebElement textdata2=driver.findElement(By.name("email"));
		textdata2.sendKeys("sanyojitaynk26@.gnail.com");
		WebElement textdata3=driver.findElement(By.name("phone"));
		textdata3.sendKeys("9422870931");
		WebElement textdata4=driver.findElement(By.name("address"));
		textdata4.sendKeys("Ivy Estate");
		WebElement textdata5=driver.findElement(By.name("city"));
		textdata5.sendKeys("pune");
		  
		Select dropdown = new Select(driver.findElement(By.name("state")));
		dropdown.selectByVisibleText("Indiana"); 
		
		WebElement textdata6=driver.findElement(By.name("city"));
		textdata5.sendKeys("pune");
	}

}
