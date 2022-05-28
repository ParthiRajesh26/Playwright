package playwright;

import com.microsoft.playwright.*;

public class Playwright_Inspector {

	public static void main(String[] args) {

		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext context = browser.newContext();

			// Open new page
			Page page = context.newPage();

			// Go to https://www.amazon.com/
			page.navigate("https://www.amazon.com/");

			page.waitForNavigation(() -> {
				page.locator("text=DressesShop now >> div").nth(1).click();
			});

			page.locator("[aria-label=\"Search\"]").click();

			page.locator("[aria-label=\"Search\"]").fill("shorts");

			page.waitForNavigation(() -> {
				page.locator("[aria-label=\"Search\"]").press("Enter");
			});

			page.waitForNavigation(() -> {
				page.locator("text=Tommy Hilfiger Women's Logo Bike Short").click();
			});

		}
	}

}
