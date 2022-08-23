package aug_maven_2022.aug_maven_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromepath="C:\\Users\\nunep\\Desktop\\Divya\\JAVA Classes\\chromedriver_103\\chromedriver.exe";
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("login1")).sendKeys("SaiDivya");
		Thread.sleep(5000);
		driver.findElement(By.name("passwd")).sendKeys("1234abc");

		
	}

}
