package login.page;

public class DemoHRM extends Login_Functionaly{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Rakesh_sir_new_eclipse\\Rishi Sir Selenium Project\\Drivers\\chromedriver.exe");

//		Login_Functionaly login = new Login_Functionaly();
		DemoHRM demo = new DemoHRM();
		demo.login_navigate();
//		login.login_navigate();

	}
}
