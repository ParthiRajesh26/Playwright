package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class frames2 {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();

		page.navigate("http://www.leafground.com/pages/frame.html");
		
		
		page.frameLocator("iframe[src='page.html']").frameLocator("iframe[src='nested.html']")
		.locator("#Click1").click();

		String text=page.frameLocator("iframe[src='page.html']").frameLocator("iframe[src='nested.html']")
		.locator("#Click1").textContent();
		
		System.out.println(text);
		
		
		
	}

}
