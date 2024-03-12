package com.qa.HIS.BrowserCompatibility_HIS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.BasePage;
import com.qa.pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	public static WebDriver driver;
	public Page page;
	public static Properties prop;
	public String strAbsolutepath = new File("").getAbsolutePath();
	String outputDirectory;
util utilobj=new util();
	public static String Browsername;
	
	public CrossBrowser() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("./src/main/java/com/qa/config/config.properties");

			prop.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		Browsername=browser;
		System.out.println(Browsername);
		if(browser.equalsIgnoreCase("Firefox")){
			//create firefox instance
			System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
//			FirefoxOptions options=new FirefoxOptions();
//			disableImageFirefox(options);options
			
			driver = new FirefoxDriver();

		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("Chrome")){
			//set path to chromedriver.exe
           ChromeOptions opt = new ChromeOptions();
           opt.addArguments("start-maximized");
           opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			opt.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			WebDriverManager.chromedriver().version("2.40").setup();
			
//			 System.out.println("Browser Name is : "+((RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase());
//		        System.out.println("Browser Version is : "+((RemoteWebDriver) driver).getCapabilities().getVersion().toString());
//		        System.out.println("Platform Name is : "+((RemoteWebDriver) driver).getCapabilities().getPlatform().toString());
			//create chrome instance
			
		//	System.setProperty("webdriver.chrome.driver", "D:\\Script\\BrowserCompatibility_HIS\\driver\\chromedriver.exe");
			driver = new ChromeDriver(opt);//opt
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					//set path to Edge.exe
					EdgeOptions opt=new EdgeOptions();
					opt.addArguments("start-maximized");
					System.setProperty("webdriver.edge.driver","D:\\Script\\BrowserCompatibility_HIS\\driver\\msedgedriver.exe");
					//create Edge instance
					driver = new EdgeDriver(opt);
//					 System.out.println("Browser Name is : "+((RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase());
//				        System.out.println("Browser Version is : "+((RemoteWebDriver) driver).getCapabilities().getVersion().toString());
//				        System.out.println("Platform Name is : "+((RemoteWebDriver) driver).getCapabilities().getPlatform().toString());
				}
				else if(browser.equalsIgnoreCase("Opera")){
					//set path to opera.exe
					OperaOptions opt=new OperaOptions();
					opt.addArguments("start-maximized");
					
					System.setProperty("webdriver.opera.driver","D:\\Script\\BrowserCompatibility_HIS\\driver\\operadriver.exe");
					//create Opera instance
					driver = new OperaDriver(opt);
//					 System.out.println("Browser Name is : "+((RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase());
//				        System.out.println("Browser Version is : "+((RemoteWebDriver) driver).getCapabilities().getVersion().toString());
//				        System.out.println("Platform Name is : "+((RemoteWebDriver) driver).getCapabilities().getPlatform().toString());
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
				
				//driver.get(prop.getProperty("url"));
	
				driver.get(prop.getProperty("Stagingurl"));
				
	page = new BasePage(driver);
	
	

		}
	
	public void disableImageFirefox(FirefoxOptions options) {
		// TODO Auto-generated method stub
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("permissions.default.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);
	}

	public String getbrowsername() {
		return Browsername;
		
	}
	@AfterTest
	public void closeBrowser() {
	//	driver.quit();
	}
	
	@AfterClass
	public void closeBrowsers() {
		driver.quit();
	}
		
}
	

