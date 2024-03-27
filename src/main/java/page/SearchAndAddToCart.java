package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecifications;



public class SearchAndAddToCart extends ProjectSpecifications{
	
	@FindBy(id = "gh-search-input")
	WebElement searchbar;
	
	@FindBy(className = "header-search-button")
	WebElement searchbutton;
	
	@FindBy(xpath = "(//button[text()='Add to Cart'])[4]")
	WebElement addtocart;
	
	public SearchAndAddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SearchAndAddToCart search(String searchtext) {
		sendkeys(searchbar, searchtext);
		click(searchbutton);
		driver.findElement(By.xpath("//a[text()='Samsung - Geek Squad Certified Refurbished Galaxy S23 Ultra 256GB (Unlocked) - Green']")).click();
		return this;
	}

}