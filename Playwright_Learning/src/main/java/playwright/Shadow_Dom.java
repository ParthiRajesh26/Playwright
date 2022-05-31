package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Shadow_Dom {

	public static void main(String[] args) {
		
		
	Playwright playwright=	Playwright.create();
	
	Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	
		Page page=browser.newPage();
		
//		page.navigate("https://books-pwakit.appspot.com/");
//		
//		
//		
//		page.locator("book-app[apptitle='BOOKS'] #input").fill("Parthiban");
//		
//		String text=page.locator("book-app[apptitle='BOOKS'] p").textContent();
//		
//		System.out.println(text);
		
		
		
		
		page.navigate("https://selectorshub.com/xpath-practice-page/");
		
		
		page.frameLocator("#pact").locator("#snacktime #tea").fill("I like Masala Tea");
		
		
		page.frameLocator("#pact").locator("#snacktime #pizza").fill("Biryani");
		
		
		
		
		
		

	}

}
