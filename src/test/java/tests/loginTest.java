package tests;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class loginTest {
    public static void main(String[] args) {

    WebDriver driver;
        WebDriverManager.chromedriver().setup();

driver=new ChromeDriver();
driver.manage().window().maximize();
        // ConfigReader.getProperty("browser");
        ConfigReader.getProperty("url");
        System.out.println(driver.getTitle());
driver.quit();


}}
