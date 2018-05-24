package Maven_Test.Maven_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailAutomation {
	
	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\Maven_Test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
