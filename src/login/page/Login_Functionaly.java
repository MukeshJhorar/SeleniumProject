package login.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Functionaly {

	WebDriver driver = new ChromeDriver();
	
	void login_navigate() throws InterruptedException {
		

//		Thread.sleep(5000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

//		Thread.sleep(20000);
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");

		// explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(100000);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

//		wait.until(ExpectedConditions.presenceOfElementLocated));

//		driver.manage().window().maximize();
//		WebElement web =  driver.findElement(By.xpath("")).eys("Admin");

//		driver.findElement(By.xpath("")).click();
		driver.quit();

	}
	
	void login() {
		driver.findElement(By.xpath(""));
	}
	
	
}
