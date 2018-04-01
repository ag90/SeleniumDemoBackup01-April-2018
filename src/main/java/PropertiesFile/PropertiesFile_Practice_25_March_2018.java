package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesFile_Practice_25_March_2018 {
	
	WebDriver driver;

	@Test
	public void propertiesfile() throws IOException, InterruptedException{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\main\\java\\PropertiesFile\\Config_25_March_2018.properties");
		pro.load(fis);
		
		System.out.println(pro.getProperty("Url"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("passwords"));
		System.out.println(pro.getProperty("defaultUrl"));
		
		System.setProperty("webdriver.chrome.driver","C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("Url"));
		String FacebookTitle=driver.getTitle();
		System.out.println(FacebookTitle);
		
		driver.findElement(By.xpath(pro.getProperty("usernameXpath"))).sendKeys(pro.getProperty("username"));
		driver.findElement(By.xpath(pro.getProperty("passwordXpath"))).sendKeys(pro.getProperty("password"));
		Thread.sleep(4000);
		driver.quit();
		
	}

}
