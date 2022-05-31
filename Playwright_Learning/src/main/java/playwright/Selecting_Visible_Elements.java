package playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Selecting_Visible_Elements {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();

		page.navigate("https://amazon.com");

		List<String> texts = page.locator("a:visible").allInnerTexts();
		System.out.println(texts);
		
		System.out.println("--------------------------------------");

		List<String> links = page.locator("a:visible").allTextContents();
		System.out.println(links);

		int count = page.locator("a >> visible=true").count();
		System.out.println(count);

	}

}
