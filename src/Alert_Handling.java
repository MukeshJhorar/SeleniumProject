import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click the button to display an alert box:']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
//		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(text(),'Input Alert')]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[contains(text(),'Click the button to demonstrate the Input box.')]")).click();
		alert.sendKeys("Mukesh Kumar");
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		alert.accept();
//		alert.dismiss();
	}
}
