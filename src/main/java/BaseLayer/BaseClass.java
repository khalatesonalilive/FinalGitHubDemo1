package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseClass {
    public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;
	
	public BaseClass()
	{
		
	File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigurationLayer\\FaceBook.properties");
	
	try {
		 fis=new FileInputStream(f);
		  prop=new Properties();
		  try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public static void initialization(String browserName) {
	    
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (browserName.equalsIgnoreCase("incognito"))
		{
			EdgeOptions opt=new EdgeOptions();
			opt.addArguments("--incognito");
			driver=new EdgeDriver(opt);
		}
		else if(browserName.equalsIgnoreCase("headless"))
		{
			EdgeOptions opt=new EdgeOptions();
			opt.addArguments("--headless");
			driver=new EdgeDriver(opt);
		}
		else
		{
			System.err.println("please enter valid browserName");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
	}
	
}
