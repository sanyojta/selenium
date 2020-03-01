import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_practice_reg {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("sanyojita");
		driver.findElement(By.name("lastName")).sendKeys("kadam");
		driver.findElement(By.name("phone")).sendKeys("9422870931");
		
		driver.findElement(By.name("userName")).sendKeys("sanyojitaynk26@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("ivy botanica");
		driver.findElement(By.name("city")).sendKeys("pune");
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		driver.findElement(By.name("postalCode")).sendKeys("41001");
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("INDIA ");
		
		driver.findElement(By.name("email")).sendKeys("sanyojita");
		driver.findElement(By.name("password")).sendKeys("sanyojita");
		driver.findElement(By.name("confirmPassword")).sendKeys("sanyojita");
		driver.findElement(By.name("register")).click();
		
		
		
		
		
	}

}
