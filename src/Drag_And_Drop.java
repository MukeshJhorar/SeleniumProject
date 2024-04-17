import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		Actions action = new Actions(driver);
		
		WebElement drag =  driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
		
//		action.dragAndDrop(drag, drop).perform();
		action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(5000);
//		driver.quit();
		
		
	}
}
