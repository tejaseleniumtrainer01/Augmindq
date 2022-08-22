package aug_maven_2022.aug_maven_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\tejas\\Desktop\\sindhuramitva.html";
		ExtentReports report=new ExtentReports(path,true);
		ExtentTest logger=report.startTest("Testingg rediff login","Verifying loging page");
		
		String exepath="C:\\Users\\tejas\\Desktop\\Selenium\\chrome104\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver=new ChromeDriver();
		logger.log(LogStatus.INFO, "Chrome browser was launched");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		logger.log(LogStatus.PASS, "Rediff login page was opened");
		
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "browser was maximized");
		
		driver.findElement(By.id("login1")).sendKeys("Teja");
		logger.log(LogStatus.PASS, "Enetred data in the uid field");
		
		driver.findElement(By.id("password")).sendKeys("Teja1234");
		logger.log(LogStatus.PASS, "Enetred data in the password field");
		
		driver.findElement(By.name("proceed")).click();
		logger.log(LogStatus.PASS, "Clicked on the signin button");
		logger.log(LogStatus.FAIL, "unable to see home page");
		
		report.endTest(logger);
		report.flush();
		report.close();
	}

}
