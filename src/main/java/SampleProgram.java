import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\INAVENKA\\eclipse-workspace\\SeleniumFirst\\driver\\msedgedriver.exe");

		//Creating an object of EdgeDriver
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		

	}

}
