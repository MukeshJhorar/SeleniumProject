import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uncodemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='close-chat']")).click();
		WebElement categeory = driver.findElement(By.xpath("//span[text()='CATEGORIES']"));
		Actions act = new Actions(driver);
		act.moveToElement(categeory).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#'][contains(text(), 'Software Testing')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='has'][contains(text(), 'Manual Testing')]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
