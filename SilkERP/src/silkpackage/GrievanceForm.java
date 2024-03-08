package silkpackage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GrievanceForm {
	
ChromeDriver driver;
WebDriverWait wait;

	@BeforeTest
	public void before() {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Latesh chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://uat.stage.silkdemo.in/login?site=silkerp2");
		driver.findElement(By.name("userid")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("silk@2023");
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary.btn-block")).click();
		
	}

	@Test
	public void test() {
		
		WebElement element = driver.findElement(By.xpath("//*[@id='tilesContainer']/div/div[1]/div/div[2]/div[1]/div/a[1]"));
        element.click();
        WebElement myGrievanceLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(), 'My Grievance')]")));
        myGrievanceLink.click();  
	}
}
