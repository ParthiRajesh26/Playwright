package playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Recording_Video {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext browserContext = browser
				.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("MyVideos/")));

		Page page = browserContext.newPage();

		page.navigate("https://opensource-demo.orangehrmlive.com/");

		page.fill("#txtUsername", "Admin");
		page.fill("#txtPassword", "admin123");
		page.click("#btnLogin");

		browserContext.close();
		page.close();
		playwright.close();

	}

}
