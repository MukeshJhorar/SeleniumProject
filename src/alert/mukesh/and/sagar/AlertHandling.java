package alert.mukesh.and.sagar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// URL
//		driver.get("https://demoqa.com/alerts");
//		driver.get("https://www.facebook.com");
		driver.get("https://www.amazon.in/");
		

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//		
//		
//	    Alert alert  = driver.switchTo().alert();
//	    Thread.sleep(5000);
//	    //accept method of alert
//	    String text1 = alert.getText();
//	    System.out.println(text1);
//	    alert.accept();
//		
	    //scroll upto Pixel
	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("window.scrollBy(0, 200)");
	    
	    
//	    WebElement element = driver.findElement(By.xpath("//a[@class='ns-p3hfe-e-7 milo-fore-adv-image-title-highlight']"));
	    
	    //scroll by element
//	    js.executeScript("arguments[0].scrollIntoView();", element);
	    
//	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    
	    //actions class
	    Actions action = new Actions(driver);
	   
	    
//		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
//		Thread.sleep(7000);
//		String text2 = alert.getText();
//		System.out.println(text2);
//		alert.accept();
//		
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		Thread.sleep(2000);
//		String text3 = alert.getText();
//		System.out.println(text3);
//		alert.dismiss();
//		
//		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
//		Thread.sleep(2000);
//		String text4 = alert.getText();
//		System.out.println(text4);
//		alert.sendKeys("Mukesh");
//		String textName = alert.getText();
//		System.out.println(textName);
//		Thread.sleep(2000);
//		alert.accept();
		
		
		
		
		
		

	}
}
