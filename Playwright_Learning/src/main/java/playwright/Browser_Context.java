package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Browser_Context {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext bc1 = browser.newContext();
		Page page = bc1.newPage();
		page.navigate("https://opensource-demo.orangehrmlive.com/");

		page.fill("#txtUsername", "Admin");
		page.fill("#txtPassword", "admin123");

		page.locator(".button").click();

		BrowserContext bc2 = browser.newContext();
		Page page2 = bc2.newPage();
		
		
		page2.navigate("https://www.google.com");
		
		page2.fill("input[name='q']", "Parthiban");
		
	

	}

}
