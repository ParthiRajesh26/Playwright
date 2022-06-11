package playwright;

import com.microsoft.playwright.*;

public class React_Locators {

	public static void main(String[] args) {
		
		
		
	Playwright playwright=	Playwright.create();
	
	Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		
	BrowserContext browserContext=	browser.newContext();
	
	
	Page page=browserContext.newPage();
	
	page.navigate("https://www.netflix.com/in/");
	
	
	page.locator("_react=p[name='email'] >> input").first().fill("Parthiban@Gmail.com");
	
	page.click("_react=UIMarkup[className='cta-btn-txt']");
		
		
		

	}

}
