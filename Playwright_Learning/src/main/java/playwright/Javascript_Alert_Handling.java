package playwright;

import com.microsoft.playwright.*;

public class Javascript_Alert_Handling {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext browContxt = browser.newContext();

		Page page = browContxt.newPage();
		
		
		page.onDialog(dialog-> {
			
		String text=dialog.message();
		System.out.println(text);
		dialog.accept("Parthiban is a software Engineer");
		//dialog.dismiss();
			
			
		});

		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");

		page.click("//button[text()='Click for JS Alert']");

		String txt = page.textContent("#result");

		System.out.println(txt);

		page.click("//button[text()='Click for JS Confirm']");

		String txt1 = page.textContent("#result");

		System.out.println(txt1);

		page.click("//button[text()='Click for JS Prompt']");

		String txt2 = page.textContent("#result");

		System.out.println(txt2);
		
		
		page.close();
		browser.close();
		playwright.close();

	}

}
