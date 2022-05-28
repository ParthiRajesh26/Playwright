package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_learning {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(
				new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();

		page.navigate("http://amazon.com");

		System.out.println(page.title());
		
		System.out.println(page.url());
		

	}

}
