package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Properties {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

	    java.util.Properties prop=new java.util.Properties();//1.Properties is a class of java
		FileInputStream fis=new FileInputStream
		("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo"
		+ "\\src\\main\\java\\PropertiesFile\\"
		+ "Config.properties");//2.FileInputStream is a class of java where we have to put location of properties
	    prop.load(fis);//3.this load method will load the properties file.
	    
	    System.out.println(prop.getProperty("browser"));
	    System.out.println(prop.getProperty("username"));
	    System.out.println(prop.getProperty("pwd"));
	    System.out.println(prop.getProperty("hyper"));
	    
	    String browserName=prop.getProperty("browser");
	    
	    if(browserName.equalsIgnoreCase("chromee"))
	    {
	    System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(prop.getProperty("url"));
	    driver.manage().window().maximize();
	    }
	    else
	    {
	    	System.out.println("Browser not defined");
	    }
	    
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.id(prop.getProperty("firstnameid"))).sendKeys(prop.getProperty("firstname"));
	    driver.findElement(By.id(prop.getProperty("surnameid"))).sendKeys(prop.getProperty("surname"));
	    driver.findElement(By.id(prop.getProperty("emailid"))).sendKeys(prop.getProperty("email"));
	    driver.findElement(By.id(prop.getProperty("ReEnterEmailid"))).sendKeys(prop.getProperty("ReEnterEmail"));
	    driver.findElement(By.id(prop.getProperty("passwordid"))).sendKeys(prop.getProperty("password"));
	    driver.findElement(By.id(prop.getProperty("genderid"))).click();
	    driver.findElement(By.id(prop.getProperty("create-account-buttonid"))).click();
	    
	    
		
	}

}
