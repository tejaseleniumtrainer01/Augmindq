package aug_maven_2022.aug_maven_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String chromepath="C:\\Users\\jaswa\\OneDrive\\Desktop\\selenium\\chromedriver_104\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	
		WebElement uid=driver.findElement(By.id("password"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style',arguments[1]);",uid,"color:red;border:8px solid red");
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style',arguments[1]);",uid,"");
	}

}
