package tatkal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TatKalBooking {
	static Logger LOGGER = LoggerFactory.getLogger(TatKalBooking.class);
	static final String URL="https://www.irctc.co.in/";
	static final String USERID_P="//*[@id=\"usernameId\"]";
	static final String PSWD_P="//*[@id=\"loginFormId\"]/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/input";
	
	/*static final String USERID_V="logusarav";
	static final String PSWD_V="dhanam";*/
	
	static final String USERID_V="vikirobot";
	static final String PSWD_V="1Vikirobot";
	
	static final String FROMSTATION_P="//*[@id=\"jpform:fromStation\"]";
	static final String TOSTATION_P="//*[@id=\"jpform:toStation\"]";
	static final String JOURNEYDATE_P="//*[@id=\"jpform:journeyDateInputDate\"]";
	
	/*static final String FROMSTATION_V="CHENNAI CENTRAL - MAS";
	static final String TOSTATION_V="NAMAKKAL - NMKL";
	static final String JOURNEYDATE_V="09-07-2016";
	*/
	
	static final String FROMSTATION_V="TIRUNELVELI - TEN";
	static final String TOSTATION_V="CHENNAI CENTRAL - MAS";
	static final String JOURNEYDATE_V="08-07-2016";
	//static final String SUBMIT_P="//*[@id=\"jpform:jpsubmit\"]";
	
	static final String SUBMIT_P="//*[@id=\"jpform:jpsubmit\"]";
/*	static final String ="";
	static final String ="";
	static final String ="";
	static final String ="";*/
	
	
	static WebDriver driver  ;
	
	
	public static void main(String...args) {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		LOGGER.info("Opening irctc...");
		
		driver.navigate().to(URL);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(USERID_P)));
		
		
			
		WebElement username=driver.findElement(By.xpath(USERID_P));
		username.clear();
		username.sendKeys(USERID_V);
		WebElement pswd=driver.findElement(By.xpath(PSWD_P));
		pswd.clear();
		pswd.sendKeys(PSWD_V);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FROMSTATION_P)));
		LOGGER.info("Logged in...");
		
		WebElement from=driver.findElement(By.xpath(FROMSTATION_P));
		from.clear();
		from.sendKeys(FROMSTATION_V);
		WebElement to=driver.findElement(By.xpath(TOSTATION_P));
		to.clear();
		to.sendKeys(TOSTATION_V);
		WebElement date=driver.findElement(By.xpath(JOURNEYDATE_P));
		date.clear();
		date.sendKeys(JOURNEYDATE_V);
		
		WebElement sub=driver.findElement(By.xpath(SUBMIT_P));
		sub.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FROMSTATION_P)));
		LOGGER.info("Logged in...");
		
		WebElement from=driver.findElement(By.xpath(FROMSTATION_P));
		from.clear();
		from.sendKeys(FROMSTATION_V);
		WebElement to=driver.findElement(By.xpath(TOSTATION_P));
		to.clear();
		to.sendKeys(TOSTATION_V);
		WebElement date=driver.findElement(By.xpath(JOURNEYDATE_P));
		date.clear();
		date.sendKeys(JOURNEYDATE_V);
		
		
		

	}

}
