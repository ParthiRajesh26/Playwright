package playwright;

import com.microsoft.playwright.*;

public class Web_Table {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext browserContext = browser.newContext();

		Page page = browserContext.newPage();

		/*
		 * page.navigate(
		 * "https://datatables.net/extensions/select/examples/initialisation/checkbox.html"
		 * );
		 * 
		 * 
		 * Locator rows=page.locator("table#example tr");
		 * 
		 * rows.locator(":scope", new Locator.LocatorOptions()
		 * .setHasText("Angelica Ramos")).locator(".select-checkbox").click();
		 * 
		 * 
		 * rows.locator(":scope",
		 * null).allInnerTexts().forEach(s->System.out.println(s));
		 */

		page.navigate("https://primefaces.org/primeng/table");

		Locator rows = page.locator("table#pr_id_2-table tr");

		rows.locator(":scope", new Locator.LocatorOptions().setHasText("Art Venere"))
				.locator(".p-checkbox-box.p-component").click();
		
		
		rows.locator(":scope").allInnerTexts().stream().forEach(s->System.out.println(s));

	}

}
