package playwright;

import java.util.List;

import com.microsoft.playwright.*;

public class Locators {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();

		page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// page.locator("text=Contact Sales").click();
		// page.locator("'Contact Sales'").click();

		// page.locator("'Privacy Policy'").first().click();
		// page.locator("'Privacy Policy'").last().click();

		List<String> countries = page.locator("#Form_submitForm_Country option").allInnerTexts();

		System.out.println(countries.size());
		
//		for (String c : countries) {
//
//			System.out.println(c);
//			
//
//		}
		
		
	  //countries.forEach(c-> System.out.println(c));
	  
	  
	  
	  for(int i=0; i< countries.size();i++) {
		  
		  
		System.out.println(countries.get(i));
		  
		  
	  }
	  
	  
	  
	  
	  

	}

}
