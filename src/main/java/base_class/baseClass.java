package base_class;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public 	static WebDriver driver;
	public static void browserlaunch() {
		driver = new ChromeDriver();
	}
	public static void geturl(String url) {
		driver.get(url);
		
	}
	
	
	
	public static void maximise() {
		driver.manage().window().maximize();
		
	}
	
	public static void implisityWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
	}
	public static void toMaximize() {
		driver.manage().window().maximize();
	}


}
