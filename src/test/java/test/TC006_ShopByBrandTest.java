
package test;

import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import page.HomePage;

public class TC006_ShopByBrandTest extends ProjectSpecifications {

	
	@Test
	public void ShopByBrandTest() {
		
		HomePage obj = new HomePage(driver);
		obj.ShopbyBrand().selectitem();
		obj.addToCart().addToCartAssertion();

	}

}
