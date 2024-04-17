import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_By_Rishi_Sir {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 200)");
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		Thread.sleep(7000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col']//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		alert.accept();
//		alert.dismiss();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		alert.sendKeys("Mukesh kumar");
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
