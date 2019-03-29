package SeleniumPractice.GLobalSqa;

import java.awt.AWTException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selection {
	
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions action=new Actions(driver);
		//action.keyDown(Keys.CONTROL).build().perform();

		//<li class="ui-widget-content ui-selectee ui-selected">Item 1</li>
		WebElement target1=driver.findElement(By.xpath("//li[text()='Item 1']"));
		 action.clickAndHold(target1).build().perform();
		 
		 WebElement target2=driver.findElement(By.xpath("//li[text()='Item 2']"));
		 action.clickAndHold(target2).build().perform();
		 
		 WebElement target3=driver.findElement(By.xpath("//li[text()='Item 3']"));
		 action.clickAndHold(target3).build().perform();
		 
	}

}
