package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile_Practice_22_March_2018 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\main\\java\\PropertiesFile\\Config.properties");
		pro.load(fis);
		
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("hyper"));
		System.out.println(pro.getProperty("pwd"));
		
		
		String browserName =pro.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chromee"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get(pro.getProperty("url"));
			 driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Browser is not defined becuase browser key-value is different");
		}
		
		
		
		
	     
	     System.out.println(driver.getTitle());
	     Thread.sleep(2000);
	     driver.findElement(By.id(pro.getProperty("firstnameid"))).sendKeys(pro.getProperty("firstname"));
	     Thread.sleep(2000);  
	     driver.findElement(By.id(pro.getProperty("surnameid"))).sendKeys(pro.getProperty("surname"));
	     Thread.sleep(2000);   
	     driver.findElement(By.id(pro.getProperty("emailid"))).sendKeys(pro.getProperty("email"));
	     Thread.sleep(2000);   
	     driver.findElement(By.id(pro.getProperty("ReEnterEmailid"))).sendKeys(pro.getProperty("ReEnterEmail"));
	     Thread.sleep(2000);   
	     driver.findElement(By.id(pro.getProperty("passwordid"))).sendKeys(pro.getProperty("password"));
	     Thread.sleep(2000);   
	     driver.findElement(By.id(pro.getProperty("genderid"))).click();
	     Thread.sleep(2000);  
	     driver.findElement(By.id(pro.getProperty("create-account-buttonid"))).click();
		

	}


}

