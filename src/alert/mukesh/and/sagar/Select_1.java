package alert.mukesh.and.sagar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// URL
		driver.get("https://www.facebook.com");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select select = new Select(day);
//		select.selectByIndex(1);
//		select.selectByValue("5");
		select.selectByVisibleText("10");
		
		
//		driver.findElement(By.xpath("//select"))
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
