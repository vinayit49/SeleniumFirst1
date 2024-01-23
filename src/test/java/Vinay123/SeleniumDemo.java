package Vinay123;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\INAVENKA\\eclipse-workspace\\SeleniumFirst\\driver\\chromedriver.exe");
         WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("http://rediffmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Rediffmail")).click();
		driver.findElement(By.id("login1")).sendKeys("vinayit49@gmail.com");
		driver.findElement(By.id("password")).sendKeys("8500736074");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println("toatal links:" +alllinks.size());
		
		
		List<WebElement> allimg=driver.findElements(By.tagName("a"));
		System.out.println("toatal images:" +allimg.size());
		
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.findElement(By.id("txtlogin")).sendKeys("vinayit49@gmail.com");
		
		driver.findElement(By.name("next")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("High Commission rejects reports of Mahinda, family fleeing to India")).click();
		
	
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();
		
		
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		
		
	}

}
