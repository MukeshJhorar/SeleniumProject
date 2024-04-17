import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Displayed_Selected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		WebElement checkBox = driver.findElement(By.xpath("//label[@class='relative']"));
//		boolean boxNotSelected = checkBox.isSelected();
//		System.out.println(boxNotSelected);
		checkBox.click();
		boolean boxSelected = checkBox.isSelected();
		System.out.println(boxSelected);

	}
}
