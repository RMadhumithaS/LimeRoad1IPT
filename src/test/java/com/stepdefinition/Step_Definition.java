package com.stepdefinition;

import com.Base.BaseClass;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;

public class Step_Definition extends BaseClass {
	
	//public WebDriver driver = Test_Runner.driver;
	
		PageObjectManager pom = new PageObjectManager(driver);
		
		@Given("User launch the url {string}")
		public void user_launch_the_url(String string) {
			launchurl(string);
			
		}
		
		@Given("User Click on Shop Men and it navigates to men page")
		public void user_click_on_shop_men_and_it_navigates_to_men_page() throws InterruptedException {
			pom.getHomepage().getHome_page().click();
			Thread.sleep(50000);
		}
		
		@Given("User click on Shirt icon")
		public void user_click_on_shirt_icon() throws InterruptedException {
		    pom.getAddtocart().getShirt().click();
		    Thread.sleep(50000);
		}
		
		@Given("User selects Celeb On Trend Train")
		public void user_selects_celeb_on_trend_train() throws InterruptedException {
		    pom.getAddtocart().getDressher().click();
		    Thread.sleep(50000);
		}
		
		@Given("User picks Red Solid Casual Shirt")
		public void user_picks_red_solid_casual_shirt() throws InterruptedException {
		    pom.getAddtocart().getCreamycotton().click();
		    Thread.sleep(50000);
		}
		
		@Given("User Selects the size of the shirt")
		public void user_selects_the_size_of_the_shirt() throws InterruptedException {
		    pom.getAddtocart().getSize().click();
		    Thread.sleep(50000);
		}
		
		@Given("User click on Add to cart")
		public void user_click_on_add_to_cart() {
		    pom.getAddtocart().getAddtocart().click();
		}


}
