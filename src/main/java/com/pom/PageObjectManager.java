package com.pom;

import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

public class PageObjectManager extends BaseClass {
	
public WebDriver driver;
	
	private HomePage homepage;
	private AddToCart addtocart;
	
	public PageObjectManager(WebDriver driver1) {
		this.driver= driver1;
	}
	
	public HomePage getHomepage() {
		if(homepage==null) {
			homepage = new HomePage(driver);
		}
		return homepage;
	}
	public AddToCart getAddtocart() {
		if(addtocart==null) {
			addtocart = new AddToCart(driver);
		}
		return addtocart;
	}

}
