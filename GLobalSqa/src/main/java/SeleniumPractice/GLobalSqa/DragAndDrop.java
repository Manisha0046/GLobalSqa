package SeleniumPractice.GLobalSqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		/*WebElement frameElement=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frameElement);
		Actions action=new Actions(driver);
		//<img src="images/high_tatras_min.jpg" alt="The peaks of High Tatras" width="96" height="72">
		WebElement source=driver.findElement(By.xpath("//img[contains(@alt,'The peaks of High Tatras')]"));
		//<div id="trash" class="ui-widget-content ui-state-default ui-droppable">
		WebElement target=driver.findElement(By.id("trash"));
		action.dragAndDrop(source,target).build().perform();
	
		Thread.sleep(8000);
		driver.switchTo().defaultContent();*/
		//<li id="Accepted Elements" class="resp-tab-item resp-tab-active" aria-controls="tab_item-1" role="tab">Accepted Elements</li>
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement frameElement=driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(frameElement);
		WebElement draggable =driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);

		action.dragAndDrop(draggable, drop).build().perform();
	
		driver.close();
		
	}
}
