package com.util.constans;

import static com.resonances.utility.Keyword.click;

public interface Locator {
	String  homeScreen_ClosePopupBtn ="Xpath##//button[contains(text(),'x')]";
	String homeScreen_travelLink ="Xpath##//a[contains(@href,'travel/fli'";
	String homrScreen_FromCity ="Xpath##//label[contains(text(),'From')]/parent::div";
    String homeScreen_searchTxtBx ="Xpath##input[placeholder='Search for products, brands and more']";
    String homeScreen_fromCity_BOM ="Xpath##//label[contains(text(),'From')]/parent::div/following-sibling::div/descendant::div[contains(text(),'BOM')]";
    		
}
