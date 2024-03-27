
package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import page.HomePage;

public class TC002_LoginTest extends ProjectSpecifications {
	
	@BeforeTest
	public void setup() {
		excelFile = "Excel";
		excelSheet = 1;
		
	}

	
	@Test(dataProvider = "readExcel")
	public void LoginTest(String email, String password, String firstname) {
		
		HomePage obj = new HomePage(driver);
		obj.login().email(email).password(password).submit(firstname);

	}

}
