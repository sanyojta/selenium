import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("sanyojita");
		driver.findElement(By.id("lastname")).sendKeys("kadam");
		driver.findElement(By.name("submit")).click();
		List <WebElement> list= driver.findElements(By.name("sex"));
		System.out.println(list);
		list.get(1).click();
		
		List <WebElement> list1= driver.findElements(By.name("exp"));
		System.out.println(list1);
		System.out.println(list1.size());
		list.get(1).click();

		
		
		
		
		
		
}
	

}
