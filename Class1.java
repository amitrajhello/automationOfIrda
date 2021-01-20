package package1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {
	
	public static void main(String[] args) throws InterruptedException {

		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C://Users//raja6//Desktop//selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		//launching the specified URL
		driver.get("https://iiiindia.org.in/app#/workspace/br593/gr741/");
		Actions actions = new Actions(driver);
		
		WebElement mobileNumber = driver.findElement(By.name("validateLoginId"));
		mobileNumber.sendKeys("7542988802");
		
		driver.findElement(By.xpath("//button[2]/span[text()='Next']")).click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@id='input_3']"));
		password.click();
		password.sendKeys("changeme");
		
		driver.findElement(By.xpath("//button[@class='md-raised nextBtnForSignin md-button md-default-theme md-ink-ripple'][2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='fontWhtNormal ellipsisText ng-binding'][contains(.,'Corporate Agent - Composite - Specified Person_Fresh ')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-binding ng-scope'][contains(.,'Chapter 1 - Introduction to Insurance')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-binding ng-scope'][contains(.,'Notes')]")).click();		
		
		WebElement nextButton = driver.findElement(By.xpath("//button/md-icon[@aria-label='Next Icon']"));
		WebElement previousButton = driver.findElement(By.xpath("//button/md-icon[@aria-label='Previous Icon']"));		
		
		try{
			while(true){
				
				Thread.sleep(50000);
				actions.moveToElement(nextButton).perform();
				Thread.sleep(2000);
				nextButton.click();
				Thread.sleep(100000);
				actions.moveToElement(previousButton).perform();
			}
		}
		catch(Exception e){
			
				try{
					while(true){
						
						Thread.sleep(50000);
						actions.moveToElement(nextButton).perform();
						Thread.sleep(2000);
						previousButton.click();
						Thread.sleep(100000);
						actions.moveToElement(previousButton).perform();
					}
				}
				catch(Exception f){
					driver.close();
					main(new String[]{"Anakin"});
				}		
		}
	
	}
}


