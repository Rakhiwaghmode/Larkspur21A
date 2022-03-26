package com.resonances.traveltests;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.resonance.config.BaseFrameWork;
import com.resonances.utility.Keyword;
import com.resonances.utility.PropUtil;
import com.util.constans.Locator;
import static com.resonances.utility.Keyword.*;
/**
 * 
 * @author Mayur
 *
 */
public class Travel extends BaseFrameWork {
	private static final Logger LOG = Logger.getLogger(Travel.class);
	@Test
	public void verifyErrorOnSelectingSameCitiesAsSourecAndDestination() {
		waitFor(3000);
		click(Locator.homeScreen_ClosePopupBtn);
        click(Locator.homeScreen_travelLink);
        waitFor(5000);
        click(Locator.homrScreen_FromCity);
        waitFor(2000);
        LOG.info("clicked on From city dropdown");
        click(Locator.homeScreen_fromCity_BOM);	    
        LOG.info("Selected Bombay as from city");
	}
	@Test
	public  void verifySearchResultsForShoes() {
		enterText(Locator.homeScreen_searchTxtBx,"Shoes");
	}
	@Test
	public void m1() {
		System.out.println("My Test case");
	}
}

