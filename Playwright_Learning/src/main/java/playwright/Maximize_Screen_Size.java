package playwright;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.*;

public class Maximize_Screen_Size {

	public static void main(String[] args) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		int height = (int) screenSize.getHeight();
		int width = (int) screenSize.getWidth();
		
		System.out.println(width+":"+ height);

		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext browcontxt = browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));

		Page page = browcontxt.newPage();

		page.navigate("http://www.amazon.com");

	}

}
