package Vinay123;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("register_Layer")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("inapanurthivinay");
		
		driver.findElement(By.id("email")).sendKeys("vinay123@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("vinay123");
		
		driver.findElement(By.id("mobile")).sendKeys("7032121179");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[1]/div[2]/p")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).sendKeys("C:\\Users\\INAVENKA\\Desktop\\VINAY\\INAPANURTHI VINAYAKUDU  CV.docx");
		
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/div[2]/div[7]/button")).click();
		
		
		
		
		
		
		
		
		

	}

}
