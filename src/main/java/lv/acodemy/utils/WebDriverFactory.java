package lv.acodemy.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    private static final ThreadLocal<WebDriver> webDriver = ThreadLocal.withInitial(ChromeDriver::new);

    public static WebDriver getWebDriver(){
        return webDriver.get();
    }

    public static void quitDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }
}
