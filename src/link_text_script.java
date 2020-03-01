import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text_script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Radical_soft_file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        List <WebElement> list= driver.findElements(By.tagName("a"));
        System.out.println(list);
        for (WebElement webElement : list) 
        {
			System.out.println(webElement.getText()+"="+webElement.getAttribute("href"));
		}
        
  
  
	}

}
