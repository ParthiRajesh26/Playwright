package playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.*;

public class Automatic_Login {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext browserContext = browser.newContext();

		Page page = browserContext.newPage();

		page.navigate("https://opensource-demo.orangehrmlive.com/");
		
		
		page.fill("#txtUsername", "Admin");
		page.fill("#txtPassword", "admin123");
		page.click("#btnLogin");
		
		
		
		browserContext.storageState
		(new BrowserContext.StorageStateOptions().setPath(Paths.get("AppLogin.json")));
		
		
		
		
		
		
		
		
		
		
		

	}

}
