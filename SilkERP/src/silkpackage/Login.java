package silkpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Latesh chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://uat.stage.silkdemo.in/login?site=silkerp2");
		
		driver.findElement(By.name("userid")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("silk@2023");
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary.btn-block")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"categoriesBlock\"]/div[1]/a")).click();
		System.out.println("Clicked");
		
		//JavaScriptexecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		
		//taskbook module clicked

		driver.findElement(By.xpath("//*[@id=\"tilesContainer\"]/div/div[1]/div/div[4]/div[3]/div[2]/a/div[2]")).click();		 
		System.out.println("Test Ok");  // scroll down and clicked
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		System.out.println("Iframe");
		driver.findElement(By.id("toolbtn_createActiveTask")).click();
		System.out.println("Test clicked");  //add task button pressed
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[contains(@class, 'field-ref_id')]")).click();
		
//		driver.findElement(By.id("toolbtn_loadOpenTasks")).click();
//		System.out.println("Open tab clicked");
		
	}

}
