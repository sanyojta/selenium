import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Relative  "//tagName[@attribute ='']
	//	locater=name,id,class
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
		/*driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sanyojita");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kadam");
		//driver.findElement(By.xpath("//button[@name='submit']")).click();
		//attribute
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();*/
		// text(if we have one or two matching or attribute or name or id is not present)
		driver.findElement(By.xpath("//button[contains(text(),'Simple Button')]")).click();
		
		
		
	}

}
