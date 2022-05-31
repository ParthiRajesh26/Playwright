package playwright;

import com.microsoft.playwright.*;

public class Frames {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		Page page = browser.newPage();

		page.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		
		page.click("img[title='vehicle-registration-forms-and-templates']");
		
		
		page.frame("frame-one748593425").locator("#RESULT_TextField-8").fill("Parthi");
		
		
	}

}
