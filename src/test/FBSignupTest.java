package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		System.out.println("The title of the page is " + driver.getTitle());

		WebElement signUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUp.click();
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		fName.sendKeys("Ehaan");
		lName.sendKeys("Zayn");
		mobile.sendKeys("9876543210");
		password.sendKeys("Abc@1234");

WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("The default day is " + selectedDay.getText());
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("12");
		
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Apr");
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("2022");

         String Gender = "Male";
	
		
		String newXpath = "//label[text()='" + Gender + "']";
		
		WebElement genderElem = driver.findElement(By.xpath(newXpath));
		genderElem.click();
		
	}

}


