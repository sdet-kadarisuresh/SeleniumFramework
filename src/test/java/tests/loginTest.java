package tests;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
    public static void main(String[] args) {

    WebDriver driver;

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/");

driver.quit();
}}
