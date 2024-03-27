
package test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import page.HomePage;

public class TC007_LinkIsNotBrokenTest extends ProjectSpecifications{
	
	@Test
	public void LinkIsNotBrokenTest() throws IOException {
		
		HomePage obj = new HomePage(driver);
		obj.linkstatuscheck("https://www.bestbuy.com/");

	}

}
