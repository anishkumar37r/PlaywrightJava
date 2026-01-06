package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest{
	
	  @Test
	  public void loginTest1() {
		  
		  
		LoginPage loginpage = new LoginPage(page);  
		HomePage homepage = new HomePage(page);   
		
		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("Adding username");
		loginpage.addUsername("Admin");
		
		test.info("Adding password");
		loginpage.addpassword("admin123");
		
		test.info("Clicking login button");
		loginpage.clickLoginButton();
		
		test.info("checking homepage");
//		homepage.clickTimeLink();
		
		
		
//	    page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
//	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
//	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	  }
	  
	  @Test
	  public void loginTest2() {
		  
		  
		LoginPage loginpage = new LoginPage(page);  
		HomePage homepage = new HomePage(page);   
		
		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("Adding username");
		loginpage.addUsername("Admin");
		
		test.info("Adding password");
		loginpage.addpassword("admin123");
		
		test.info("Clicking login button");
		loginpage.clickLoginButton();
		
		test.info("checking homepage");
		homepage.clickTimeLink();
	  

	  }
	  
	  @Test
		public void loginTest3() {
			
			test.skip("Skipping this test");
			throw new SkipException("Skipping this test");
		}
	  
	  
	  
}
