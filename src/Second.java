//import org.openqa.selenium.By;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']//span[text()='Buzz']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']")).sendKeys("Mukesh kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/a[text()='Logout']")).click();
	
	
	}
}
