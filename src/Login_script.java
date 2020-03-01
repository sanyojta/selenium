import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select dropdown= new Select(driver.findElement(By.id("select-demo")));
		dropdown.selectByVisibleText("Sunday");
		Select dropdown1= new Select(driver.findElement(By.id("multi-select")));
		dropdown1.selectByValue("California");
		Thread.sleep(2000);
		dropdown1.selectByIndex(2);
		Thread.sleep(2000);
		dropdown1.selectByValue("Texas");
		Thread.sleep(2000);
		//dropdown1.deselectAll();
		
		driver.findElement(By.id("printMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("printAll")).click();
		Thread.sleep(2000);
		driver.close();//close the current browser,quite() to close the child window
	}

}
