package com.resonances.utility;
import static com.resonances.utility.Keyword.driver;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Akshata 
 */
public class Keyword {
	public static RemoteWebDriver driver;
	private static final Logger LOG = Logger.getLogger(Keyword.class);
	private static final String browserName = null;
	private static final String locatorType = null;
	/**
	 * This method will launch specified browser in maximized mode
	 * @param browserName must be one of the following
	 *<ul>
	 <li>Chrome</li>
	 *<li>Firefox</li>
	 *<li>Opera</li>
	 *</ul>
	 */
	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	 if(browserName.equalsIgnoreCase("Firefox")){	
		WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
	}else if(browserName.equalsIgnoreCase("Opera"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new OperaDriver();
	}else
	{
		LOG.error("Invalid browser name: " +browserName);
	}
	LOG.info(browserName+" is launched successfully");
      new  WebDriverWait(driver, Duration.ofSeconds(30));
	}
	/**This method will launch the specified url in currently opened browser
     * 
     * @param url
     */
    public  void launchUrl(String url) {
    	driver.get(url); 
    	LOG.info("Url is launche successfully");
    }
    /**
     * This method will click on element described by {@coe locatorTpe} and {@code locatorValue}
     * @param locatoType must be one of the following:
     * <ul>
     * <li>xpath</li>
     * <li>css</li>
     * <li>id</li>
     * <li>class</li>
     * <li>name</li>
     * <li></li>
     * </ul>
     * @param locatorValue
     */
    @Deprecated
    public static  void click(String locatoType,String locatorValue) {
       getWebElement(locatoType, locatorValue) .click();
    } 
	public static void click(String locator) {
		String[] parts = locator.split("##");
		getWebElement(parts[0],parts[1]).click();;
	}
    public static void  click(By by){
    	 driver.findElement(by).click();
     }
    	@Deprecated
    	public  static void enterText(String locatorType, String locatorValue, String textToEnter) {
    	       getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
    	}
    	
		}
		public  static void enterText(String locatorType, String textToEnter) {
    		String[] parts = locatorType.split("##");
 	       getWebElement(parts[0],parts[1]).sendKeys(textToEnter);
    	}
        	  	
    	private static  getWebElement(String locatoType,String locatorValue) {
        	if(locatorType.equalsIgnoreCase("xpath")) {
        		return driver.findElement(By.xpath(locatorValue));
        	}else if(locatorType.equalsIgnoreCase("css")) {
        		driver.findElement(By.cssSelector(locatorValue));
        	}else {
        		System.err.println("Invalid locator type: "  +  locatorType);
         return null;
    	}
    	}
	
     public static  void waitFor(long duration) {
    	 try {	 
    	 Thread.sleep(duration);
    	 
    	 catch(InterruptedException e) {
    		 e.printStackTrace();
    	 }
	
}


