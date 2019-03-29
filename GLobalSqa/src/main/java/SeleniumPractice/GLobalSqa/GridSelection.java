package SeleniumPractice.GLobalSqa;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridSelection {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//<li id="Grid Selection" class="resp-tab-item resp-tab-active" aria-controls="tab_item-1" role="tab">Grid Selection</li>
		WebDriverWait wait=new WebDriverWait(driver,100);
	
		driver.get("http://www.globalsqa.com/demo-site/select-elements/#Grid%20Selection");
		WebElement link=driver.findElement(By.xpath("//li[text()='Grid Selection']"));
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,-60)","");
		wait.until(ExpectedConditions.elementToBeClickable(link));
		link.click();
		
		//<li class="ui-state-default ui-selectee">1</li>
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();
		WebElement target1=driver.findElement(By.xpath("//li[text()='1']"));
		action.click(target1).build().perform();
	
		driver.findElement(By.xpath("//li[text()='2']")).click();
		driver.findElement(By.xpath("//li[text()='3']")).click();

		
		driver.close();
		
		
	}

}
