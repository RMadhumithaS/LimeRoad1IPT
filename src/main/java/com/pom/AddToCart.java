package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
public WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/main/div/div/div[1]/div[2]/div[1]/div[2]/div/div[3]/div[1]/div/div")
	private WebElement shirt;
	
	public WebElement getShirt() {
		return shirt;
	}
	
	@FindBy(xpath = "//img[@alt='Time To Dress Her Up']")
			private WebElement dressher;
	
	public WebElement getDressher() {
		return dressher;
	}
	
	@FindBy(xpath = "//img[@alt='cream cotton blend casual shirt']")
	private WebElement creamycotton;
	
	public WebElement getCreamycotton() {
		return creamycotton;
	}
	
	@FindBy(xpath = "//span[text()=' 40 ']")
	private WebElement size;
	
	public WebElement getSize() {
		return size;
	}

	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement addtocart;
	
	public WebElement getAddtocart() {
		return addtocart;
	}
	
	public AddToCart(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}


}
