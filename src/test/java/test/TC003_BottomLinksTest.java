package test;

import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import page.HomePageBottonLinks;



public class TC003_BottomLinksTest extends ProjectSpecifications{

	
	@Test
	public void BottomLinksTest() {
		
		HomePageBottonLinks obj = new HomePageBottonLinks(driver);
		obj.bottomlink();

	}

}