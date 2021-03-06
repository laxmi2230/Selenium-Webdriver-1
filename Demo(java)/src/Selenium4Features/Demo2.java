package Selenium4Features;

import java.awt.AWTException;
import java.util.Date;
//import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
//import org.openqa.selenium.logging.LogType;
public class Demo2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\drivers2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        // Loading URL
	        driver.get("http://www.youtube.com/");
	        Thread.sleep(7500);
	        LogEntries logEntries = driver.manage().logs().get("browser");
	        for (LogEntry entry : logEntries) {
	        	System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	        	String errorLogType= entry.getLevel().toString();
	        	String errorLog= entry.getMessage().toString();
	        	if(errorLog.contains("404")){
	        	System.out.println("Error LogType: "+ errorLogType+" Error Log message: "+errorLog); 
	        	} 
	        	}
	        driver.close();
	}
}
