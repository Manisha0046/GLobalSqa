package SeleniumPractice.GLobalSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://www.globalsqa.com/demo-site/tooltip/");
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,500)","");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//<img src="images/st-stephens.jpg" alt="St. Stephen's Cathedral" class="ui-corner-all">
		
		Actions action=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//img[@class='ui-corner-all']"));
		action.moveToElement(target).build().perform();
		
		String tooltiptext=target.getAttribute("title");
		System.out.println("Tool tip text is"+ tooltiptext);
		
	}

}
