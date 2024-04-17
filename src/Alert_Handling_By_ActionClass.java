import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Handling_By_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[@id='promtButton']"))).click().perform();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Mukesh Kumar");
		Thread.sleep(2000);
		alert.accept();
		
	}
}
