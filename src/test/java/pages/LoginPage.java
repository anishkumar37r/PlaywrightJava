package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
	
	private Page page;
	
//	private final String usernameTextbox = "getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(\"Username\"))";
//	
//	private final String passwordTextbox = "getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(\"Password\"))";
//	
//	private final String loginButton = "getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(\"Login\"))";
	
	
	private final String usernameTextbox = "input[name='username']";
	private final String passwordTextbox = "input[name='password']";
	private final String loginButton = "button[type='submit']";
	
	
	public LoginPage(Page page) {
		this.page = page;
	}
	
	public void addUsername(String password) {
		
		
		page.fill(usernameTextbox, password);
	}

	
	public void addpassword(String username) {
		
		
		page.fill(passwordTextbox, username);
	}
	
	public void clickLoginButton() {
		
		
		page.click(loginButton);
		
		
	}
	
	
}
