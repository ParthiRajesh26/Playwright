package playwright;

import java.nio.file.Paths;
import com.microsoft.playwright.*;

public class Automatic_Login_2 {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext browserContext =	browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("AppLogin.json")));
		
		
		Page page=browserContext.newPage();
		
		page.navigate("https://opensource-demo.orangehrmlive.com/");

	}

}
