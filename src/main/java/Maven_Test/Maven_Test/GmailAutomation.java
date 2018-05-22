package Maven_Test.Maven_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\Maven_Test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
