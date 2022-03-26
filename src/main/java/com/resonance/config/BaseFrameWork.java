package com.resonance.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.resonances.utility.Keyword.*;
import com.resonances.utility.Keyword;

public class BaseFrameWork {
	@BeforeMethod
	public void Setup(){
		Keyword.openBrowser("Chrome");
		launchUrl("https://www.flipkart.com");
	}
		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
