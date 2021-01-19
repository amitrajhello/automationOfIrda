package package1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
	public static void main(String[] args) throws InterruptedException {

	//Setting system properties of ChromeDriver
	System.setProperty("webdriver.chrome.driver", "C://Users//raja6//Desktop//selenium//chromedriver_win32//chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	//Specifiying pageLoadTimeout and Implicit wait
//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	Thread.sleep(1000);
	
	//launching the specified URL
	driver.get("https://iiiindia.org.in/app#/workspace/br593/gr741/");
	
	WebElement mobileNumber = driver.findElement(By.name("validateLoginId"));
	mobileNumber.sendKeys("7542988802");
	
	driver.findElement(By.xpath("//button[2]/span[text()='Next']")).click();
	Thread.sleep(3000);
	WebElement password = driver.findElement(By.xpath("//input[@id='input_3']"));
	password.click();
	password.sendKeys("changeme");
	
	driver.findElement(By.xpath("//button[@class='md-raised nextBtnForSignin md-button md-default-theme md-ink-ripple'][2]")).click();
	
	//div[@class='fontWhtNormal ellipsisText ng-binding'][contains(.,'Corporate Agent - Composite - Specified Person_Fresh ')]
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='fontWhtNormal ellipsisText ng-binding'][contains(.,'Corporate Agent - Composite - Specified Person_Fresh ')]")).click();
	
	//span[@class='ng-binding ng-scope'][contains(.,'Chapter 1 - Introduction to Insurance')]
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='ng-binding ng-scope'][contains(.,'Chapter 1 - Introduction to Insurance')]")).click();
	
	
	//span[@class='ng-binding ng-scope'][contains(.,'Notes')]
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='ng-binding ng-scope'][contains(.,'Notes')]")).click();
	
	
	//button[@class="md-fab nextNode md-accent nodeNavigationBtn md-button ng-scope md-default-theme md-ink-ripple"]
	for(int i=1;i<=10000;i++){
		Thread.sleep(1200000);
		driver.findElement(By.xpath("//button[@class='md-fab nextNode md-accent nodeNavigationBtn md-button ng-scope md-default-theme md-ink-ripple']")).click();
	}
	
	
	
	//WebElement button = driver.findElement(By.xpath("//button[@class="md-raised nextBtnForSignin md-button md-default-theme md-ink-ripple"]/span[text()="Next"]"));
	
	
	//Locating the elements using name locator for the text box
//	driver.findElement(By.name("q")).sendKeys("YouTube");

	
	
	}
}


