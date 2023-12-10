package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","C:\\chromebrowser\\chromedriver_win32 (1)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   
  driver.get("https://web.whatsapp.com/");
	}
}