package io.pragra.shipcarte.bdd.corefunctions.drivermanager;

import io.pragra.shipcarte.bdd.corefunctions.config.FrameworkPropertyConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

     private static DriverManager driverManager;
     private WebDriver driver;

     public DriverManager(){
          if (Browsers.CHROME.equals(FrameworkPropertyConfig.getProperty("browser.type"))){
               System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
               this.driver = new ChromeDriver();
          } else if (Browsers.FIREFOX.equals(FrameworkPropertyConfig.getProperty("browser.type"))){
               System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe");
               this.driver = new FirefoxDriver();
          } else if (Browsers.EDGE.equals(FrameworkPropertyConfig.getProperty("browser.type"))){
               System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe");
               this.driver = new EdgeDriver();
          } else if (Browsers.IE.equals(FrameworkPropertyConfig.getProperty("browser.type"))){
               System.setProperty("webdriver.ie.driver","src/drivers/IEDriverServer.exe");
               this.driver = new InternetExplorerDriver();
          } else if (Browsers.SAFARI.equals(FrameworkPropertyConfig.getProperty("browser.type"))){
               System.setProperty("webdriver.safari.driver","");
               this.driver = new SafariDriver();
          }
          else
          {
               System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
               this.driver = new ChromeDriver();
          }

     }

     public static WebDriver getInstance(){
          if(driverManager == null){
               driverManager = new DriverManager();
          }
          return driverManager.driver;
     }
}
