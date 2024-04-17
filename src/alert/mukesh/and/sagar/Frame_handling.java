package alert.mukesh.and.sagar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// URL
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Simple Alert']")).click();
		//frame handling by index
//		driver.switchTo().frame(1);
		
		//frame handling by name OR id
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		driver.findElement(By.xpath("This element is in iframe - //button[@onclick='myFunction()']")).click();
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//a[normalize-space()='Input Alert']")).click();
	}
}
